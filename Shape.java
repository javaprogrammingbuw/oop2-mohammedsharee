import java.awt.Color;


public abstract class Shape {
	protected int color;

	public abstract double area();
	public abstract double circumference();

	public void setColor( int r  , int g  , int b  ) {
		color = new Color(r,g,b).getRGB();
	}

	public void setColor( int color ){
		this.color = color;		
	}

}