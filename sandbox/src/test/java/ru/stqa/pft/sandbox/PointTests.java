package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testSumResult()
    {
        Point p1 = new Point(-3, 2);
        Assert.assertEquals(p1.sumResult(), -1);
    }
    @Test
    public void testDistance(){
        Point p1 = new Point(1, 15);
        Point p2 = new Point(-3, 4);
        Assert.assertEquals(Point.distance(p1, p2), 11);
    }
}
