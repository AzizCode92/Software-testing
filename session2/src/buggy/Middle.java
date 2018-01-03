package buggy;

public class Middle {
	public static int findMiddle(int a, int b, int c) {
		if ((a < b && b < c) || (c > b && b > a)) {
			return b;
		} else if ((a < c && c < b) || (c > a && b > c)) {
			return c;
		} else if ((b < a && a < c) || (c < a && a < b)) {
			return a;
		} else if (b == c) {
			return a;
		} else if (b == a) {
			return c;
		} else {
			return a;
		}
	}
}
