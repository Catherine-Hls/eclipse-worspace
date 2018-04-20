package hello;

public class ShapeMain {

	public static void main(String[] args) {
		
		// Créer classe Rectangle 
		// qui possède une méthode public int calcAera(int width, int heigth)
		
		Rectangle r1 = new Rectangle(-10, 50);
		
		
		double res = r1.calcAera();
		System.out.println(res);
		
	/*	Rectangle r2 = new Rectangle();
		r2.width = 20;
		r2.height = 30;
		System.out.println(r2.calcAera());*/
		
		Circle c = new Circle();
		c.r = 4;
		System.out.println(c.calcAera());
		
		Shape [] tab = {r1, c};
		
		for (int i = 0; i < tab.length; i++) {
			Shape o = tab[i];
			System.out.println(o.calcAera());
		}

	}

}
