package observerComponents;

import observerComponents.Infastructure.IObserver;
import observerComponents.Infastructure.Subject;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements IObserver {
    private Timer timer;
    private TimerTask task;
    private Date currentDate;

    public TimeServer(){
        currentDate = new Date();
        this.timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                tick();
            }
        };
        timer.schedule(task,currentDate,1);
    }
    private void tick(){
        currentDate.setTime(1);
    }
    @Override
    public void update() {

    }


}
