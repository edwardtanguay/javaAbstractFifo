package lib;

public class Element {
	public String inhalt;
	Element next;

	public Element() {
	}

	public Element(String s) {
		inhalt = s;
		next = null;
	}
}
