import java.util.Scanner;

class City{
	private String name;
	double x;
	double y;
	
	City(String name, double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
	void printAll(){
		System.out.println(name+" "+x+" "+y);
	}
	String getName(){
		return name;
	}
	double dist(City c){
		double x_dist = this.x - c.x;
		double y_dist = this.y - c.y;
		return Math.sqrt(x_dist * x_dist + y_dist * y_dist);
	}
}
public class CityExample {
	public static void main(String[] args) {
		City nyc = new City("New York", 10, 10);
		City sfo = new City("San Francisco", 20, 20);
		nyc.printAll();
		sfo.printAll();
		System.out.print("Distance between "+ nyc.getName()+ " and ");
		System.out.println(sfo.getName()+" "+nyc.dist(sfo));
	}

}
