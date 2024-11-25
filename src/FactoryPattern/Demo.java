package FactoryPattern;

public class Demo {

	public static void main(String args[]) {
			ShapeFactory s1=new ShapeFactory();
	
	Shape shape1=s1.getShape("SQUARE");
	
	shape1.drow();
	
	Shape r=s1.getShape("rectangle");
	r.drow();
	}

	
	
}
