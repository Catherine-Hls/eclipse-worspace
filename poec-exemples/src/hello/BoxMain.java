package hello;

public class BoxMain {
	public static void main(String[] args) {
		// cette boite ne peut contenir
		// que des String
		Box<Article> b = new Box<Article>();
		
		Box<String> b2 = new Box<String>();
		b.setElement(new Article("article", 10));
		b2.setElement("string");
		
		Box<Article> b3 = new Box<>(); // inférence de type
	}
}
