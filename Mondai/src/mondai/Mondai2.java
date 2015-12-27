package mondai;

public class Mondai2 {

	public static void main(String[] args) {
		double height = Double.parseDouble(args[0]);
		double weight = Double.parseDouble(args[1]);
		double laurel = weight / Math.pow(height, 3) * Math.pow(10, 7);

		if(laurel < 100){
			System.out.println("��������");
			}else if(laurel < 115){
				System.out.println("��⑉������");
			}else if(laurel < 150){
				System.out.println("����");
			}else if(laurel < 160){
				System.out.println("��⑾�肬��");
			}else{
				System.out.println("���肷��");
		}
	}

}
