package Java1.el222ja_lab3;

public class Point {
	private int x,y; 

	public Point(int x, int y) {
		this.x=x; 
		this.y=y;
	}
	public Point() {}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public String toString() {
		String str = ""; 
		str = str+"("+x+","+y+")";
		return str;
	}
	public boolean isEqualTo(Point p2) {
		if(this.x==p2.getX()) {
			if(this.y==p2.getY())
				return true; }
		return false; 
	}

	public double distanceTo(Point p2) {
		double dis = Math.sqrt((Math.pow((p2.getY()-this.y), 2)+(Math.pow((p2.getX()-this.x), 2))));
		return dis;
	}

	public void move(int i, int j) {
		this.x=x+i;
		this.y=y+j;	
	}

	public void moveToXY(int i, int j) {
		this.x=i;
		this.y=j;
	}
}





