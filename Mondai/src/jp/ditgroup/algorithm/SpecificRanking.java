package jp.ditgroup.algorithm;

import java.util.ArrayList;
import java.util.List;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
import jp.ditgroup.common.ReplaceValue;

public class SpecificRanking {

	/**
	 * 入力チェックと順位の格納
	 *
	 * @param コマンドライン引数(任意の順位)
	 */
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(49);
		array.add(32);
		array.add(11);
		array.add(90);
		array.add(31);
		array.add(75);
		array.add(58);
		array.add(46);
		array.add(12);
		// 数字であるかの入力チェック
		if (!NumberUtil.isInt(args[0])) {
			System.out.println("数字以外が入力されました");
		}
		// 0(ゼロ)でないかの入力チェック
		if (!NumberUtil.isNotZero(args[0])) {
			System.out.println("0(ゼロ)が入力されました");
		}
		// 入力された数字をStringからintへ型変換
		int rank = CastUtil.strToInt(args[0]);
		// 元となるデータの配列を出力
		arrayPrintln(array);
		// 入力された数字がデータ数以上の値だった時
		if (rank > array.size()) {
			System.out.println("上記のデータ数しか存在しないため" + rank + "位は存在しえません");

		} else {
			// 入力した順位にあるデータを取得
			int matchRankData = serchMatchData(array, rank - 1);
			// 結果の出力
			System.out.println("上記のデータのうち「" + rank + "位」は「" + matchRankData + "」です");
		}
	}

	private static int serchMatchData(List<Integer> array, int rank) {
		boolean ctl = false;
		int data = array.get(rank);
		do {
			ctl = false;
			for (int i = 0, size = array.size(); i < size; i++) {
				if (i < rank) {
					if (array.get(i) > array.get(rank)) {
						ReplaceValue.doReplace(array, rank, i);
						data = array.get(rank);
						ctl = true;
					}
				} else {
					if (array.get(i) < array.get(rank)) {
						ReplaceValue.doReplace(array, rank, i);
						data = array.get(rank);
						ctl = true;
					}
				}
			}
		} while (ctl == true);
		return data;
	}

	/**
	 * 配列の値を出力する
	 *
	 * @param 配列
	 */
	private static void arrayPrintln(List<Integer> array) {
		for (int i = 0, size = array.size(); i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("");
	}
}
