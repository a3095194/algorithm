package mondai;
import common.CastUtil;
public class Mondai1 {

	public static void main(String[] args) {
		double jissu = CastUtil.castdouble(args[0]);
		int keta = CastUtil.castint(args[1]);	//四捨五入後の数が四捨五入されてるが、意図したところで切れていない

		System.out.println(jissu * (Math.pow(10, keta) + 0.5)/Math.pow

(10, keta));

	}
}