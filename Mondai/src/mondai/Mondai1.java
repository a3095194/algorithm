package mondai;
import common.CastUtil;

public class Mondai1 {

	public static void main(String[] args) {
		double jissu = CastUtil.string_to_double(args[0]);
		int keta = CastUtil.string_to_int(args[1]);	//�l�̌ܓ���̐����l�̌ܓ�����Ă邪�A�Ӑ}�����Ƃ���Ő؂�Ă��Ȃ�

		System.out.println(jissu * (Math.pow(10, keta) + 0.5)/Math.pow

(10, keta));

	}
}