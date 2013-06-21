import java.util.Scanner;

class ComplexNumber{
	private int real;
	private int imaginary;
	
	ComplexNumber(int r, int i){
		real = r;
		imaginary = i;
	}
	
	void setReal(int real){
		this.real = real;
	}
	
	void setImaginary(int imaginary){
		this.imaginary = imaginary;
	}
	
	void display(){
		System.out.println(real+" + j"+imaginary);
	}
	double magnitude(){
		return Math.sqrt(real * real + imaginary * imaginary);
	}
	ComplexNumber add(ComplexNumber other){
		int real = this.real + other.real;
		int img = this.imaginary + other.imaginary;
		ComplexNumber c = new  ComplexNumber(real ,img);
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
