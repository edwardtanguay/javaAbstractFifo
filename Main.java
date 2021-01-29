import lib.ADT_FIFO;
import lib.Element;
import lib.FIFO_Array;
import lib.FIFO_EVL;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			ADT_FIFO FIFO_Schlange;
			if (i == 0) {
				FIFO_Schlange = new FIFO_Array();
				System.out.println("Array_FIFO wird erstellt");
			} else {
				FIFO_Schlange = new FIFO_EVL();
				System.out.println("EVL_FIFO wird erstellt");
			}

			String[] elemente = { "Akte 34234", "Akte 6433" };
			for (String inhalt : elemente) {
				Element element = new Element(inhalt);
				FIFO_Schlange.einfügen(element);
				System.out.println("Neues element mit Inhalt " + inhalt + " wurde zum archivieren erstellt");
			}

			while (!FIFO_Schlange.istLeer()) {
				Element element = FIFO_Schlange.entfernen();
				String inhalt = element.inhalt;
				System.out.println("Element mit Inhalt " + inhalt + " kommt aus der Schlange und wurde archviert");
			}

			if (FIFO_Schlange.istLeer()) {
				System.out.println("Elemente entfernt. Akten archiviert. Die FIFO_Schlange funktioniert!");
			}
		}
	}
}