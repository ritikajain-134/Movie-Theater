package com.support.getImagesData;

import com.database.Database_Connection;
import com.support.PosterData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;

public class SetImages {

    Database_Connection db;
    static Image image;
    PosterData postor;
    int movies_count = 25;

    public SetImages() {
        this.db = new Database_Connection();
    }

    public List setImages() {
        List<PosterData> Images = new ArrayList<>();

        System.out.println(Images.isEmpty());
        String url = "select `poster_path`,`original_title` from movies_data limit " + movies_count;
        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);

            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));

                Images.add(postor);
                System.out.println("starting data add...");
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagescommedy() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Comedy%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagesdrama() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Drama%' limit " + movies_count;
        int i = 0;
        try {

            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimageshorror() {
        List<PosterData> Images = new ArrayList<>();
        System.out.println("Horror Array " + Images.isEmpty());
        System.out.println("in Sql Horror");
        String url = "SELECT * FROM movies_data where genres LIKE '%Horror%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                System.out.println(rs.wasNull());
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
            System.out.println("Hooror Filled...");
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagescrime() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Crime%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagesadvencher() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Adventure%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagesmystry() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Mystery%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagesaction() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Action%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }

    public List setimagesromance() {
        List<PosterData> Images = new ArrayList<>();
        String url = "SELECT * FROM movies_data where genres LIKE '%Romance%' limit " + movies_count;

        int i = 0;
        try {
            ResultSet rs = db.stmt.executeQuery(url);
            while (rs.next()) {
                String path = rs.getString("poster_path");
                postor = new PosterData();
                postor.setPath(path);
                image = new Image(path);
                postor.setImage(image);
                postor.setTitle(rs.getString("original_title"));
                Images.add(postor);
                i += 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Images;
    }
}
