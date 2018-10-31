package shapeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import shapePkg.Cuboid;
import shapePkg.Cuboid.SortByVolume;
import shapePkg.Rectangle;

public class ShapeTests {

	@Test
	public void testRectangle() {
		Rectangle r= new Rectangle(1,2);
		Rectangle t= new Rectangle(2,3);
		
		assertTrue(r.getLength()==1);
		assertTrue(r.getWidth()==2);
		r.setLength(3);
		r.setWidth(4);
		assertTrue(r.getLength()==3);
		assertTrue(r.getWidth()==4);
		
		assertTrue(r.area()==12);
		assertTrue(r.perimeter()==14);
		
		assertTrue(r.compareTo(t)>0);
		assertTrue(t.compareTo(r)<0);
	}
	
	@Test
	public void testCuboid() {
		Cuboid c=new Cuboid(1,2,3);
		Cuboid b=new Cuboid(2,3,4);
		
		assertTrue(c.getDepth()==3);
		c.setDepth(4);
		assertTrue(c.getDepth()==4);
		
		assertTrue(c.area()==28);
		assertTrue(c.volume()==8);
		
		Cuboid.SortByArea a= c.new SortByArea();
		Cuboid.SortByVolume v= c.new SortByVolume();
		
		assertTrue(a.compare(c, b)<0);
		assertTrue(v.compare(c, b)<0);
		assertTrue(a.compare(b, c)>0);
		assertTrue(v.compare(b, c)>0);
		
		try {
			c.perimeter();
			assertTrue(false);
		}
		catch(UnsupportedOperationException e) {
			assertTrue(true);
		}
	}
	
	/*@Test(expected=UnsupportedOperationsException.class)
	public void testException() {
		Cuboid c=new Cuboid(1,2,3);
		c.perimeter();
		
	}*/

}
