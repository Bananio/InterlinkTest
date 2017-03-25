
public class Room implements Volume {
	
	 public double width;
	 public double height;
	 public double length;
	
	@Override
	public double getVolume(){
		return width * height * length;
	}

}
