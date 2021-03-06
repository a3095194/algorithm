﻿package jp.ditgroup.common;

import java.util.ArrayList;

public class Replace {
	/**
	 * 配列内でデータの入れ替え
	 *
	 * @param array
	 *            入れ替え前の配列
	 * @param first
	 *            小さいデータのインデックス
	 * @param second
	 *            大きいデータのインデックス
	 * @return 入れ替え後の配列
	 */
	public static ArrayList<Integer> doReplace(ArrayList<Integer> array, int first, int second) {
		int temp = array.get(first);
		array.set(first, array.get(second));
		array.set(second, temp);
		return array;
	}
}
