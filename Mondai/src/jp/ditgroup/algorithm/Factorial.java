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
		System.out.println(args[0] + "の階乗は " + getFact(args[0]) + " です");
	}

	/**
	 * 階乗を計算
	 *
	 * @param コマンドライン引数1
	 * @return 計算結果
	 */
	public static int getFact(String value) {
		int v = CastUtil.strToInt(value);
		int fact = 1;

		for (int i = 1; i <= v; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
