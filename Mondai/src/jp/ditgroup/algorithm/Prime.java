package jp.ditgroup.algorithm;

/**
 * 素数を求めるクラス 2～100までの素数を算出します。
 */
public class Prime {
	public static void main(String[] args) {
		calculatePrime();
	}

	/**
	 * 素数を計算
	 */
	public static void calculatePrime() {
		boolean flg;
		for (int i = 2; i <= 100; i++) {
			flg = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				System.out.println(i);
			}
		}
	}
}
