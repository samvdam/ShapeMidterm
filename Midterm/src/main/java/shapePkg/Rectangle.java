package shapePkg;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	private int length;
	private int width;
	
	public Rectangle(int l, int w) {
		this.length=l;
		this.width=w;
	}
	
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int perimeter() {
		return 2*this.length+2*this.width;
	}
	
	public int area() {
		return this.length*this.width;
	}
	
	public int compareTo(Rectangle r) {
		return this.area()-r.area();
	}
}
