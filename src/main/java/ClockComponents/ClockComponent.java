package ClockComponents;

import javafx.scene.text.Text;
import observerComponents.Infastructure.Observer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockComponent implements Observer {
    private final Text text = new Text();
    @Override
    public void update() {
        var dateFormat = new SimpleDateFormat("HH:mm:ss");
        var currentTime = dateFormat.format(new Date());
        this.text.setText(currentTime);
        // выводит время с момента запуска в собственных единицах
    }

    public Text getClock(){
        return this.text;
    }
}
