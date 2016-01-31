package jp.ditgroup.algorithm;

/**
 * データを分類するクラス</h3>
 * 同じデータには同じナンバリングでデータを分類します。
 *
 */
public class DataType {
	/**
	 * 結果の配列を出力
	 */
	public static void main(String[] args) {
		int type [][] = executeClassification();
		for(int i = 0; i < type[0].length; i++){
			System.out.print(type[0][i] + " ");
		}
		System.out.println("");
		System.out.print(" ");
		for(int i = 0; i < type[0].length; i++){
			System.out.print(type[1][i] + "  ");
		}

	}
	/**
	 * 二次元配列に格納されたデータをナンバリングで分類
	 * @param
	 * @param
	 * @return 分類後の配列
	 */
	public static int[][] executeClassification(){
		int type [][] = {{10,60,20,40,60,50,20,80,60,40},
							{0,0,0,0,0,0,0,0,0,0}};
		int max = 0;
		for(int i = 0; i < type[0].length; i++){
			//ナンバリングが空(ゼロ)であれば現状のナンバリング+1を格納
			if(type[1][i] == 0){
				type[1][i] =  max + 1;
				//同じ種類のデータを見つけたらそのデータにも同じナンバリング
				for(int j = 0; j < type[0].length; j++){
					if(type[0][i] == type[0][j]){
						type[1][j] = type[1][i];
					}
				}
			//現状のナンバリング(＝最大)を保持
			max = type[1][i];
			}
		}
	return type;
	}
}
