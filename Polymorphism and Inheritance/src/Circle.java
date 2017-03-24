
public class Circle extends Figure {
	
	public static final double PI = Math.PI;
	private double diameter;
	
	public Circle(double diameter){
		this.diameter = diameter;
	}
	
	@Override
	public double area(){
		double radius = diameter / 2.0;
		return radius * radius * PI;
	}
}
