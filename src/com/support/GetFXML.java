/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.support;

import com.main.Main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author Kunal
 */
public class GetFXML {

    public Pane getPane(String filename) {
        System.out.println(filename);
        Pane pane = null;
        try {
            URL fileurl = Main.class.getResource("/com/views/" + filename + ".fxml");
            if (fileurl == null) {
                throw new java.io.FileNotFoundException("File Not Found");
            }
            pane = FXMLLoader.load(fileurl);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(GetFXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pane;
    }
}
