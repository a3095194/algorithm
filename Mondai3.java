public class Mondai3 {
	public static void main(String[] args) {
		int big = Integer.parseInt(args[0]);
		int small = Integer.parseInt(args[1]);
		int r = 0;

	        while( (r = big % small) != 0 ) {
	            big = small;
	            small = r;
	        }
	        System.out.println( "Å‘åŒö–ñ”‚Í " + small );


	}

}
