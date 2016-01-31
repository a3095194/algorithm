package jp.ditgroup.algorithm;
import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * ローレル指数を計算し、ローレル指数から体型を評価するクラス</h3>
 * コマンドラインで入力された身長と体重からローレル指数を算出します。
 *
 */
public class RohrerIndex {
	/**
	 * 数字以外が入力されていないかの入力チェック
	 */
	public static void main(String[] args) {
		if(!NumberUtil.isDouble(args[0])){
        	System.out.println("第一引数に数字以外の文字列が入力されました");
		}
		if(!NumberUtil.isDouble(args[1])){
        	System.out.println("第二引数に数字以外の文字列が入力されました");
		}
		double rohrer = getIndex(args[0], args[1]);
		if(rohrer < 100){
			System.out.println("痩せすぎ");
			}else if(rohrer < 115){
				System.out.println("やや痩せぎみ");
			}else if(rohrer < 150){
				System.out.println("平均");
			}else if(rohrer < 160){
				System.out.println("やや太りぎみ");
			}else{
				System.out.println("太りすぎ");
		}
	}

	/**
	 * 入力された身長と体重からローレル指数を算出
	 * @param コマンドライン引数1
	 * @param コマンドライン引数2
	 * @return ローレル指数
	 */
	public static double getIndex(String height, String weight) {
		double high = CastUtil.strToDouble(height);
		double wigh = CastUtil.strToDouble(weight);
		//身長の3乗を計算
		double threesqu = 1;
		for(int i = 1; i <= 3; i++){
			threesqu *= high;
		}
		//10の7乗を計算
		int sevensqu = 1;
		for(int i = 1; i <= 7; i++){
			sevensqu *= 10;
		}
		//体重÷身長の3乗×10の7乗
		double rohrer = wigh / threesqu * sevensqu;
		return rohrer;
	}
}
