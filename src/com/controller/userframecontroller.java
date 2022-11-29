
package com.controller;

import com.database.Database_Connection;
import com.gluonhq.charm.glisten.control.TextField;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;


public class userframecontroller implements Initializable {

    @FXML
    private TextField seatNumber;
    @FXML
    private TextField userlastname;
    @FXML
    private TextField usernumber;
    @FXML
    private Label totalamount;
    @FXML
    private TextField username;
    String seatCode;
    @FXML
    private Label TicketType;

    ObservableList<String> Ticketdata = FXCollections.observableArrayList("Select Type", "Silver  +30$", "Gold  +50$", "Diamond  +70$");
    ObservableList<String> FoodData = FXCollections.observableArrayList("Select Food", "Popcorn -50$", "Soft Drink -100$", "Combo(Soft Drink-Popcorn -150$");

    @FXML
    private Label moviesTitle;
    @FXML
    private Label TicketCount;
    @FXML
    private ChoiceBox<String> ChoiseBoxTicketType;
    @FXML
    private ChoiceBox<String> FoodTypeChoiseBox;
    private int count = 0, foodprice = 0, ticketprice = 0, moviesPrice = 0;
    @FXML
    private Label MoviesPrice;
    @FXML
    private Label FoodType;
    @FXML
    private Button paymentbutton;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    private void SetTicketData() throws SQLException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd    ");
        LocalDateTime now = LocalDateTime.now();
        Database_Connection connection = new Database_Connection();
        String url = "INSERT INTO `setenrollement`(`user name`, `user sirname`, `user number`,"
                + " `seat type`, `amount`, `set_number`,`date`)"
                + " VALUES (?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.con.prepareCall(url);
        preparedStatement.setString(1, username.getText());
        preparedStatement.setString(2, userlastname.getText());
        preparedStatement.setString(3, usernumber.getText());
        preparedStatement.setString(4, ChoiseBoxTicketType.getValue());
        preparedStatement.setString(5, totalamount.getText());
        preparedStatement.setString(6, seatcontroller.seatNumber);

        preparedStatement.setString(7, dtf.format(now));
        preparedStatement.execute();
        connection.con.close();

    }

    private int GetTotal() {
        int total = 0;

        return total;
    }

    private void setSeatNumber(String setNumber) {
        seatCode = setNumber;
        seatNumber.setText("Selected Seat Are :- " + setNumber);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        seatcontroller.seatNumber = seatcontroller.seatNumber.replace(" ", ",");
        seatcontroller.seatNumber = seatcontroller.seatNumber.replaceFirst(",", "");
        System.out.println(seatcontroller.seatNumber);

        ChoiseBoxTicketType.setValue("Select Type");
        ChoiseBoxTicketType.setItems(Ticketdata);
        FoodTypeChoiseBox.setValue("Select Food");
        FoodTypeChoiseBox.setItems(FoodData);
        setSeatNumber(seatcontroller.seatNumber);
        moviesTitle.setText(DetailsFramecontroller.title);
        TicketCount.setText(""+seatcontroller.count);
        MoviesPrice.setText(""+seatcontroller.count*200);

        ChoiseBoxTicketType.setOnAction(this::getTicketType);
        FoodTypeChoiseBox.setOnAction(this::getFoodType);
    }

    @FXML
    private void CancelClick(ActionEvent event) {
        System.exit(0);
    }

    private void getFoodType(ActionEvent event) {
        switch (FoodTypeChoiseBox.getValue()) {
            case "Popcorn -50$":
                FoodType.setText("50");
                break;
            case "Soft Drink -100$":
                FoodType.setText("100");
                break;
            case "Combo(Soft Drink-Popcorn -150$":
                FoodType.setText("150");
                break;
            case "Select Food":
                FoodType.setText(null);
                break;
            default:
        }
        foodprice = Integer.parseInt(FoodType.getText());
        totalamount.setText("" + totalPrice() + " Rupees");
    }

    void getTicketType(ActionEvent event) {
        switch (ChoiseBoxTicketType.getValue()) {
            case "Select Type":
                TicketType.setText(null);
                break;
            case "Silver  +30$":
                TicketType.setText("30");
                break;
            case "Gold  +50$":
                TicketType.setText("50");
                break;
            case "Diamond  +70$":
                TicketType.setText("70");
                break;
            default:
        }
        ticketprice = Integer.parseInt(TicketType.getText());
        totalamount.setText("" + totalPrice() + " Rupees");
    }

    int totalPrice() {
        int total = 0;
        count = Integer.parseInt(TicketCount.getText());
        moviesPrice = Integer.parseInt(MoviesPrice.getText());
        total = moviesPrice * count + foodprice + ticketprice;
        return total;
    }

    private void onPayment(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Payment SucessFully \n your Seat Number :- " + seatcontroller.seatNumber);
        System.exit(0);
    }

    @FXML
    private void onPaymentClick(ActionEvent event) {
        try {
            SetTicketData();
            new Main_stageController().refresh("paymetconform");
        } catch (SQLException ex) {
            Logger.getLogger(userframecontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onClick(MouseEvent event) {
         new Main_stageController().refresh("TicketSeat_book");
    }
}
