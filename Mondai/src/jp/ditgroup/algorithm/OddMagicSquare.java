package jp.ditgroup.algorithm;

/**
 * 奇数の魔方陣を求めるクラス 縦、横、斜めのそれぞれの三つの数字を合計するとどれも同じ奇数の数字になります。
 */
public class OddMagicSquare {
	public static void main(String[] args) {
		int t[][] = getMagicSquare();
		for (int y = 1; y <= 3; y++) {
			for (int x = 1; x <= 3; x++) {
				System.out.print(t[x][y] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] getMagicSquare() {
		int t[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int n = t[1].length - 1;
		int value, x, y;
		x = n / 2 + 1;
		y = 1;
		t[x][y] = 1;
		for (value = 2; value <= 9; value++) {
			if (value % n == 1) {
				y = y + 1;
			} else {
				x = x + 1;
				y = y - 1;
			}
			if (x > n) {
				x = 1;
			}
			if (y < 1) {
				y = n;
			}
			t[x][y] = value;
		}
		return t;
	}
}
