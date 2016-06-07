package jp.ditgroup.algorithm;

import java.util.ArrayList;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class HeapSort {

	/**
	 * 入力チェック後、ArrayList配列として組み立てる また結果の出力も行う
	 */
	public static void main(String[] args) {
		ArrayList<Integer> orgArray = new ArrayList<Integer>();
		// 最初に入力されたデータのインデックスを[1]とするためダミーデータを格納
		orgArray.add(999);
		for (int i = 0, length = args.length; i < length; i++) {
			// 数字のみであるかの入力チェック
			if (!NumberUtil.isInt(args[i])) {
				System.out.println("数字以外が入力されました");
			}
			// 入力された数字をStringからintへ型変換後、ArrayListに詰める
			orgArray.add(CastUtil.strToInt(args[i]));
		}
		System.out.print("並べ替え前：");
		// 並べ替え前の配列を出力
		arrayPrintln(orgArray);
		System.out.print("並べ替え後：");
		// 並べ替えの済んだ配列を格納
		ArrayList<Integer> newArray = calculateHeap(orgArray);
		// 並べ替え後の配列を出力
		arrayPrintln(newArray);
	}

	/**
	 * ヒープソートによる並び替え処理(昇順)
	 *
	 * @param 入力された配列
	 * @return ソート後の配列
	 */
	public static ArrayList<Integer> calculateHeap(ArrayList<Integer> orgArray) {
		for (int i = orgArray.size() - 1; i >= 1; i--) {
			int parent = 1;
			while (parent <= i / 2) {
				int leftChild = parent * 2;
				int rightChild = leftChild + 1;
				// 子2(rightChild)が存在しない時
				if (rightChild > i) {
					rightChild = leftChild;
				}
				if (orgArray.get(leftChild) < orgArray.get(rightChild)) {
					int temp = orgArray.get(leftChild);
					orgArray.set(leftChild, orgArray.get(rightChild));
					orgArray.set(rightChild, temp);
				}
				if (orgArray.get(parent) < orgArray.get(leftChild)) {
					int temp = orgArray.get(parent);
					orgArray.set(parent, orgArray.get(leftChild));
					orgArray.set(leftChild, temp);
					// 1つ前にも親子関係がある時
					if (parent > 0) {
						parent = parent / 2;
					}
				} else {
					parent++;
				}
			}
			// ヒープ構造が完成したら、頂点と末端のデータを交換
			int temp = orgArray.get(1);
			orgArray.set(1, orgArray.get(i));
			orgArray.set(i, temp);
		}
		return orgArray;
	}

	/**
	 * 配列の値を出力する
	 *
	 * @param 配列
	 */
	public static void arrayPrintln(ArrayList<Integer> array) {
		// ダミーデータを表示しないようにarray[1]から出力
		for (int i = 1, size = array.size(); i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("");
	}
}
