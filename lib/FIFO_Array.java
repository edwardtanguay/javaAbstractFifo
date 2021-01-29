package lib;

public class FIFO_Array extends ADT_FIFO
{
    Element[] q = null;
    public FIFO_Array(){
        this.neueSchlange();
    }
    public void neueSchlange(){
        q = new Element[100];
        for (int i = 0; i<100; i++){
            q[i] = null; 
        }
    }
    public void einfügen(Element e)
    {
        if (this.istLeer()){
            q[0] = e; 
        }
        else{
            for (int i = 0; i<100; i++)
            {
                if (q[i] == null)
                { 
                    q[i] = e;
                    break; 
                }
            }
        }
    }
    public Element entfernen()
    {
        Element e = new Element();
        if(this.istLeer())
        {
            System.out.println("Die Schlange ist leer, nichts kann entfernt werden.");
        }
        else
        {
            e = q[0];
            for (int i = 0; i<99; i++)
            { 
                q[i] = q[i+1];
            }
            q[99] = null; 
        }
        return e;
    }
    public boolean istLeer()
    {
        boolean erg;
        if (q[0] == null)
        {
            erg = true;
        }
        else
        {
            erg = false;
        }
        return erg;
    }
}