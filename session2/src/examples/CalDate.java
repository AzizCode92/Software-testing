package examples;

public class CalDate {

	protected int day;
	protected int month;
	protected int year;

	public CalDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public double toJulian() {
		int JGREG = 15 + 31 * (10 + 12 * 1582);
		int julianYear = year;
		if (year < 0) {
			julianYear = julianYear + 1;
		}
		int julianMonth = month;
		if (month > 2) {
			julianMonth = julianMonth + 1;
		} else {
			julianYear = julianYear - 1;
			julianMonth = julianMonth + 13;
		}
		double t = Math.floor(365.25 * julianYear);
		double s = Math.floor(30.6001 * julianMonth);
		double julian = t + s + day + 1720995.0;
		int temp = day + 31 * (month + 12 * year);

		if (temp >= JGREG) {
			int ja = (int) (0.01 * julianYear);
			julian = julian + 2 - ja + (0.25 * ja);
		}
		return Math.floor(julian);
	}
}