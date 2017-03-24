
public class Submarine {

	private static final int MOVE_STEP = 10;
	private static final int MAX_DEPTH = 600;
	
	private int depth = 0;
	
	public void dive(){
		if (depth >= MAX_DEPTH) return;
		this.depth += MOVE_STEP;
	}
	
	public void popUp(){
		if (depth == 0) return;
		this.depth -= MOVE_STEP;
	}
	
	public int getDepth(){
		return depth;
	}
}
