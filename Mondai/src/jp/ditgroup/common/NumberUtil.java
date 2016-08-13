package jp.ditgroup.common;

public class NumberUtil {
	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isNotZero(String str) {
		try {
			Integer.parseInt(str);
			if (Integer.parseInt(str) == 0) {
				return false;
			}
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isNotOdd(String str) {
		try {
			Integer.parseInt(str);
			if (Integer.parseInt(str) % 2 != 1) {
				return false;
			}
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isPositiveNumber(String str) {
		try {
			Double.parseDouble(str);
			if (Double.parseDouble(str) >= 0) {
				return true;
			}
			return false;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
