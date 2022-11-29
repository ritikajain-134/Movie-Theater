
package com.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class FlashScreenController implements Initializable {
    
    @FXML
    private JFXButton gobutton;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    @FXML
    private void onClick(ActionEvent event) {
        try {
            gobutton.setVisible(false);
            Thread.sleep(2000);
            new Main_stageController().refresh("categiry main");
       
        } catch (InterruptedException ex) {
            Logger.getLogger(FlashScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
}
