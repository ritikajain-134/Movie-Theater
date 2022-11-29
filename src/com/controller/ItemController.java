package com.controller;

import com.support.GetFXML;
import com.support.PosterData;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class ItemController implements Initializable {

    @FXML
    private AnchorPane plane;
    String mainpath;
    @FXML
    private ImageView image;
    @FXML
    private Label MoviesTitle;

  
    public void setdata(PosterData poster) {

        mainpath = poster.getPath();
//        image.setFitHeight(256);
//        image.setFitWidth(195);
        MoviesTitle.setText(poster.getTitle());
        image.setFitWidth(210);
        image.setFitHeight(256);
        image.setPreserveRatio(false);
        this.image.setImage(poster.getImage());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void onclick(MouseEvent event) {
        DetailsFramecontroller.setImagespath(mainpath);
        new Main_stageController().refresh("dettaulsframe");
//         Pane pane = new GetFXML().getPane("dettaulsframe");
//            backgroundcontroller.centerblock_main.setCenter(pane);
    }

}
