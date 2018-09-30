package main.com.epam;

public class Triangle {

    private static boolean isGreaterThanZero(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean isTriangleExist(double a, double b, double c) {
        return isGreaterThanZero(a, b, c) && a < b + c && b < a + c && c < a + b;
    }
}
