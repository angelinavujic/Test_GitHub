package geoMetry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Calculations> shapes;
	
	public Group() {
        shapes = new ArrayList<>();
        
	}
	
	public void addShape(Calculations shape) {
        shapes.add(shape);
    }
	
	public void removeShape(Calculations shape) {
        shapes.remove(shape);
    }
	
	public double calculateTotalArea() {
        double totalArea = 0;
        for (Calculations shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
	
	public double calculateTotalCircumference() {
        double totalCircumference = 0;
        for (Calculations shape : shapes) {
            totalCircumference += shape.calculateCircumference();
        }
        return totalCircumference;
    }
	
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
        
    
	
	public void printAllShapes() {
        for (Calculations shape : shapes) {
            System.out.println(shape.toString()); 
        }
    }


}
