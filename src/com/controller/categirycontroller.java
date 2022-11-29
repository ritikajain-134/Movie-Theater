package com.controller;

import com.jfoenix.controls.JFXButton;
import com.support.PosterData;
import com.support.getImagesData.GetImages;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;


public class categirycontroller implements Initializable {

    @FXML
    private GridPane grid;
    static List<PosterData> images;
    private JFXButton actionbutton;
    @FXML
    private JFXButton newbutton;

    
    private void setData(List<PosterData> temp) {
        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < temp.size(); i++) {
                System.out.println(temp.get(i).getPath());

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/views/item.fxml"));
                Pane pane = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setdata(temp.get(i));

                if (column == 5) {
                    column = 0;
                    row++;
                }
                grid.add(pane, column++, row);
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(pane, new Insets(10));
            }
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        images = GetImages.getStartimages();
//        System.out.println("Done");
        setData(images);

//System.out.println(images.isEmpty());
//        System.out.println("get temp");
    }

    private void setColor(Button button) {

        button.setStyle("-fx-background-color : #C9D5DE");
//        commedypane.setStyle("-fx-background-color : #C9D5DE");
////        commedypane.setStyle("-fx-background-radius : 50");
//
//        horrerpane.setStyle("-fx-background-color : #C9D5DE");
//        advancherpane.setStyle("-fx-background-color : #C9D5DE");
//        actionpane.setStyle("-fx-background-color : #C9D5DE");
//        mysterypane.setStyle("-fx-background-color : #C9D5DE");
//        crimepane.setStyle("-fx-background-color : #C9D5DE");
//        romancepane.setStyle("-fx-background-color : #C9D5DE");
//        dramapane.setStyle("-fx-background-color : #C9D5DE");
//
//        pane.setStyle("-fx-background-color : #4D5F7F");
    }

    @FXML
    private void horrerbuttonclick(ActionEvent event) throws FileNotFoundException {
        images = GetImages.getHorrorImages();
        setData(images);

    }

    @FXML
    private void dramabuttonclick(ActionEvent event) {
        images = GetImages.getDramaImages();
        setData(images);
    }

    @FXML
    private void crimebuttonclick(ActionEvent event) {
        images = GetImages.getCrimeImages();
        setData(images);
    }

    @FXML
    private void advancherbuttonclick(ActionEvent event) {
        images = GetImages.getAdvancherImages();
        setData(images);
    }

    @FXML
    private void actionbuttonclick(ActionEvent event) {
        images = GetImages.getActionImages();
        setData(images);
    }

    @FXML
    private void mysterybuttonclick(ActionEvent event) {
        images = GetImages.getMesteryimages();
        setData(images);

    }

    @FXML
    private void romancebuttonclick(ActionEvent event) {
        images = GetImages.getRomaceImages();
        setData(images);
    }

    @FXML
    private void commedybuttonclick(ActionEvent event) {
        images = GetImages.getCommedyimages();
        setData(images);
    }

}
