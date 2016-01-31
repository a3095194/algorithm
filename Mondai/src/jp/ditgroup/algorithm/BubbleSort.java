package jp.ditgroup.algorithm;

/**
 * 配列内の数字をバブルソートで並べ替えするクラス</h3>
 * 小さい順に並べ替えします。
 */
public class BubbleSort {
	public static void main(String[] args) {
		int array [] = getSortArray();
		for(int i = 0; i < array.length; i++){
		System.out.println(array[i]);
		}
	}
	/**
	 * ソート処理(小さい順)
	 * @param
	 * @return ソート後の配列
	 */
	public static int [] getSortArray() {
		int array [] = {35,26,48,34,42,18};
		int temp = 0;
		for(int i = 0; i < array.length -1; i++){
			for(int j = 0; j < array.length -1; j++){
				if(array[j] > array[j + 1]){
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;

	}
}


