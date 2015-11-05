public class Mondai8 {

	public static void main(String[] args) {
		int t[][] = new int[5][5];
		int n, x, y, xw, yw;
		y = 4;
		x = 2;

		for(n = 1; n < 26; n++){
			t[y][x] = n;
			yw = (y + 1) % 5;
			xw = (x + 1) % 5;

			if (t[yw][xw] != 0){
				yw = (y + 4 ) % 5;
				xw = x;
			}
		y = yw;
		x = xw;
		}
		for(y = 0; y < 5; y++){
		for(x = 0; x < 5; x++)

			if (t[y][x] > 9)  System.out.print(t[y][x] + "  ");
			else
				System.out.print(" " + t[y][x] + "  ");
				System.out.println("");
		}
	}

}

