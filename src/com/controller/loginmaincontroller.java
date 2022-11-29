
package com.controller;

import com.jfoenix.controls.JFXButton;
import com.support.GetFXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class loginmaincontroller implements Initializable {

    @FXML
    private JFXButton login_button;
    @FXML
    private JFXButton sign_up_button;
    @FXML
    private BorderPane mainBorderpane;
    public static  BorderPane Borderpane;

    /**
     * Initializes the controller class.
     */
    private void initialValue(String name) {
        Borderpane=mainBorderpane;
        Pane pane = new GetFXML().getPane("" + name);
        mainBorderpane.setCenter(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initialValue("login");
    }

    @FXML
    private void loginClick(ActionEvent event) {
        Pane pane = new GetFXML().getPane("login");
        mainBorderpane.setCenter(pane);
    }

    @FXML
    private void signupClick(ActionEvent event) {
        Pane pane = new GetFXML().getPane("signup");
        mainBorderpane.setCenter(pane);

    }

    @FXML
    private void cancelClick(MouseEvent event) {
        System.exit(0);
    }

}
