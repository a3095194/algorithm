package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 階乗を求めるクラス コマンドラインで入力された整数の階乗を算出します。
 */
public class Factorial {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if (!NumberUtil.isInt(args[0])) {
			System.out.println("引数に数字以外の文字列が入力されました");
		}
		int value = CastUtil.strToInt(args[0]);
		System.out.println(args[0] + "の階乗は " + calculateFact(value) + " です");
	}

	/**
	 * 階乗を計算
	 *
	 * @param コマンドライン引数1
	 * @return 計算結果
	 */
	public static int calculateFact(int value) {
		int fact = 1;
		int count = fact;
		int j = 0;
		int i = 1;
		if (count == 1) {
			j = value;
		}
		if (count >= 2) {
			i = value;
		}
		// for (int i = 1; i <= value; i++) {
		// fact = fact * i;
		// }

		if (i <= j) {
			i = 0;
			fact = fact * i;
			calculateFact(i + 1);
		}

		return fact;
	}
}
