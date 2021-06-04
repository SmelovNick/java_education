package ru.stqa.pft.sandbox;

public class Point {
    public int x;
    public int y;
    public Point(){}
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int sumResult(){
        return this.x + this.y;
    }
    public static int distance(Point p1, Point p2){
        return (int)Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}
