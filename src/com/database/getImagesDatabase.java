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
//import javafx.scene.image.Image;
//
///**
// *
// * @author Kunal
// */
//public class getImagesDatabase {
//
//    public static List<Image> initializationImages;
//    public static List<Image> CommedyImages;
//    public static List<Image> horrorImages;
//    public static List<Image> advencherImages;
//    public static List<Image> crimeImages;
//    public static List<Image> dramaImages;
//    public static List<Image> romanceImages;
//    public static List<Image> actionImages;
//    public static List<Image> mestryImages;
//
//    public getImagesDatabase() {
//        initializationImages = new ArrayList<>();
//        CommedyImages = new ArrayList<>();
//        horrorImages = new ArrayList<>();
//        advencherImages = new ArrayList<>();
//        crimeImages = new ArrayList<>();
//        dramaImages = new ArrayList<>();
//        romanceImages = new ArrayList<>();
//        actionImages = new ArrayList<>();
//        mestryImages = new ArrayList<>();
//
////      starting Initialzation...
//        setImages();
//        setimagesaction();
//        setimagesadvencher();
//        setimagescommedy();
//        setimagescrime();
//        setimagesdrama();
//        setimageshorror();
//        setimagesmestry();
//        setimagesromance();
//
//    }
//    Image image;
//
//    private void setImages() {
//
//        String url = "select `poster_path` from movies_data limit 10";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
////            System.out.println(rs.next());
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                initializationImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagescommedy() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Comedy%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                CommedyImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagesdrama() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Drama%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                dramaImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimageshorror() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Horror%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                horrorImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagescrime() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Crime%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                crimeImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagesadvencher() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Adventure%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                advencherImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagesmestry() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Mystery%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                mestryImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagesaction() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Action%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                advencherImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void setimagesromance() {
//        String url = "SELECT * FROM movies_data where genres LIKE '%Romance%' limit 15";
//
//        int i = 0;
//        try {
//            Database_Connection db = new Database_Connection();
//            ResultSet rs = db.stmt.executeQuery(url);
//            while (rs.next()) {
//                image = new Image(rs.getString("poster_path"));
//                romanceImages.add(image);
//                i += 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
