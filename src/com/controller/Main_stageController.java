package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main_stageController implements Initializable {

    @FXML
    private VBox node;
    public static VBox box;
    public static Node node_main;
    @FXML
    private Pane closebutton;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        box = node;
        refresh("loginmain");

    }

    public void refresh(String name) {
        box.getChildren().clear();
        try {
            node_main = (Node) FXMLLoader.load(getClass().getResource("/com/views/" + name + ".fxml"));
            box.getChildren().add(node_main);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void onExit(MouseEvent event) {
        closebutton.setStyle("-fx-background-color: linear-gradient(to right, #3494e6, #ec6ead)");
        closebutton.setStyle("-fx-background-radius:30");
    }

    @FXML
    private void onEntered(MouseEvent event) {
        closebutton.setStyle("-fx-background-color: linear-gradient(to right, #3494e6, #ec6ead)");
        closebutton.setStyle("-fx-background-radius:30");
    }

    @FXML
    private void onClick(MouseEvent event) {
        System.exit(0);

    }

}
