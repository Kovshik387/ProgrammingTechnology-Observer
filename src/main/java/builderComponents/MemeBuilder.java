package builderComponents;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import model.Meme;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class MemeBuilder implements IBuilder {
    private final String fileTopic = new File("src//main//resources//topic//").getAbsolutePath() + "\\";
    private final Meme meme = new Meme();
    private final Text text = new Text();
    private final List<String> jokes = List.of("- Мама, можно я съем морковку?" +
                    "- Не трожь! Это на Новый год!\n",
            "Дешевым хлебом проще затыкать\nнедовольные рты.\n",
            "Как тут у вас все странно...\n Пожалуй, я останусь!\n",
            "Бесплатное обучение поеданию \nбесплатного сыра!\n Бизнес-курс \"Мышеловка\"!\n",
            "- Колобок, колобок, я тебя съем!",
            "Раньше не верил людям только \nпервого апреля, а теперь всегда.",
            "Сегодня буду говорить людям правду\n а потом смеяться и говорить: \n«С 1 апреля!»"

    );
    private final List<Color> colors = List.of(Color.BLUE,Color.LIME,Color.ORANGE,Color.PURPLE,Color.BLACK);
    @Override
    public void setImage() {
        Image image = new Image(Paths.get(fileTopic + new Random().nextInt(1,5)  + ".jpg").toUri().toString());
        this.meme.addImage(image);
    }

    @Override
    public void setText() {
        text.setText(jokes.get(new Random().nextInt(0, jokes.size())));
        this.meme.addText(text);
    }

    @Override
    public void setColor(){
        text.setFill(colors.get(new Random().nextInt(0,colors.size())));
    }

    @Override
    public void setDesign(){
        text.fontProperty().setValue(Font.font("Verdana", FontWeight.BOLD, 12));
    }

    @Override
    public Meme build() {
        return this.meme;
    }
}
