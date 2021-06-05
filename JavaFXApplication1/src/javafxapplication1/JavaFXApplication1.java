/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.sql.*;
/**
 *
 * @author HARSHIT
 * @throws java.lang.Exception
 */
class dbmsconnection{

    public Connection getConnection() throws Exception   
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","Baribitti1!");
        return con;
    }
    public void closeConnection(Connection con,Statement stmt) throws SQLException{
        stmt.close();
        con.close();
    }
}
class pricepu{
    String unit;
    String price;
    pricepu(){}
    pricepu(String unit,String price){
        this.unit = unit;
        this.price = price;
    }
}
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Label Month = new Label ("Enter Month and Year");
        TextField tf1 = new TextField();
        Month.setTranslateY(-100);
        Month.setFont(Font.font("Ariel",FontWeight.BOLD,FontPosture.REGULAR,20));
        tf1.setTranslateY(-50);
        tf1.setMaxWidth(300);
        btn.setText("Submit");
        
        Label price = new Label ("Price Distribution");
        Label p1 = new Label("001 to 100 units – Rs. 10/unit");
        Label p2 = new Label("100 to 200 units – Rs. 20/unit");
        Label p3 = new Label("200 to 300 units – Rs. 30/unit");
        Label p4 = new Label("More than 300 units – Rs. 40/unit");
        price.setTranslateY(50);
        p1.setTranslateY(75);
        p2.setTranslateY(100);
        p3.setTranslateY(125);
        p4.setTranslateY(150);
        
        StackPane root = new StackPane();
        root.getChildren().add(Month);
        root.getChildren().add(tf1);
        root.getChildren().add(btn);
        root.getChildren().addAll(price,p1,p2,p3,p4);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String a=tf1.getText();
                root.getChildren().clear();
                try{
                    dbmsconnection c1 = new dbmsconnection();
                    Connection conn = c1.getConnection();
                    PreparedStatement statement = conn.prepareStatement("select * from ebill where month_name=?");                    
                    statement.setString(1,a);
                    ResultSet rs = statement.executeQuery();
                    rs.next();
                    Double fp;
                    Double uu = rs.getDouble(3);
                    if(uu<=100){
                        fp = uu*10.0;
                    }else if(uu>100&& uu<=200){
                        fp= uu*20.0;
                    }
                    else if(uu>200&& uu<=300){
                        fp= uu*30.0;
                    }else{
                        fp = uu*40.0;
                    }
                    String i = rs.getString(1).substring(3);
                    String r = rs.getString(1).substring(0,3);
                    int temp = Integer.parseInt(i);
                    String ss = String.valueOf(temp-1);
                    String newid = r+ss;
                    
                    PreparedStatement statement2 = conn.prepareStatement("select * from ebill where bill_id=?");
                    statement2.setString(1,newid);
                    ResultSet rs2 = statement2.executeQuery();
                    rs2.next();
                    Label l2 = new Label("Previous Month: "+rs2.getString(2)+"\tReading= "+rs.getString(3));
                    Label l1 = new Label("Month: "+rs.getString(2)+"\tBill in Rs= "+fp.toString()+"\tUnits Consumed = "+rs.getString(3));
                    l1.setFont(Font.font("Ariel",FontWeight.BOLD,FontPosture.REGULAR,20));
                    l2.setFont(Font.font("Ariel",FontWeight.BOLD,FontPosture.REGULAR,20));
                    l1.setTranslateY(-20);
                    l2.setTranslateY(20);
                    root.getChildren().addAll(l1,l2);
                    c1.closeConnection(conn,statement);                    
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Harshit 19BCE0382: Electricity Bill");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
