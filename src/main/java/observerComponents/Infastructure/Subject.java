package observerComponents.Infastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    public abstract void notifyAllObserver();
    public abstract void attach(Observer obs);
    public abstract void detach(Observer obs);
}
