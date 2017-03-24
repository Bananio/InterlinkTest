
public class Main {
	public static void main(String[] args){
		Figure c = new Circle(6.0);
		Figure r = new Rectangle(3.0, 6.0);
		Figure larger = getLargerFigure(c, r);
		
		System.out.println("The area of the larger figure if: " + larger.area());
	}
	
	public static Figure getLargerFigure(Figure f1, Figure f2){
		if (f1.area() > f2.area())
			return f1;
		else
			return f2;
	}
}
