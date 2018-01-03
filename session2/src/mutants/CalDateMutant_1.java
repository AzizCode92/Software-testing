package mutants;

import examples.CalDate;

public class CalDateMutant_1 extends CalDate {

	public CalDateMutant_1(int day, int month, int year) {
		super(day + 1, month, year);
	}

}
