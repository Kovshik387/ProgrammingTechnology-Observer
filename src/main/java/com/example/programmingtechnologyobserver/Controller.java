package com.example.programmingtechnologyobserver;

import ClockComponents.ClockComponent;
import ImageComponent.ImagePane;
import MediaPlayerComponents.MediaPlayerComponent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import observerComponents.TimeServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public StackPane ImagePane;
    @FXML
    public BorderPane TimerText;
    @FXML
    public BorderPane MediaPage;
    private TimeServer timeServer;
    private ClockComponent clockComponent;
    private ImageComponent.ImagePane imageComponentPane;
    private MediaPlayerComponent mediaPlayerComponent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeServer = new TimeServer();

        imageComponentPane = new ImagePane();
        clockComponent = new ClockComponent();
        try {
            mediaPlayerComponent = new MediaPlayerComponent();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        timeServer.attach(imageComponentPane);
        timeServer.attach(clockComponent);
        timeServer.attach(mediaPlayerComponent);

        this.TimerText.setCenter(clockComponent.getClock());
        this.ImagePane.getChildren().add(imageComponentPane.buildMeme());
        this.MediaPage.setCenter(mediaPlayerComponent.getMediaView());

        System.out.println(mediaPlayerComponent.getMediaView().getMediaPlayer().getMedia().getDuration());
    }
}