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
    public void testIsTriangleExistWithNanAndMinExponent() {
        Assert.assertTrue(Triangle.isTriangleExist(8, Double.MIN_EXPONENT, 5));
    }

    @Test
    public void testIsTriangleExistWithNanAndMaxExponent() {
        Assert.assertFalse(Triangle.isTriangleExist(8, Double.MAX_EXPONENT, 5));
    }

    @Test
    public void testIsTriangleExistWithMaxDoubleValue() {
        Assert.assertTrue(Triangle.isTriangleExist(Double.MAX_VALUE, 13.9, 7.9));
    }

    @Test
    public void testIsTriangleExistWithMinDoubleValue() {
        Assert.assertTrue(Triangle.isTriangleExist(13.8, 12, Double.MIN_VALUE));
    }
}
