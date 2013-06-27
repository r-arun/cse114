class Shape{
	int dimension;
	
 	public Shape(){
		
	}
	
	public Shape(int newDimension){
		dimension = newDimension;
	}
	
	public int getDimension(){
		return dimension;
	}
	
	public void setDimension(int newDimension){
		dimension = newDimension;
	}
	
	public String toString(){
		return "Shape has dimension "+dimension;
	}
}

class Square extends Shape{

	public Square(){
		
	}
	public Square(int newDimension) {
		dimension = newDimension;
	}
	public int getArea(){
		return dimension * dimension;
	}
	public String toString(){
		return "Square has side "+dimension;
	}
}

class Circle extends Shape{
	public Circle(){
		
	}
	
	public Circle(int newDimension){
		dimension = newDimension;
	}
	
	public double getArea(){
		return Math.PI * dimension * dimension;
	}
	
	public String toString(){
		return "Cirlce has radius "+dimension;
	}
}

class Rectangle extends Shape{
	int breadth;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int newDimension, int newBreadth){
		dimension = newDimension;
		breadth = newBreadth;
	}
	
	public void setBreadth(int newBreadth){
		breadth = newBreadth;
	}
	
	public int getBreadth(){
		return breadth;
	}
	
	public int getArea(){
		return dimension * breadth;
	}
	
	public String toString(){
		return "Rectangle has length "+ dimension
				 +" breadth "+breadth;
	}
}
public class Problem4 {

	public static void main(String[] args) {
		Square s = new Square(10);
		System.out.println(s);
		System.out.println("Side = "+s.getDimension());
		System.out.println("Area = "+s.getArea());
		System.out.println();
		
		Circle c = new Circle(10);
		System.out.println(c);
		c.setDimension(5);
		System.out.println("Area = "+c.getArea());
		System.out.println();
		
		Rectangle r = new Rectangle(5, 10);
		System.out.println(r);
		System.out.println("Breadth = "+r.getBreadth());
		System.out.println("Area = "+r.getArea());
	}

}
