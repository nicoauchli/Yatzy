/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.Yatzy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nico
 */
public class StartScreenController implements Initializable{

    int bet;
    int balance;
    
    @FXML
    private Label lbBalance;
    @FXML
    private TextField txtBet;
    private Stage stage;
    @FXML
    //If an correct input is given it switches screen.
    public void screenChangeButton(ActionEvent event) throws IOException {
       if (txtBet.getText().isEmpty() == true  ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("WRONG INPUT");
            alert.setContentText("Something is wrong with your input, or the input is missing.");
            alert.showAndWait();
        } else {
            bet = Integer.parseInt(txtBet.getText());
            Parent view2 = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
            Scene viewScene = new Scene(view2);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(viewScene);
            window.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }


    /*@Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }*/
}
