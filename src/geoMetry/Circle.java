package geoMetry;

public class Circle extends Calculations {
	
	private double radius;

	
	public Circle(double y, double x, double radius) {
		super(y, x);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
		
	}

	@Override
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	

}
