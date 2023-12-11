package MediaPlayerComponents;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import observerComponents.Infastructure.Observer;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Date;

public class MediaPlayerComponent implements Observer {
    private final MediaPlayer mediaPlayer;
    private final MediaView mediaView;
    public MediaPlayerComponent() throws MalformedURLException {
        String url = new File("src//main//resources//videos//video.mp4").toURI().toURL().toString();

        mediaPlayer = new MediaPlayer(new Media(url));
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.play();
        mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(300); mediaView.setFitHeight(300);
    }

    public MediaView getMediaView(){ return this.mediaView;}

    @Override
    public void update(Date date) {
        if (date.getSeconds() % 35 == 0){
            this.mediaPlayer.pause();
            System.out.println("Video stop");
        }
        else if
        (date.getSeconds() % 15 == 0){
            this.mediaPlayer.play();
            System.out.println("Video start");
        }
    }
}
