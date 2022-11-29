/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.controller;

import com.database.Database_Connection;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class logincontroller implements Initializable {
    
    @FXML
    private JFXTextField phone_textfield;
    @FXML
    private JFXPasswordField password_field;
    @FXML
    private Button loginbutton;
    @FXML
    private Button cancelbutton;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        phone_textfield.setStyle("color: white");
    }
    
    @FXML
    private void loginClick(ActionEvent event) {
//            backgroundcontroller.node_main.getChildren().clear();
//            ObservableList list = backgroundcontroller.node_main.getChildren();
//            list.add(pane);
        Database_Connection db;
        db = new Database_Connection();
        if (db.loginCheck(phone_textfield.getText(), password_field.getText())) {
            //                backgroundcontroller.progresspane_main.setVisible(true);
            new Main_stageController().refresh("flashScreen");
//                backgroundcontroller.progresspane_main.setVisible(false);
//                Pane pane = new GetFXML().getPane("categiry main");
//                backgroundcontroller.centerblock_main.setCenter(pane);
//            //            backgroundcontroller.node_main;
//            //            backgroundcontroller.centerblock_main.setCenter(pane);
        }
    }
    
    @FXML
    private void cancelClick(ActionEvent event) {
        System.exit(0);
    }
    
}
