
package com.controller;

import com.jfoenix.controls.JFXButton;
import com.support.getItemData;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class DetailsFramecontroller extends getItemData implements Initializable {

    @FXML
    private ImageView pictureimg;
    @FXML
    private Hyperlink wikipeadiaLinklabel;
    @FXML
    private Label yearofreleaselabel;
    @FXML
    private Label genreslabel;
    @FXML
    private Label runtimelable;
    @FXML
    private Label imdbvotelabel;
    @FXML
    private Label imdbratinglabel;
    @FXML
    private Label actornamelabel;
    @FXML
    private Label releasedatelabel;
    @FXML
    private Label winlabel;
    @FXML
    private Label storylabel;
    @FXML
    private Label summarylabel;
    @FXML
    private Label adultlabel;
    @FXML
    private Label picturetitle;
    @FXML
    private JFXButton bookbutton;
    public static String title;
    static String wikipidialink, imagespath, genres, strory, summary, actorename, winsnominations, realeasedate;
    static int isadult, yearofreleae, imdbvoting, runtime;
    static float imdbrating;
    ResultSet rs;

    public static void setTitle(String title) {
        DetailsFramecontroller.title = title;
    }

    public static void setImagespath(String imagespath) {
        DetailsFramecontroller.imagespath = imagespath;
    }

    public static void setRuntime(int runtime) {
        DetailsFramecontroller.runtime = runtime;
    }

    public static void setGenres(String genres) {
        DetailsFramecontroller.genres = genres;
    }

    public static void setStrory(String strory) {
        DetailsFramecontroller.strory = strory;
    }

    public static void setSummary(String summary) {
        DetailsFramecontroller.summary = summary;
    }

    public static void setActorename(String actorename) {
        DetailsFramecontroller.actorename = actorename;
    }

    public static void setWinsnominations(String winsnominations) {
        DetailsFramecontroller.winsnominations = winsnominations;
    }

    public static void setRealeasedate(String realeasedate) {
        DetailsFramecontroller.realeasedate = realeasedate;
    }

    public static void setIsadult(int isadult) {
        DetailsFramecontroller.isadult = isadult;
    }

    public static void setYearofreleae(int yearofreleae) {
        DetailsFramecontroller.yearofreleae = yearofreleae;
    }

    public static void setImdbvoting(int imdbvoting) {
        DetailsFramecontroller.imdbvoting = imdbvoting;
    }

    public static void setImdbrating(float imdbrating) {
        DetailsFramecontroller.imdbrating = imdbrating;
    }

    public static void setWikipidialink(String wikipidialink) {
        DetailsFramecontroller.wikipidialink = wikipidialink;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        setData();
    }

    @Override
    public void getData() {
        try {
            rs = getResultset(imagespath);

            if (rs.next()) {

                setTitle(rs.getString("original_title"));
                setWikipidialink(rs.getString("wiki_link"));
                setIsadult(rs.getInt("is_adult"));
                setActorename(rs.getString("actors"));
                setGenres(rs.getString("genres"));
                setImagespath(rs.getString("poster_path"));
                setImdbrating(rs.getFloat("imdb_rating"));
                setImdbvoting(rs.getInt("imdb_votes"));
                setRealeasedate(rs.getString("release_date"));
                setRuntime(rs.getInt("runtime"));
                setStrory(rs.getString("story"));
                setSummary(rs.getString("summary"));
                setWinsnominations(rs.getString("wins_nominations"));
                setYearofreleae(rs.getInt("year_of_release"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DetailsFramecontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setData() {
        getData();
        picturetitle.setText(title);
        adultlabel.setText("" + isadult);
        actornamelabel.setText(actorename);
        genreslabel.setText(genres);
        imdbratinglabel.setText("" + imdbrating);
        imdbvotelabel.setText("" + imdbvoting);
        runtimelable.setText("" + runtime);
        releasedatelabel.setText(realeasedate);
        storylabel.setText(strory);
        summarylabel.setText(summary);
        wikipeadiaLinklabel.setText(wikipidialink);
        winlabel.setText(winsnominations);
        yearofreleaselabel.setText("" + yearofreleae);
        pictureimg.setImage(new Image(imagespath));
        
            Rectangle clip = new Rectangle(
                pictureimg.getFitWidth(), pictureimg.getFitHeight()
            );
            clip.setArcWidth(20);
            clip.setArcHeight(20);
            pictureimg.setClip(clip);

            SnapshotParameters parameters = new SnapshotParameters();
            parameters.setFill(Color.TRANSPARENT);
            WritableImage image = pictureimg.snapshot(parameters, null);

            pictureimg.setClip(null);
            pictureimg.setEffect(new DropShadow(20, Color.BLACK));
            pictureimg.setImage(image);
        
        pictureimg.setFitWidth(260);
        pictureimg.setFitHeight(500);
        pictureimg.setPreserveRatio(false);
    }

    @FXML
    private void onbookbuttonClick(ActionEvent event) {
         new Main_stageController().refresh("TicketSeat_book");
    }

    @FXML
    private void onClick(MouseEvent event) {
        new Main_stageController().refresh("categiry main");
    }

}
