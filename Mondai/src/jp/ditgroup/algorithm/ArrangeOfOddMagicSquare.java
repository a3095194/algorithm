package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
/**
 * 奇数の魔方陣を求めるクラス</h3>
 * 縦、横、斜めのそれぞれの数字を合計するとどれも同じ奇数の数字になります。
 */
public class ArrangeOfOddMagicSquare {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(!NumberUtil.isInt(args[0])){
        	System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		if(!NumberUtil.isNotOdd(args[0])){
        	System.out.println("第一引数に奇数以外の数字が入力されました");
		}
		int t [][] = getMagicSquare(args[0]);
		for(int y = 1; y < t[0].length; y++){
			for(int x = 1; x < t[0].length; x++){
				System.out.print(t[x][y] + " ");
			}
			System.out.println("");
		}
	}
	/**
	 * 入力値×入力値の魔方陣を作成
	 * @param コマンドライン引数1
	 * @param
	 * @return 魔方陣となった配列
	 */
	public static int[][] getMagicSquare(String number) {
		int i =  CastUtil.strToInt(number) + 1;
		int t [][]  = new int [i][i];
		int n = t[1].length - 1;
		int value, x, y;
		x = n / 2 + 1;
		y = 1;
		t[x][y] = 1;
		for(value = 2; value <= n * n; value++){
			if(value % n == 1){
				y = y + 1;
			}else{
				x = x + 1;
				y = y - 1;
			}
			if(x > n){
				x = 1;
			}
			if(y < 1){
				y = n;
			}
			t[x][y] = value;
		}
		return t;
	}
}
