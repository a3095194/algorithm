public class Mondai5 {
	public static void main(String[] args) {
            int x = Integer.parseInt(args[0]);
            int fact = 1;
            for(int i=1; i<=x; i++) fact *= i;
            System.out.println(x + "! = " + fact);
	}

}
