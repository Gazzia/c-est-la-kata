package co.jallain;

import java.util.function.BooleanSupplier;

public class LeapYears {

	public static boolean check(int année) {
		// if (année % 400 == 0)
		// return true;
		// else if (année % 100 == 0)
		// return false;
		// else if (année % 4 == 0)
		// return true;
		// else
		// return false;

		return année % 400 == 0 ? true : année % 100 == 0 ? false : année % 4 == 0 ? true : false;
	}

}
