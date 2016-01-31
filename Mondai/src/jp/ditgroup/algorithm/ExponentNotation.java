package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 指数表記に変換するクラス</h3>
 * 実数を「0.~ E *」の形に変換します。
 */
public class ExponentNotation {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(!NumberUtil.isDouble(args[0])){
        	System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		double result [] = getExponentNotation(args[0]);
		System.out.println(result[0] + " " + "E " + (int)result[1]);
	}

	/**
	 * 入力された実数を指数表記に変換
	 * @param コマンドライン引数1(実数)
	 * @param
	 * @return 指数表記の数値
	 */
	public static double[] getExponentNotation(String real){
		int multiplier = 0;
		double r = CastUtil.strToDouble(real);
		while(r < 0.1 || 1.0 < r){
			if(r >= 1.0){
				r = r / 10;
				multiplier = multiplier + 1;
			}else{
				r = r * 10;
				multiplier = multiplier - 1;
			}
		}
		double result[] = {r, multiplier};
		return result;
	}

}
