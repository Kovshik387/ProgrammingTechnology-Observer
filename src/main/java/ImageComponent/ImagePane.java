package ImageComponent;

import builderComponents.MemeBuilder;
import builderComponents.MemeDirector;
import iteratorComponents.ConcreteAggregate;
import iteratorComponents.Infastructure.Iterator;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import model.Meme;
import observerComponents.Infastructure.Observer;

import java.util.Date;
public class ImagePane implements Observer {
    private MemeDirector memeDirector;
    private final MemeBuilder memeBuilder;
    private Meme meme;

    public ImagePane(){
        ConcreteAggregate slides = new ConcreteAggregate();
        memeBuilder = new MemeBuilder();
        memeDirector = new MemeDirector();
        meme = memeDirector.Construct(memeBuilder);
    }

    public StackPane buildMeme(){
        return meme.getPanel();
    }
    @Override
    public void update(Date date) {
        if (date.getSeconds() % 10 == 0){
            this.meme = new MemeDirector().Construct(memeBuilder);
        }
    }
}
