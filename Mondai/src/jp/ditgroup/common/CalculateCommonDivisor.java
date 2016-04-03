package jp.ditgroup.common;

public class CalculateCommonDivisor {

	/**
	 * 二つの整数から最大公約数を算出
	 *
	 * @param コマンドライン引数1
	 * @param コマンドライン引数2
	 * @return
	 */
	public static int getCommonDivisor(int big, int small) {
		int b = big;
		int s = small;
		int r = 0;
		// ユークリッドの控除法
		while ((r = b % s) != 0) {
			b = s;
			s = r;
		}
		return s;
	}
}
