package lib;

public class FIFO_EVL extends ADT_FIFO{
    Element q = null;
    
    public FIFO_EVL()
    {
        this.neueSchlange();
    }
    public void neueSchlange()
    {
        
        q = new Element("");
    }
    public void einfügen(Element e)
    {
         Element eAlt = q;     
       for(int i = 0; i<1;)
       {
             if(eAlt.next == null)
             { 
                
                 eAlt.next = e;
                 i++;
             }
             else
             {
                
                eAlt = eAlt.next;    
             } 
       } 
         
    }
    public Element entfernen()
    {
       Element e = new Element();
       if(!this.istLeer()) 
       {         
          System.out.println("Element entfernt");
          e = q.next;
          q.next = e.next;
          
       }else
       {
           System.out.println("Die FIFO Schlange ist schon leer");
       }    
       return e;
    }
    public boolean istLeer()
    {
        boolean inhalt;
        if(q.next == null)
        { 
            inhalt = true; 
        }
        else
        {
            inhalt = false; 
        }
        return inhalt;
    }
}