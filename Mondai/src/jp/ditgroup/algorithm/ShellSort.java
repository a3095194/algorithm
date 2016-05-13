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
		int array[] = { 35, 26, 48, 34, 42 };
		for (int i = 0, length = array.length; i < length; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			if (min != i) {
				int tmp = array[min];
				array[min] = array[i];
				array[i] = tmp;
			}
		}
		return array;
	}
}
