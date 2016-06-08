package jp.ditgroup.algorithm;

import java.util.ArrayList;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
import jp.ditgroup.common.Replace;

public class HeapSort {

	/**
	 * 入力チェックとArrayList配列への格納を行う
	 *
	 * @param args
	 *            コマンドライン引数の配列
	 */
	public static void main(String[] args) {
		ArrayList<Integer> orgArray = new ArrayList<Integer>();
		for (int i = 0, length = args.length; i < length; i++) {
			// 数字のみであるかの入力チェック
			if (!NumberUtil.isInt(args[i])) {
				System.out.println("数字以外が入力されました");
			}
			// 入力された数字をStringからintへ型変換
			int data = CastUtil.strToInt(args[i]);
			// 変換した数字をList型配列に入れる
			orgArray.add(i, data);
		}
		System.out.print("並べ替え前：");
		// 並べ替え前の配列を出力
		arrayPrintln(orgArray);
		System.out.print("並べ替え後：");
		// ソート済みの配列を格納
		ArrayList<Integer> sortedHeapArray = sortingHeap(orgArray);
		// 並べ替え後の配列を出力
		arrayPrintln(sortedHeapArray);
	}

	/**
	 * ヒープソートによる並び替え処理(昇順)
	 *
	 * @param orgArray
	 *            入力された配列
	 * @return editingArray ソート後の配列
	 */
	private static ArrayList<Integer> sortingHeap(ArrayList<Integer> orgArray) {
		// 編集用のList型配列を作成
		ArrayList<Integer> editingArray = orgArray;
		// 最初に入力されたデータのインデックスを[1]とするため[0]へダミーデータを格納
		editingArray.add(0, 999);
		for (int i = editingArray.size() - 1; i >= 1; i--) {
			int parent = 1;
			while (parent <= i / 2) {
				int leftChild = parent * 2;
				int rightChild = leftChild + 1;
				// 子2(rightChild)が存在しない時
				if (rightChild > i) {
					rightChild = leftChild;
				}
				if (editingArray.get(leftChild) < editingArray.get(rightChild)) {
					// 入れ替えの処理
					Replace.doReplace(editingArray, leftChild, rightChild);
				}
				if (editingArray.get(parent) < editingArray.get(leftChild)) {
					// 入れ替えの処理
					Replace.doReplace(editingArray, parent, leftChild);
					// 1つ前にも親子関係がある時
					if (parent > 0) {
						parent = parent / 2;
					}
				} else {
					parent++;
				}
			}
			// ヒープ構造が完成したら、頂点のデータと末端のデータを交換
			int temp = editingArray.get(1);
			editingArray.set(1, editingArray.get(i));
			editingArray.set(i, temp);
		}
		// 並べ替えが終わったらダミーデータを除去する
		editingArray.remove(0);
		return editingArray;
	}

	/**
	 * 配列の値を出力する
	 *
	 * @param array
	 *            配列
	 */
	private static void arrayPrintln(ArrayList<Integer> array) {
		for (int i = 0, size = array.size(); i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println(" ");
	}
}
