package observerComponents;

import observerComponents.Infastructure.IObserver;

public class ComponentClock implements IObserver {
    Clock clock;
    public ComponentClock(){
        clock = new Clock();
    }

    @Override
    public void update() {
        clock.draw();
    }
}
