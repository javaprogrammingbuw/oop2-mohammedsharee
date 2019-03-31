public class Triangle extends Shape implements iRightAngled {
	
	private double a;
	private double b;

	public Triangle() {
		this.a = 1;
		this.b = 1;
	}

	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double pythagoras() {
		return Math.sqrt(this.a*this.a+this.b*this.b);
	}

	public  double area() {
		return 0.5* this.a*this.b;
	}

	public  double circumference() {
		return this.a+this.b+pythagoras();
	}

}