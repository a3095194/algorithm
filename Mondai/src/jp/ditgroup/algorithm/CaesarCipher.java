package jp.ditgroup.algorithm;

import jp.ditgroup.common.NumberUtil;

public class CaesarCipher {
	/**
	 * 文字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		// 入力チェックを文字数分する
		for (int i = 0; i < args.length; i++) {
			if (NumberUtil.isInt(args[i])) {
				System.out.println("引数に数字が入力されました");
			}
		}
		String cipher[] = getCipher(args);
		for (int i = 0; i < cipher.length; i++) {
			System.out.print(cipher[i]);
		}
	}

	/**
	 * 元の文を暗号化する
	 * 
	 * @param 暗号化したい文字列
	 * @return 暗号文
	 */
	public static String[] getCipher(String[] args) { // メソッドの引数に配列を持ってくるのは避けるべきなのは覚えていますが、上手い書き方が思いつきませんでした
		String normal[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", " " };
		String setting[] = { "X", "Y", "Z", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W" };
		String[] cipher = new String[args.length];

		for (int i = 0; i < args.length; i++) {
			int j = 0; // 宣言はforの前でしてここでは初期化(j = 0;)のみをするべきでしょうか？
			while (!args[i].equals(normal[j])) {
				j++;
			}
			cipher[i] = setting[j];
		}
		return cipher;
	}
}
