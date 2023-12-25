package ClockComponents;

import javafx.scene.text.Text;
import observerComponents.Infastructure.Observer;

import java.util.Date;

public class ClockComponent implements Observer {
    private final Text text = new Text();
    @Override
    public void update() {
        text.setText(date.toString());// выводит время с момента запуска в собственных единицах
    }

    public Text getClock(){
        return this.text;
    }
}
