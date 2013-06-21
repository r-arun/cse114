import java.util.Scanner;

class ComplexNumber{
	private int real;
	private int imag;
	
	ComplexNumber(int r, int i){
		real = r;
		imag= i;
	}
	
	void setReal(int realValue){
		real = realValue;
	}
	
	void setImaginary(int imaginary){
		imag = imaginary;
	}
	
	void display(){
		System.out.println(real+" + j"+imag);
	}
	double magnitude(){
		return Math.sqrt(real * real + imag* imag);
	}
	ComplexNumber add(ComplexNumber other){
		int realValue = real + other.real;
		int imgValue = imag+ other.imag;
		ComplexNumber c = new  ComplexNumber(realValue ,imgValue);
		return c;
	}
}
	
public class ComplexNumberExample {


	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(10, 10);
		ComplexNumber c2 = new ComplexNumber(5, 5);
		c1.display();
		System.out.println("Magnitude is "+c1.magnitude());
		ComplexNumber result = c1.add(c2);
		result.display();
	}

}
