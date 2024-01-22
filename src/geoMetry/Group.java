package geoMetry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Calculations> shapes;
	
	public Group() {
        shapes = new ArrayList<>();
        
	}
	
	/**
	 * Adds shapes to the list
	 * @param shape
	 */
	public void addShape(Calculations shape) {
        shapes.add(shape);
    }
	
	/**
	 * removes shapes from the list
	 * @param shape
	 */
	public void removeShape(Calculations shape) {
        shapes.remove(shape);
    }
	
	/**
	 * calculates total area of all shapes
	 * @return
	 */
	public double calculateTotalArea() {
        double totalArea = 0;
        for (Calculations shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
	
	/**
	 * calculates total Circumference of all shapes
	 * @return
	 */
	public double calculateTotalCircumference() {
        double totalCircumference = 0;
        for (Calculations shape : shapes) {
            totalCircumference += shape.calculateCircumference();
        }
        return totalCircumference;
    }
	
	/***
	 * finds largest shape based on largest area
	 * @return
	 */
	public Calculations findLargestShape() {
		  if (shapes.isEmpty()) {
	            return null;
	        }
	        Calculations largestShape = shapes.get(0);
	        for (Calculations shape : shapes) {
	            if (shape.calculateArea() > largestShape.calculateArea()) {
	                largestShape = shape;
	            }
	        }

	        return largestShape;
	    }
        
    
	/**
	 * prints all shapes
	 */
	public void printAllShapes() {
        for (Calculations shape : shapes) {
            System.out.println(shape.toString()); 
        }
    }


}
