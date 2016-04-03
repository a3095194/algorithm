package jp.ditgroup.algorithm;

import jp.ditgroup.common.CalculateCommonDivisor;
import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 二つの数字の最大公約数を求めるクラス コマンドラインで入力された二つの数字から最大公約数を算出します。
 *
 */
public class GreatestCommonDivisor {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if (!NumberUtil.isInt(args[0])) {
			System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		if (!NumberUtil.isInt(args[1])) {
			System.out.println("第二引数に数字以外の文字列が入力されました");
		}
		if (!NumberUtil.isNotZero(args[0])) {
			System.out.println("第一引数に0が入力されました");
		}
		if (!NumberUtil.isNotZero(args[1])) {
			System.out.println("第二引数に0が入力されました");
		}
		int[] num = new int[2];
		for (int i = 0; i < args.length; i++) {
			num[i] = CastUtil.strToInt(args[i]);
		}
		System.out.println("最大公約数は " + CalculateCommonDivisor.getCommonDivisor(num[0], num[1]) + " です");
	}
}
