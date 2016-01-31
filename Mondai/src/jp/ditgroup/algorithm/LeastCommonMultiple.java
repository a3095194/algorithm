package jp.ditgroup.algorithm;
import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
import jp.ditgroup.algorithm.GreatestCommonDivisor;

/**
 * 最小公倍数を求めるクラス</h3>
 * コマンドラインで入力された二つの整数の最小公倍数を算出します。
 */
public class LeastCommonMultiple {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(!NumberUtil.isInt(args[0])){
        	System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		if(!NumberUtil.isInt(args[1])){
        	System.out.println("第二引数に数字以外の文字列が入力されました");
		}
        if(!NumberUtil.isNotZero(args[0])){
            System.out.println("第一引数に0が入力されました");
		}
        if(!NumberUtil.isNotZero(args[1])){
            System.out.println("第二引数に0が入力されました");
		}
		System.out.println("最小公倍数は " + getCommonMultiple(args[0], args[1]) + " です");
	}
	/**
	 * 最小公倍数を計算
	 * @param コマンドライン引数1
	 * @param コマンドライン引数2
	 * @return 計算結果
	 */
	public static int getCommonMultiple(String big, String small) {
		int b = CastUtil.strToInt(big);
		int s = CastUtil.strToInt(small);
		int result = (b * s) / GreatestCommonDivisor.getCommonDivisor(big, small);
	return result;
	}
}
