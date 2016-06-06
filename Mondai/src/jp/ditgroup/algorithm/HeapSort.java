package jp.ditgroup.algorithm;

import java.util.ArrayList;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class HeapSort {

	/**
	 * 入力チェック後、ArrayList配列として組み立てる また結果の出力も行う
	 */
	public static void main(String[] args) {
		// 並べ替え前の配列を出力
		System.out.print("並べ替え前：");
		for (String a : args) {
			System.out.print(a + " ");
		}
		System.out.println();
		ArrayList<Integer> orgArray = new ArrayList<Integer>();
		// rootのインデックスを[1]とする為、頭にダミーデータを入れる
		orgArray.add(999);
		for (int i = 0, length = args.length; i < length; i++) {
			// 数字のみであるかの入力チェック
			if (!NumberUtil.isInt(args[i])) {
				System.out.println("数字以外が入力されました");
			}
			// 入力された数字をStringからintへ型変換後、ArrayListに詰める
			orgArray.add(CastUtil.strToInt(args[i]));
		}
		// 受け取ったソート済みの配列を出力
		System.out.print("並べ替え後：");
		ArrayList<Integer> newArray = calculateHeap(orgArray);
		for (int i = 1, size = newArray.size(); i < size; i++) {
			System.out.print(newArray.get(i) + " ");
		}
	}

	public static ArrayList<Integer> calculateHeap(ArrayList<Integer> orgArray) {
		for (int i = orgArray.size() - 1; i >= 1; i--) {
			int parent = 1; // ここを1にすると頂点がいつまで経っても変えられないが、0にすると子の場所が正確にとれない
			while (parent <= i / 2) {
				int childLeft = parent * 2;
				int rightNode = parent * 2 + 1;
				if (rightNode > i) {
					rightNode = childLeft;
				}
				if (orgArray.get(childLeft) < orgArray.get(rightNode)) {
					int temp = orgArray.get(childLeft);
					orgArray.set(childLeft, orgArray.get(rightNode));
					orgArray.set(rightNode, temp);
				}
				if (orgArray.get(parent) < orgArray.get(childLeft)) {
					int temp = orgArray.get(parent);
					orgArray.set(parent, orgArray.get(childLeft));
					orgArray.set(childLeft, temp);
					parent = parent / 2;
					if (parent < 1) {
						parent = 1;
					}
				} else {
					parent++;
				}
			}
			int temp = orgArray.get(1);
			orgArray.set(1, orgArray.get(i));
			orgArray.set(i, temp);
		}
		return orgArray;
	}
}
