package observerComponents;

public class Clock {
    private int counter = 0;
    public void draw(){

        System.out.println("Отработка clock компонент" + (++counter) + " раз");
    }
}
