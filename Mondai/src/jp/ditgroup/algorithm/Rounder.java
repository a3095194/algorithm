package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * �l�̌ܓ�������N���X</h3> �R�}���h���C���œ��͂��ꂽ��������͂��ꂽ�����Ɏl�̌ܓ����܂��B
 *
 */
public class Rounding {
	/**
	 * �����ȊO�����͂���Ă��Ȃ����̓��̓`�F�b�N
	 */
	public static void main(String[] args) {
		if (!NumberUtil.isDouble(args[0])) {
			System.out.println("�������ɐ����ȊO�̕����񂪓��͂���܂���");
		}
		if (!NumberUtil.isInt(args[1])) {
			System.out.println("�������ɐ����ȊO�̕����񂪓��͂���܂���");
		}
		System.out.println(getRound(args));
	}

	/**
	 * �l�̌ܓ��̏���
	 * 
	 * @param �R�}���h���C������1
	 * @return �l�̌ܓ����ꂽ���l
	 */
	public static double getRound(String[] args) {
		// �R�}���h���C�����炭��String�^�̒l��double�^�ɕϊ�
		double jissu = CastUtil.strToDouble(args[0]);
		double result = jissu * getPow("10", args[1]) + 0.5;
		// �����𐮐��ɕϊ�
		int seisu = (int) result;
		double answer = (double) seisu / getPow("10", args[1]);
		return answer;
	}

	/**
	 * �ׂ���̌v�Z
	 * 
	 * @param origin
	 *            ���̐���
	 * @param number
	 *            �搔
	 * @return �v�Z����
	 */
	public static int getPow(String value, String multiPlier) {
		// �ׂ�����v�Z
		int power = 1;
		int origin = Integer.parseInt(value);
		int number = Integer.parseInt(multiPlier);
		for (int i = 1; i <= number; i++) {
			power = power * origin;
		}
		return power;
	}
}
