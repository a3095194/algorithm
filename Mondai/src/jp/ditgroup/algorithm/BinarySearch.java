package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class BinarySearch {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if (!NumberUtil.isInt(args[0])) {
			System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		System.out.println(getMatchNum(args[0]));
	}

	/**
	 * 二分探索を実行
	 * 
	 * @param コマンドライン引数1
	 * @param big
	 *            配列の上端
	 * @param small
	 *            配列の下端
	 * @return 見つけたデータの格納場所
	 */
	public static int getMatchNum(String keyNum) {
		// 11個のデータを格納
		int array[] = { 11, 13, 27, 31, 35, 44, 52, 65, 70, 88, 96 };
		int small = 0;
		int big = array.length - 1;
		int key = CastUtil.strToInt(keyNum);
		do {
			int center = (small + big) / 2;
			if (array[center] == key) {
				return center;
			} else if (key < array[center]) {
				big = center - 1;
			} else {
				small = center + 1;
			}
		} while (big >= small);
		return -1;
	}
}
