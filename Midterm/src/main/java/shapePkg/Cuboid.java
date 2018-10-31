package shapePkg;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int depth;
	
	public Cuboid(int l, int w, int d) {
		super(l,w);
		this.depth=d;
	}
		
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int area() {
		return 2*super.area()+2*super.getLength()*this.depth+2*super.getWidth()*this.depth;
	}
	
	public int volume() {
		return this.depth*super.area();
	}
	
//	public int perimeter() {
//		throw new UnsupportedOperationException();
//		return 0;
//	}
	
	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return a.area()-b.area();
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return a.volume()-b.volume();
		}
	}
}