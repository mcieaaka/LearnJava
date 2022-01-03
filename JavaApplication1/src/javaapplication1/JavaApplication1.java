/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HARSHIT
 */
import java.sql.*;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","Password");
        PreparedStatement statement = con.prepareStatement("select * from ebill where month_name='march 2021'");
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            System.out.println("Sucess");
            System.out.println(rs.getString(3));
        }
        // TODO code application logic here
    }
    
}
