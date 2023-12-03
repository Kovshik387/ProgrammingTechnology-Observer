package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
public class Meme {
    private final StackPane panel = new StackPane();
    private final ImageView temp_view = new ImageView();
    private Text text = new Text();
    public Meme(){
        this.panel.getChildren().add(temp_view);
        this.panel.getChildren().add(text);
    }
    public void addImage(Image image){
        temp_view.setImage(image);
        temp_view.setFitHeight(190); temp_view.setFitWidth(292);
    }

    public void addText(Text text){
        this.text.setText(text.getText());
        this.text.setFont(text.getFont());
        this.text.setFill(text.getFill());
    }

    public StackPane getPanel(){
        return this.panel;
    }

    public void clearPane(){
        this.panel.getChildren().clear();
    }
}