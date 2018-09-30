package test.com.epam;

import main.com.epam.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testIsTriangleExistWithRightNumber() {
        Assert.assertTrue(Triangle.isTriangleExist(4, 3, 5));
    }

    @Test
    public void testIsTriangleExistWithZeroNumber() {
        Assert.assertFalse(Triangle.isTriangleExist(0, 3, 5));
    }

    @Test
    public void testIsTriangleExistWithNegativeNumber() {
        Assert.assertFalse(Triangle.isTriangleExist(6, -3, 5));
    }

    @Test
    public void testIsTriangleExistWithPositiveInfinity() {
        Assert.assertFalse(Triangle.isTriangleExist(Double.POSITIVE_INFINITY, 3, 5));
    }

    @Test
    public void testIsTriangleExistWithNegativeInfinity() {
        Assert.assertFalse(Triangle.isTriangleExist(Double.NEGATIVE_INFINITY, 9, 1));
    }

    @Test
    public void testIsTriangleExistWithNanValue() {
        Assert.assertFalse(Triangle.isTriangleExist(8, Double.NaN, 5));
    }

    @Test
    public void testIsTriangleExistWithStringValue() {
        Assert.assertTrue(Triangle.isTriangleExist(8, Double.parseDouble("12.5"), 5));
    }

    @Test
    public void testIsTriangleExistWithNotValisStringValue() {
        Assert.assertFalse(Triangle.isTriangleExist(8, Double.parseDouble("18.5"), 5));
    }

    @Test
    public void testIsTriangleExistWithMaxDoubleValues() {
        Assert.assertTrue(Triangle.isTriangleExist(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void testIsTriangleExistWithMinDoubleValues() {
        Assert.assertTrue(Triangle.isTriangleExist(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE));
    }
}
