public class Mondai6 {

	public static void main(String[] args) {
		int t[] = new int[100];
		int i, j;

		for(i = 2; i < 100; i++)    t[i]= i;
		for(i = 2; i < 8; i++)
		for(j = i  + i; j < 100; j + = i)    t[j]= 0;
		for(i = 2; i < 100; ){
		for(j = 0; j < 10 && i < 100; i++)
			if (t[i]! = 0){
			if (i<10)System.out.print("   " + i);
			else System.out.print("  " + i);
			j++;
			}
		System.out.println("");
		}
	}

}