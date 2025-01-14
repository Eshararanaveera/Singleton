package FactoryPattern;

public class ShapeFactory {

	public Shape getShape(String type) {
		if(type==null) {
			return null;
		}
		
		if(type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
	
}
