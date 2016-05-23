package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class SequentialSearch {
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
	 * 線形探索(番兵法)を実行
	 *
	 * @param コマンドライン引数1
	 * @return 見つけたデータの格納場所
	 */
	public static int getMatchNum(String keyNum) {
		// 番兵には入力された値を格納する
		int array[] = { 5, 2, 3, 9, 0 };
		array[array.length - 1] = CastUtil.strToInt(keyNum);
		int trimKeyNum = array[array.length - 1];
		// 配列の中身を先頭からチェックし、入力値と同じ値を配列の中から見つけたら何番目に格納されているかを返却
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == trimKeyNum) {
				return i + 1;
			}
		}
		return -1;
	}
}
