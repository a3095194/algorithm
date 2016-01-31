package jp.ditgroup.algorithm;

import jp.ditgroup.common.NumberUtil;

public class StationDistance {
	/**
	 * 文字列以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(NumberUtil.isInt(args[0])){
        	System.out.println("第一引数に文字列以外が入力されました");
		}
		if(NumberUtil.isInt(args[1])){
        	System.out.println("第二引数に文字列以外が入力されました");
		}
		System.out.println(getDistance(args[0],args[1]));
	}

	/**
	 * 入力された二つの駅間の距離を算出
	 * @param コマンドライン引数1(駅名１)
	 * @param コマンドライン引数2(駅名２)
	 * @return 距離
	 */
	public static double getDistance(String first, String second){
		String name [] = {"西京","小宮","野宮","白川","富島","新川","粟駒","西上","木巻","盛岡"};
		double distance [] = {0.0, 30.3, 109.5, 185.4, 272.8, 395, 416.2, 487.5, 500.0, 535.3};
		double firstDis = 0;
		double secondDis = 0;
		int i = 0;
		while(!name[i].equals (first)){
			i++;
		}
		firstDis = distance[i];
		i = 0;
		while(!name[i].equals (second)){
			i++;
		}
		secondDis = distance[i];
		//大きい数字から小さい数字を引くように調整
		if(firstDis > secondDis){
			double result = firstDis - secondDis;
			return result;
			}else{
				double result = secondDis - firstDis;
				return result;
		}
	}
}
