package ru.stqa.pft.sandbox;

public class myclass
{
	public static void main(String[] args)
	{
		Point p0 = new Point();
		p0.x = 1; p0.y = 2;
		Point p1 = new Point(1, 15);
		Point p2 = new Point(-3, 4);
		System.out.println(Point.distance(p1, p2));
	}
}