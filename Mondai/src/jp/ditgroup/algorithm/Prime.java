package jp.ditgroup.algorithm;

/**
 * 素数を求めるクラス</h3>
 * 2～100までの素数を算出します。
 */
public class Prime {
	public static void main(String[] args) {
		getPrime();
	}

	/**
	 * 素数を計算
	 */
	public static void getPrime() {
		int t[] = new int[100];
		int i, j;
		//配列tに2～99までの数字を格納(1は素数とはしないため除外)
		for(i = 2; i < 100; i++){
			t[i]= i;
		}
		//2～8までの倍数を除外する(0をセットする)
		for(i = 2; i < 8; i++){
			for(j = i + i; j < 100; j = j + i){
				t[j]= 0;
			}
		}
		for(i = 2; i < 100; ){
			for(j = 0; j < 10 && i < 100; i++){
				if (t[i] != 0){
					System.out.print("   " + i);
					j++;
				}
			}
		}
	}
}
