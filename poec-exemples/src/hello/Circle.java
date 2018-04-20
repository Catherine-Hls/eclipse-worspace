package hello;

public class Circle implements Shape {
	double r;
	public double calcAera() {
		return Math.PI*Math.pow(r,  2);
	}
	
}
