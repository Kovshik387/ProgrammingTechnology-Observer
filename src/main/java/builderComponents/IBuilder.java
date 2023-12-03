package builderComponents;

import model.Meme;
import javafx.scene.image.Image;

public interface IBuilder {
    public void setImage();
    public void setText();
    public void setDesign();
    public void setColor();
    public Meme build();
}