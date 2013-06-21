import java.util.Scanner;

class Square{
	private double side;
	static int count;
	Square(){
		count++;
	}
	Square(double n){
		this.side = n;
		count++;
	}
	void setSide(double n){
		this.side = n;
	}
	double getSide(){
		return this.side;
	}
	
	double sumSides(Square s){
		System.out.println("Size of this square: "+this.side);
		System.out.println("Size of this square: "+s.side);
		double total = this.side + s.side;
		return total;
	}
	
	Square createNewSqaure(double side){
		double new_side = this.side + side;
		Square s = new Square(new_side);
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
