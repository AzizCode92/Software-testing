package examples;

public class Triangle {

	public static TriangleType classify(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return TriangleType.INVALID;
		}
		if (!(a + b > c && a + c > b && b + a > c)) {
			return TriangleType.INVALID;
		}
		if (a == b && b == c) {
			return TriangleType.EQUILATERAL;
		}
		if (a == b || b == c || a == c) {
			return TriangleType.ISOSCELES;
		}
		return TriangleType.SCALENE;
	}
}
