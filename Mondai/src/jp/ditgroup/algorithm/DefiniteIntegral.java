package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class DefiniteIntegral {
	/**
	 * 入力チェックと区間幅の格納
	 *
	 * @param args
	 *            コマンドライン引数(任意の区間幅)
	 */
	public static void main(String[] args) {
		// 正の数であるかの入力チェック
		if (!NumberUtil.isDouble(args[0]) || !NumberUtil.isPositiveNumber(args[0])) {
			System.out.println("「" + args[0] + "」" + "という" + "数字以外もしくは負の数が入力されました");
		}
		// 区間幅をコマンドライン引数からString→double変換して取得
		double secRange = CastUtil.strToDouble(args[0]);
		if (secRange > 0.0) {
			// 台形の公式を使った定積分の結果を取得
			double answer = calculateDefiniteIntegral(secRange);
			if (answer != 0.0) {
				System.out.println(answer);
			} else {
				System.out.println("入力した区間幅" + "「" + args[0] + "」" + "は積分区間をオーバーしています。「1.0」以下「0.0」以上を入力してください");
			}
		} else {
			System.out.println("0.0より大きい小数を入力して下さい");
		}
	}

	/**
	 * 台形の公式による定積分計算
	 *
	 * @param secRange
	 *            入力された区間幅
	 * @return sum 積分区間の面積
	 */
	private static double calculateDefiniteIntegral(double secRange) {
		double sum = 0.0;
		double start = 0.0;
		// 台形の公式「(上底 + 下底) * 高さ / 2」を分割数分繰り返す
		for (double end = 0.0; end <= 1.0; end = end + secRange) {
			// 区間幅で区切られた台形の面積を足していく
			sum = sum + (Math.pow(start, 3) + Math.pow(end, 3)) * secRange / 2;
			// 面積を求める部分を右にシフトしていく
			start = end;
		}
		// 求めた面積の合計を返却
		return sum;
	}
}
