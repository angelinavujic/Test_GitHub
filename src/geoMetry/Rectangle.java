package geoMetry;

public class Rectangle extends Calculations{
	
	private double length;
	private double width;
	
	public Rectangle() {
		super();
		
	}
	
	public Rectangle(double x, double y, double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	public double calculateCircumference() {
		return (2*this.length) + (2*this.width);
	}

	@Override
	public double calculateArea() {
		return this.length *this.width;
	}

}
