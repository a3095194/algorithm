package jp.ditgroup.algorithm;

import jp.ditgroup.common.NumberUtil;

public class CopyOfStationDistance {
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
	 * 入力された駅の基点からの距離を求める
	 * @param コマンドライン引数(駅名)
	 * @return 距離
	 */
	public static double getTwoDistance(String station){
		String name [] = {"西京","小宮","野宮","白川","富島","新川","粟駒","西上","木巻","盛岡"};
		double distance [] = {0.0, 30.3, 109.5, 185.4, 272.8, 395, 416.2, 487.5, 500.0, 535.3};
		double dis = 0;
		int i = 0;
		while(!name[i].equals (station)){
			i++;
		}
		dis = distance[i];
		return dis;
	}

	/**
	 * 二つの駅の基点からの距離を比較して大きい方から小さい方の距離を引く
	 * @param 駅名１の基点からの距離
	 * @param 駅名２の基点からの距離
	 * @return 二つの駅間の距離
	 */
	public static double getDistance(String firStation, String secStation){
		double firDis =getTwoDistance(firStation);
		double secDis =getTwoDistance(secStation);
		if(firDis > secDis){
			double result = firDis - secDis;
			return result;
			}else{
			double result = secDis - firDis;
		return result;
		}
	}
}


