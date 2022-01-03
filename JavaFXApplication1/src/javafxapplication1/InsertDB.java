/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author HARSHIT
 */
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
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
/**
 *
 * @author HARSHIT
 * @throws java.lang.Exception
 */
class dbmsconnection{

    public Connection getConnection() throws Exception   
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","Password");
        return con;
    }
    public void closeConnection(Connection con,Statement stmt) throws SQLException{
        stmt.close();
        con.close();
    }
}
public class InsertDB extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Label Month = new Label ("Enter Details to DB");
        Month.setFont(Font.font("Ariel",FontWeight.BOLD,FontPosture.REGULAR,25));
        Month.setTranslateY(-200);
        Label idLabel = new Label("Bill Id ");
        TextField idField = new TextField();
        Label nameLabel = new Label("Month Name<space> Year ");
        TextField nameField = new TextField();
        Label unitLabel = new Label("Units Consumed ");
        TextField unitField = new TextField();
        btn.setText("Submit");
        idLabel.setTranslateY(-150);
        nameLabel.setTranslateY(-100);
        unitLabel.setTranslateY(-50);
        idLabel.setTranslateX(-125);
        nameLabel.setTranslateX(-125);
        unitLabel.setTranslateX(-125);
        idField.setTranslateY(-150);
        nameField.setTranslateY(-100);
        unitField.setTranslateY(-50);
        idField.setTranslateX(100);
        nameField.setTranslateX(100);
        unitField.setTranslateX(100);
        idField.setMaxWidth(250);
        nameField.setMaxWidth(250);
        unitField.setMaxWidth(250);
        StackPane root = new StackPane();
        root.getChildren().addAll(Month,idLabel,idField,nameLabel,nameField,unitLabel,unitField,btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String i=idField.getText();
                String a=nameField.getText();
                Double u=Double.parseDouble(unitField.getText());
                try{
                    dbmsconnection c1 = new dbmsconnection();
                    Connection conn = c1.getConnection();
                    PreparedStatement statement = conn.prepareStatement("Insert into ebill values(?,?,?)");
                    statement.setString(1,i);
                    statement.setString(2,a);
                    statement.setDouble(3,u);
                    int rs = statement.executeUpdate();
                    if(rs==1){
                        Label l1 = new Label("Successful Insertion");
                        l1.setTranslateY(50);
                        root.getChildren().add(l1);
                        c1.closeConnection(conn,statement);
                    }
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
