/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.support.getImagesData;

import com.support.PosterData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;

/**
 *
 * @author Kunal
 */
public class LoadImagesDataBase {

    public Connection con;
    public Statement stmt;
    PreparedStatement preparedStmt;
    InputStream imges;

    public void Load() throws ClassNotFoundException, SQLException, FileNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_book", "root", "");

//        for (int i = 0; i < GetImages.getStartimages().size(); i++) {
        for (PosterData obj : GetImages.getStartimages()) {
            Image img = obj.getImage();
            FileInputStream fin;
            fin = new FileInputStream("" + img);
            String query = "UPDATE `movies_data` SET `Movie_img`= ? WHERE 1";
            preparedStmt = con.prepareStatement(query);
            preparedStmt.setBinaryStream(1, fin);
            preparedStmt.executeUpdate();
            System.out.println(img.isError());
        }

//    }
//        stmt = con.createStatement();
//        Image img = new Image("/temp/img.png");
        // create the java mysql update preparedstatement
//
////        preparedStmt.setString(2, "Fred");
        System.out.println("Update Sucessfully...");
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            new LoadImagesDataBase().Load();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoadImagesDataBase.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
