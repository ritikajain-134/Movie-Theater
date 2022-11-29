/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.support.getImagesData.GetImages;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    static GetImages getData = new GetImages();

    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("/com/views/main_stage.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("/com/views/flashScreen.fxml"));

        Scene scene = new Scene(root);
        stage.setMaximized(true);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.setFullScreen(true);
        stage.setTitle("Ticket Book");
        stage.setScene(scene);
        stage.setTitle("Project_one");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GetImages().setStartimages();
        getData.LoadData();
        launch(args);
    }

}
