package jp.ditgroup.algorithm;

import jp.ditgroup.common.NumberUtil;

public class StationDistance {
	/**
	 * 文字列以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if (NumberUtil.isInt(args[0])) {
			System.out.println("第一引数に文字列以外が入力されました");
		}
		if (NumberUtil.isInt(args[1])) {
			System.out.println("第二引数に文字列以外が入力されました");
		}
		double num = getDistance(args[0], args[1]);
		if (num == 9999.9) {
			System.out.println("計算できませんでした");
		} else {
			System.out.println(num);
		}
	}

	/**
	 * 入力された二つの駅間の距離を算出
	 *
	 * @param コマンドライン引数1(駅名１)
	 * @param コマンドライン引数2(駅名２)
	 * @return 距離
	 */
	public static double getDistance(String first, String second) {
		double firstDis = getTwoDistatnce(first);
		double secondDis = getTwoDistatnce(second);
		// 大きい数字から小さい数字を引くように調整
		if ((firstDis == 9999.9) || (secondDis == 9999.9)) {
			return 9999.9;
		} else if (firstDis > secondDis) {
			double result = firstDis - secondDis;
			return result;
		} else {
			double result = secondDis - firstDis;
			return result;
		}
	}

	/**
	 * 入力された駅の基点からの距離を求める
	 *
	 * @param コマンドライン引数(駅名)
	 * @return 距離
	 *
	 */

	public static double getTwoDistatnce(String station) {
		String name[] = { "西京", "小宮", "野宮", "白川", "富島", "新川", "粟駒", "西上", "木巻", "盛岡" };
		double distance[] = { 0.0, 30.3, 109.5, 185.4, 272.8, 395, 416.2, 487.5, 500.0, 535.3 };
		double dis = 0.0;
		boolean firstBool = false;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(station)) {
				dis = distance[i];
				firstBool = true;
			}
		}
		if (!firstBool) {
			System.out.println(station + " は存在しません");
			return 9999.9;
		} else {
			return dis;
		}
	}
}
