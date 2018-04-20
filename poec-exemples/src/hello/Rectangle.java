package hello;

public class  Rectangle implements Shape {
	// variables
	private int width;
	private int height;
	
	/**
	 * Construit un rect à partir largeure et haute
	 * @param width largeur
	 * @param height hauteru du rect
	 */
	
	
	public Rectangle(int width, int height) {
		if(width <0 ) {
			throw new IllegalArgumentException("width must be positive");
		}
		if(height <0 ) {
			throw new IllegalArgumentException("width must be positive");
			
		}
		this.width = width;
		this.height = height;
	}
	// méthodes
	
	public double calcAera() {
		return width * height;
	}
}
