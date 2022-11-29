///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.database;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// *
// * @author Kunal
// */
//public class SeatInisilation {
//
//    Database_Connection db = new Database_Connection();
//
//    public ResultSet Seatinitialisation() throws SQLException {
//        String url = "select `set_number` from setenrollement";
//        ResultSet rs = db.stmt.executeQuery(url);
//        return rs;
//    }
//
//    public PreparedStatement setUserData() throws SQLException {
//        String url = "INSERT INTO `setenrollement` (`user name`, `user sirname`, `user number`, `amount`, `set_number`) VALUES (?,?,?,?,?)";
//        PreparedStatement ps = db.con.prepareCall(url);
//       return ps;
//    }
//}
