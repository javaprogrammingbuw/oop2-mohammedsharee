

public class Square extends Shape {
	
	private double width;
	private double height;

	public Square() {
		this.width=1;
		this.height=1;
	}

	public Square(double width,double height) {
		this.width=width;
		this.height=height;
	}

	public  double area(){
		return this.width*this.height;
	}

	public  double circumference() {
		return this.width+this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double nW) {
		this.width=nW;
	}


}