public class Main{
	
	
	public static void main(String[] args){
		Shape s; 
		Shape c;
		Shape t;
		
		t=new Triangle(4,4);
		
		c=new Circle(9);
		
		s=new Square(6,4);
		
		t.setColor(255,0,0);
		
		c.setColor(0,255,0);
		
		s.setColor(0,0,255);
		
		System.out.println("Area of Triangle "+t.area()+"circumference "+t.circumference()+"color"+t.color);
		
		System.out.println("Area of circle "+c.area()+"circumferenc"+c.circumference()+"color "+c.color);
		
		System.out.println("Area of square: "+s.area()+"circumference "+s.circumference()+"color  "+s.color);
		
	}
}