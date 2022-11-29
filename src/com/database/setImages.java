///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.database;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
////import javafx.scene.image.Image;
//
///**
// *
// * @author Kunal
// */
//public class setImages {
//
//    List<String> temp = new ArrayList<>();
//    Image image;
//
//    public List<String> setImages() {
//
//        String url = "select `poster_path` from movies_data limit 10";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//           
//            while (rs.next()) {
//                String path = rs.getString("poster_path");
//                temp.add(path);
//
//                image = new Image(rs.getString("poster_path"));
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;             
//    }
//
//    public List setimagescommedy() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Comedy%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                String path = rs.getString("poster_path");
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagesdrama() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Drama%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                String path = rs.getString("poster_path");
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimageshorror() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Horror%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagescrime() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Crime%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagesadvencher() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Adventure%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagesmestry() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Mystery%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagesaction() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Action%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public List setimagesromance() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Romance%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                   String path = rs.getString("poster_path");             
//                temp.add(path);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//}
