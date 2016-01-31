package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * 配列内の数字を並べ替えするクラス</h3>
 * コマンドラインで入力された数字を配列に挿入してソートします。
 */
public class NumInsert {
	/**
	 * 文字列以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(!NumberUtil.isInt(args[0])){
        	System.out.println("第一引数に文字列以外が入力されました");
		}
		int [] trimArray = getNumSort(args[0]);
		for(int i = 0; i < trimArray.length; i++ ){
			System.out.print(trimArray[i] + " ");
		}
	}

	/**
	 * ソートの処理(大きい順)
	 * @param コマンドライン引数1
	 * @return ソート後の配列
	 */
	public static int[] getNumSort(String number) {
		int num = CastUtil.strToInt(number);
		int array [] = {94,88,76,65,58,0};
		for(int i = array.length -2; i >= 0; i--){
			if(array[i] <= num){
				array[i + 1] = array[i];
				array[i] = num;
			}else{
				array[i + 1] = num;
				break;
			}
		}
		return array;
	}

}
