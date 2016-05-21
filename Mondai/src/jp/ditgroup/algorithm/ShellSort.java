package jp.ditgroup.algorithm;

/**
 * 数の塊を小さい順に並べ替えをするクラス 塊の中で小さい数を順に見つけて左端から順に詰めていき、並べ替える作業を繰り返します。
 */
public class ShellSort {
	/**
	 * 結果の配列を出力
	 */
	public static void main(String[] args) {
		int type[] = calculateShell();
		for (int i = 0, num = type.length; i < num; i++) {
			System.out.print(type[i] + " ");
		}
	}

	/**
	 * 配列を小さい順に並べ替え
	 *
	 * @return array 並べ替え後の配列
	 */
	public static int[] calculateShell() {
		int array[] = { 35, 26, 48, 34, 42, 55, 10, 12, 1, 67, 62 };
		int range = array.length / 2;
		while (range > 0) {
			int i = 0;
			int j = i + range;
			while (j < array.length) {
				if (array[i] < array[j]) {
					// 交換が必要な時
					int big = array[j];
					int small = array[i];
					array[i] = big;
					array[j] = small;
					if (i - range >= 0) {
						// 幅分戻れたら戻る
						i = i - range;
						j = j - range;
					}
				} else {
					// 交換できない
					i = i + 1;
					j = i + range;
				}
			}
			range = range / 2;
		}
		return array;
	}
}
