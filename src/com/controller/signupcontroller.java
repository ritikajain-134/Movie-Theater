
package com.controller;

import com.database.Database_Connection;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.support.GetFXML;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;


public class signupcontroller implements Initializable {

    @FXML
    private JFXTextField name_textfield;
    @FXML
    private JFXTextField phone_textfield;
    @FXML
    private JFXTextField email_textfield1;
    @FXML
    private JFXTextField password_textfield;
    @FXML
    private JFXPasswordField conform_password_field;
    @FXML
    private Button signup_button;
    @FXML
    private Button cancel_button;

   
    private void emptyValidation() {
        if (name_textfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill All Data...");
        } else if (phone_textfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill All Data...");
        } else if (email_textfield1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill All Data...");
        } else if (password_textfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill All Data...");
        } else if (password_textfield.getText().equals(conform_password_field.getText())) {
            setData();
        } else {
            JOptionPane.showMessageDialog(null, "Both password Not Match Fill Again...");
        }
    }

    private void setData() {
        try {
            Database_Connection db = new Database_Connection();
            db.insertQuiry(name_textfield.getText(), phone_textfield.getText(), email_textfield1.getText(), password_textfield.getText());
            JOptionPane.showMessageDialog(null, "Sign Up SucessFully Done !!!");
            Pane pane = new GetFXML().getPane("login");
            loginmaincontroller.Borderpane.setCenter(pane);
        } catch (SQLException ex) {
            Logger.getLogger(signupcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void signupClick(ActionEvent event) {
        emptyValidation();
    }

    @FXML
    private void cancelClick(ActionEvent event) {
        System.exit(0);
    }

}
