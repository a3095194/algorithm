package jp.ditgroup.algorithm;
import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 二つの数字の最大公約数を求めるクラス</h3>
 * コマンドラインで入力された二つの数字から最大公約数を算出します。
 *
 */
public class GreatestCommonDivisor {
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
		System.out.println("最大公約数は " + getCommonDivisor(args[0], args[1]) + " です");
}
	/**
	 * 入力された二つの整数から最大公約数を算出
	 * @param コマンドライン引数1
	 * @param コマンドライン引数2
	 * @return
	 */
	public static int getCommonDivisor(String big, String small) {
		int b =  CastUtil.strToInt(big);
		int s =  CastUtil.strToInt(small);
		int r = 0;
		//ユークリッドの控除法
		while( (r = b % s) != 0 ) {
			b = s;
			s = r;
		}
	return s;
	}
}
