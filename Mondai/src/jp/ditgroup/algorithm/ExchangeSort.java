package jp.ditgroup.algorithm;

/**
 * 数の塊を大きい順に並べ替えをするクラス 左端から右端に向かって数の大きさを比較し、並べ替える作業を繰り返します。
 */
public class ExchangeSort {
	/**
	 * 結果の配列を出力
	 */
	public static void main(String[] args) {
		int type[] = calculateExchange();
		for (int i = 0, num = type.length; i < num; i++) {
			System.out.print(type[i] + " ");
		}
	}

	/**
	 * 配列を大きい順に並べ替え
	 *
	 * @return 並べ替え後の配列
	 */
	public static int[] calculateExchange() {
		int array[] = { 35, 26, 48, 34, 42 };
		for (int i = 0, num = orgArray.length; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (array[i] < array[j]) {
					int big = array[j];
					int small = array[i];
					array[i] = big;
					array[j] = small;
				}
			}
		}
		return array;
	}
}
