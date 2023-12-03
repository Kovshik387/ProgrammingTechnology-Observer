package iteratorComponents.Infastructure;

public interface Iterator {
    public boolean hasNext();
    public boolean hasPrevious();
    public Object next();
    public Object preview();
}
