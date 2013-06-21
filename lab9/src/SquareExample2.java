import java.util.Scanner;
class Square2{
	private double side;
	static int count;
	Square2(){
		count++;
	}
	Square2(double side){
		side = side;
		count++;
	}
	void setSide(double side){
		side = side;
	}
	double getSide(){
		return side;
	}
	void setToUnit(double side){
		side = 1.0;
	}
}

public class SquareExample2 {

	public static void main(String[] args) {
		Square2 s1 = new Square2(10.0);
		Square2 s2 = new Square2(20.0);
		s2.setSide(100);
		s2.setToUnit(100.0);
		System.out.println("Square size "+s1.getSide());
		System.out.println("Square size "+s2.getSide());
	}

}
