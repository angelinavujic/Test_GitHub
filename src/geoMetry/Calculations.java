package geoMetry;

public abstract class Calculations {
	
	private double y;
	private double x;
	
	public Calculations(double y, double x) {
		super();
		this.y = y;
		this.x = x;
	}
	
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	
	
	@Override
	public String toString() {
		return "Calculations [y=" + y + ", x=" + x + "]";
	}
	
	/**
	 * abstract method for calculations of circumferences
	 * @return
	 */
	public abstract double calculateCircumference();
	
	/**
	 * abstract method for calculations of areas
	 * @return
	 */
	public abstract double calculateArea();
	
	
	

}
