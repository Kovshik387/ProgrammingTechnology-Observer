package ImageComponent;

import builderComponents.MemeBuilder;
import builderComponents.MemeDirector;
import javafx.animation.FadeTransition;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import model.Meme;
import observerComponents.Infastructure.Observer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class ImagePane implements Observer {
    private MemeDirector memeDirector;
    private final MemeBuilder memeBuilder;
    private Meme meme;
    private final FadeTransition fade = new FadeTransition();

    public ImagePane(){
        memeBuilder = new MemeBuilder();
        memeDirector = new MemeDirector();
        meme = memeDirector.Construct(memeBuilder);

        fade.setNode(this.meme.getPanel());
        fade.setCycleCount(1000);
    }

    public StackPane buildMeme(){
        return meme.getPanel();
    }
    @Override
    public void update() {
        var date = new SimpleDateFormat("HH:mm:ss");
        if (date.getCalendar().get(Calendar.SECOND) % 5 == 0){
            fade.setDuration(new Duration(1200));
            fade.setFromValue(0.0);
            fade.setToValue(1.0);
            fade.play();
            this.meme = new MemeDirector().Construct(memeBuilder);
        }
        else{
            fade.stop();
        }
    }
}
