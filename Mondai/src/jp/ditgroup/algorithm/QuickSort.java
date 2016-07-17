package jp.ditgroup.algorithm;

import java.util.ArrayList;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
import jp.ditgroup.common.ReplaceValue;

public class QuickSort {

	/**
	 * 入力チェックとArrayList配列への格納を行う
	 *
	 * @param コマンドライン引数の配列
	 */
	public static void main(String[] args) {
		ArrayList<Integer> orgArray = new ArrayList<Integer>();
		for (String check : args) {
			// 数字のみであるかの入力チェック
			if (!NumberUtil.isInt(check)) {
				System.out.println("数字以外が入力されました");
			}
		}
		for (String cast : args) {
			// 入力された数字をStringからintへ型変換後、ArrayListに詰める
			orgArray.add(CastUtil.strToInt(cast));
		}
		System.out.print("並べ替え前：");
		// 並べ替え前の配列を出力
		arrayPrintln(orgArray);

		// ソート済みの配列を格納
		ArrayList<Integer> quickSortedArray = sortingQuick(orgArray, 0, orgArray.size() - 1);

		System.out.print("並べ替え後：");
		// 並べ替え後の配列を出力
		arrayPrintln(quickSortedArray);
	}

	/**
	 * クイックソートによる並び替え処理(昇順)
	 *
	 * @param array
	 *            入力された配列
	 * @param top
	 *            左端
	 * @param bottom
	 *            右端
	 * @return 並べ替え後の配列
	 */
	public static ArrayList<Integer> sortingQuick(ArrayList<Integer> array, int top, int bottom) {
		int i = top;
		int j = bottom;
		// 配列中央の値をpivot(軸)にする
		int pivot = array.get((top + bottom) / 2);
		while (true) {
			while (array.get(i) < pivot) {
				// 軸以上の値が見つかるまで右方向へ進めてい
				i++;
			}
			while (array.get(j) > pivot) {
				// 軸以下の値が見つかるまで左方向へ進めていく
				--j;
			}
			// 検索対象がぶつかったら並べ替えを終える
			if (i >= j) {
				break;
			}
			// データの入れ替え
			ReplaceValue.doReplace(array, i, j);
			i++;
			j--;
		}
		// 軸の左側の要素が二つ以上の時に左側を並べ替えする
		if (top < i - 1) {
			sortingQuick(array, top, i - 1);
		}
		// 軸の右側の要素が二つ以上の時に右側を並べ替えする
		if (j + 1 < bottom) {
			sortingQuick(array, j + 1, bottom);
		}
		return array;
	}

	/**
	 * 配列の値を出力する
	 *
	 * @param 配列
	 */
	public static void arrayPrintln(ArrayList<Integer> array) {
		for (int output : array) {
			System.out.print(output + " ");
		}
		System.out.println("");
	}
}
