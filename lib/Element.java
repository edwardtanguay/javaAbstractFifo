package lib;

public class Element {
	String inhalt;
	Element next;

	public Element() {

	}

	public Element(String s) {
		inhalt = s;
		next = null;
	}
}
