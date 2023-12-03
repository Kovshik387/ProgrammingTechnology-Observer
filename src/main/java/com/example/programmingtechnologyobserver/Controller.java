package com.example.programmingtechnologyobserver;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import observerComponents.Infastructure.Observable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Observable subject;
    @FXML
    private Label welcomeText;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}