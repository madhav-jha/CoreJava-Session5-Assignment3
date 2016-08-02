package session5.assignment3;

public class ConstructorOverloading {
	double a;
	double l, b;
	ConstructorOverloading(double a) {
		this.a = a;
		
	}
	
	ConstructorOverloading(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public static void main(String[] args) {
		ConstructorOverloading square = new ConstructorOverloading(5);
		System.out.println("Area of square = "+square.a*square.a);
		
		ConstructorOverloading rectangle = new ConstructorOverloading(5,8);
		System.out.println("Area of rectangle = "+rectangle.l*rectangle.b);
		



	}

}
