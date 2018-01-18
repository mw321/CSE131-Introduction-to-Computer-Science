package exercises8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Point {
	
	//
	// has-a x and y coordinate, both integers
	//  these are immutable so you should declare them "final"
	//
	// declare instance variables here:
	//
	final private int x;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	final private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,5);
		System.out.println(p1 + " " + p2);
		List<Point> set = new LinkedList<Point>();
		set.add(new Point(131, 132));
		set.add(new Point(131, 132));
		System.out.println("Set has " + set);
		System.out.println(set.contains(new Point(131,132)));
		
	}
	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + x;
//		result = prime * result + y;
//		return result;
//	}
//	public int hashCode() {
//		   return (int)(Math.random()*100000);
//		}
	public int hashCode() {
		   return 0;
		}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
		//return false;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
