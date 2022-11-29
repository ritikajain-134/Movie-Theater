/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.jfoenix.controls.JFXButton;
import com.support.GetFXML;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;


public class ticketseatcontroller implements Initializable {

    @FXML
    private GridPane gridleft;
    @FXML
    private GridPane gridright;
    @FXML
    private GridPane gridbase;
    public Label SeatCount;
    @FXML
    private JFXButton seatbook;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    void setRightSeat(GridPane grid) {
        int column = 0;
        int row = 1;
        int count = 0;
        try {
            for (int i = 0; i < 42; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/views/seat.fxml"));

                Pane pane = fxmlLoader.load();

                seatcontroller seat = fxmlLoader.getController();
                count += 1;
                seat.setCount("B", count);
                if (column == 7) {
                    column = 0;
                    row++;
                }

                grid.add(pane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(pane, new Insets(6.5));
            }
        } catch (IOException e) {
        }
    }

    void setLeftSeat(GridPane grid) {
        int column = 0;
        int row = 1;
        int count = 0;
        try {
            for (int i = 0; i < 42; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/views/seat.fxml"));

                Pane pane = fxmlLoader.load();

                seatcontroller seat = fxmlLoader.getController();
                count += 1;
                seat.setCount("A", count);
                if (column == 7) {
                    column = 0;
                    row++;
                }

                grid.add(pane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(pane, new Insets(6.5));
            }
        } catch (IOException e) {
        }
    }

    void setBaseSeat(GridPane grid) {
        int column = 0;
        int row = 1;
        int count = 0;
        try {
            for (int i = 0; i < 12; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/views/seat.fxml"));

                Pane pane = fxmlLoader.load();

                seatcontroller seat = fxmlLoader.getController();
                count += 1;
                seat.setCount("C", count);

                grid.add(pane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(pane, new Insets(6));
            }
        } catch (IOException e) {
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setLeftSeat(gridleft);
        setRightSeat(gridright);
        setBaseSeat(gridbase);
    }

    @FXML
    private void seatbookonClick(ActionEvent event) {
         new Main_stageController().refresh("user details");
//        Pane pane = new GetFXML().getPane("user details");
//        backgroundcontroller.centerblock_main.setCenter(pane);
    }

    @FXML
    private void onClick(MouseEvent event) {
        new Main_stageController().refresh("dettaulsframe");
    }

}
