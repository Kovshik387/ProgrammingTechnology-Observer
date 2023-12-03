package observerComponents;

import observerComponents.Infastructure.Observable;
import observerComponents.Infastructure.Observer;

import java.util.*;

public class TimeServer implements Observable {
    private List<Observer> observers;
    private Timer timer;
    private TimerTask task;
    private Date currentDate;
    public TimeServer(){
        observers = new ArrayList<>();

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

    }

    @Override
    public void notifyAllObserver() {
        for(var item : observers){
           item.update();
        }
    }

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }
}
