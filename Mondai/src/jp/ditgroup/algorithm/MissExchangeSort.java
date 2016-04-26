package jp.ditgroup.algorithm;

public class MissExchangeSort {
	/**
	 * 結果の配列を出力
	 */
	public static void main(String[] args) {
		int type[] = calculateExchange();
		for (int i = 0, num = type.length; i < num; i++) {
			System.out.print(type[i] + " ");
		}
	}

	public static int[] calculateExchange() {
		int orgArray[] = { 35, 26, 48, 34, 32 };
		int newArray[] = { 35, 26, 48, 34, 32 };
		for (int i = 0, num = orgArray.length; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (orgArray[i] < orgArray[j]) {
					newArray[i] = orgArray[j];
					newArray[j] = orgArray[i];
					orgArray = newArray;
				}
			}

		}
		return newArray;
	}
}
