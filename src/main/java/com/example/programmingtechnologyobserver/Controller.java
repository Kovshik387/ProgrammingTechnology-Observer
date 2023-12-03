package com.example.programmingtechnologyobserver;

import ClockComponent.Clock;
import ImageComponent.ImagePane;
import builderComponents.MemeBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import observerComponents.Infastructure.Observable;
import observerComponents.TimeServer;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public StackPane ImagePane;
    public BorderPane TimerText;
    private TimeServer timeServer;
    private Clock clock;
    private ImageComponent.ImagePane imagePane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagePane = new ImagePane();
        timeServer = new TimeServer();
        clock = new Clock();

        timeServer.attach(imagePane);
        timeServer.attach(clock);
        this.TimerText.setCenter(this.clock.getClock());
        this.ImagePane.getChildren().add(imagePane.buildMeme());
    }
}