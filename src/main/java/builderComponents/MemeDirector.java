package builderComponents;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Meme;

public class MemeDirector {

    public Meme Construct(MemeBuilder builder){
        builder.setImage();
        builder.setDesign();
        builder.setColor();
        builder.setText();
        return builder.build();
    }

}
