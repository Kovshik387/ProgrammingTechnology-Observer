package ClockComponent;

import javafx.scene.text.Text;
import observerComponents.Infastructure.Observer;

import java.util.Date;

public class Clock implements Observer {
    private final Text text = new Text();
    @Override
    public void update(Date date) {
        text.setText(date.toString());
    }

    public Text getClock(){
        return this.text;
    }
}
