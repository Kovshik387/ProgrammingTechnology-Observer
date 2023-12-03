package com.example.programmingtechnologyobserver;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import observerComponents.Infastructure.IObserver;
import observerComponents.Infastructure.Subject;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Subject subject;
    @FXML
    private Label welcomeText;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}