/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Database_Connection {

    public Connection con;
    public Statement stmt;
   public static boolean buttonStaatus;

    public Database_Connection() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_book", "root", "123456");
                stmt = con.createStatement();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertQuiry(String name, String phone, String emailid, String password) throws SQLException {

        String input = "INSERT INTO `user_logins`(`name`, `phone_number`, `email_id`, `PASSWORD`) VALUES ('" + name + "','" + phone + "','" + emailid + "','" + password + "')";

        stmt.execute(input);
        con.close();
    }

    public boolean loginCheck(String phone, String password) {
        try {

            String sql = "Select * from user_logins where  phone_number = '" + phone + "'and password='" + password + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "login SucessFully...");
                buttonStaatus = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Information...");
                buttonStaatus = false;
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
        return buttonStaatus;
    }

}
