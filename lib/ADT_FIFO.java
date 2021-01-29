package lib;

public abstract class ADT_FIFO{
    public abstract void neueSchlange();
    public abstract void einfügen(Element e);
    public abstract Element entfernen();
    public abstract boolean istLeer();
}
