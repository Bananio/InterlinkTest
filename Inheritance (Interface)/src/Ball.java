
public class Ball implements Volume {
	
	public static final double PI = Math.PI;
	public double diameter;
	
	public double getVolume(){
		double radius = diameter / 2.0;
		return 3.0 / 4.0 * radius * radius * radius * PI;
	}
}
