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
        StackPane root = new StackPane();
        root.getChildren().add(Month);
        root.getChildren().add(tf1);
        root.getChildren().add(btn);
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
                    Label l1 = new Label(rs.getString(1));
                    root.getChildren().addAll(l1);
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
