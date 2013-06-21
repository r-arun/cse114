import java.util.Scanner;

class Square{
	private double side;
	static int count;
	Square(){
		++count;
	}
	Square(double n){
		side = n;
		++count;
	}
	void setSide(double newSide){
		side = newSide;
	}
	double getSide(){
		return side;
	}
	
	double sumSides(Square otherSquare){
		System.out.println("Size of this square: "+side);
		System.out.println("Size of other square: "+otherSquare.side);
		double total = side + otherSquare.side;
		return total;
	}
	
	Square createNewSqaure(double newSide){
		Square s = new Square(side + newSide);
		return s;
	}
}

public class SquareExample1 {

	public static void main(String[] args) {
		Square s1 = new Square(10.0);
		Square s2 = new Square();
		System.out.println(Square.count);
		//Note static access from class instead of object
		s2.setSide(20.0);
		System.out.println(s1.sumSides(s2));
		Square s3 = s1.createNewSqaure(5.0);
		System.out.println(s3.getSide());
		
	}

}
