package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 四捨五入をするクラス</h3> コマンドラインで入力された実数を入力された桁数に四捨五入します。
 *
 */
public class Rounding {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if (!NumberUtil.isDouble(args[0])) {
			System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		if (!NumberUtil.isInt(args[1])) {
			System.out.println("第二引数に数字以外の文字列が入力されました");
		}
		System.out.println(getRound(args));
	}

	/**
	 * 四捨五入の処理
	 * 
	 * @param コマンドライン引数1
	 * @return 四捨五入された数値
	 */
	public static double getRound(String[] args) {
		// コマンドラインからくるString型の値をdouble型に変換
		double jissu = CastUtil.strToDouble(args[0]);
		double result = jissu * getPow("10", args[1]) + 0.5;
		// 小数を整数に変換
		int seisu = (int) result;
		double answer = (double) seisu / getPow("10", args[1]);
		return answer;
	}

	/**
	 * べき乗の計算
	 * 
	 * @param origin
	 *            元の数字
	 * @param number
	 *            乗数
	 * @return 計算結果
	 */
	public static int getPow(String value, String multiPlier) {
		// べき乗を計算
		int power = 1;
		int origin = Integer.parseInt(value);
		int number = Integer.parseInt(multiPlier);
		for (int i = 1; i <= number; i++) {
			power = power * origin;
		}
		return power;
	}
}
