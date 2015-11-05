public class Mondai4 {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int r = 0;

		while( (r = m % n) ! = 0 ) {
			m = n;
			n = r;	//Å‰‚Ìm‚Æn‚Ì’l‚ğg‚¢‚½‚¢
		}
	System.out.println(m + " " + n);
	System.out.println( (m * n) / n);
	}

}
