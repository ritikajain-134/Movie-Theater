/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class seatcontroller implements Initializable {

    @FXML
    private Label label;
    @FXML
    private AnchorPane background;
    ResultSet rs;
    static String seatNumber = "", stamp;
    @FXML
    private JFXButton buttons;
    public static int count = 0;

    /**
     * Initializes the controller class.
     */
    void setCount(String seatlabel, int count) {
        stamp = seatlabel + count;
        label.setText(stamp);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        background.setStyle("-fx-background-color : #333F54");

    }

    @FXML
    private void onClck(MouseEvent event) {
        if (!label.getText().equals("NA")) {
            seatNumber = seatNumber + " " + label.getText();
            count++;
        } else {
            count--;
        }
//        background.setStyle("-fx-background-color : Red");
//        buttonsla
        label.setText("NA");

    }

    @FXML
    private void onExited(MouseEvent event) {
        if (!label.getText().equals("NA")) {
            background.setStyle("-fx-background-color : #333F54");
        } else {
            background.setStyle("-fx-background-color : #CFDCE4");
        }

    }

    @FXML
    private void onEntered(MouseEvent event) {
        if (!label.getText().equals("NA")) {
            background.setStyle("-fx-background-color : #189D5E");
        }
    }

}
