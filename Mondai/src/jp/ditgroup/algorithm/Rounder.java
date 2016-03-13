package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 四捨五入をするクラス</h3> コマンドラインで入力された実数を入力された桁数に四捨五入します。
 */
public class Rounder {
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
		System.out.println(calculation(args[0], args[1]));
	}

	/**
	 * 四捨五入の処理
	 *
	 * @param value
	 *            四捨五入する数値
	 * @param multiPlier
	 *            四捨五入したい桁数
	 * @return result 四捨五入された数値
	 */
	public static double calculation(String value, String multiPlier) {
		// コマンドラインからくるString型の値をdouble型に変換
		double jissu = CastUtil.strToDouble(value);
		// コマンドラインからくるString型の値をint型に変換
		int multiplier = CastUtil.strToInt(multiPlier);
		double powResult = pow(10, multiplier);
		double trimJissu = jissu * powResult + 0.5;
		// 小数を整数に変換
		int seisu = (int) trimJissu;
		double result = (double) seisu / powResult;
		return result;
	}

	/**
	 * べき乗の計算
	 *
	 * @param jissu
	 *            実数
	 * @param multiplier
	 *            四捨五入したい桁数
	 * @return power べき乗計算結果
	 */
	public static double pow(double jissu, int multiPlier) {
		// べき乗を計算
		double power = 1;
		for (int i = 1; i <= multiPlier; i++) {
			power = power * jissu;
		}
		return power;
	}
}