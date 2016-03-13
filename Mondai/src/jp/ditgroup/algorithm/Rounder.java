package jp.ditgroup.algorithm;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

/**
 * �l�̌ܓ�������N���X</h3> �R�}���h���C���œ��͂��ꂽ��������͂��ꂽ�����Ɏl�̌ܓ����܂��B
 */
public class Rounder {
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
		System.out.println(calculation(args[0], args[1]));
	}

	/**
	 * �l�̌ܓ��̏���
	 *
	 * @param value
	 *            �l�̌ܓ����鐔�l
	 * @param multiPlier
	 *            �l�̌ܓ�����������
	 * @return result �l�̌ܓ����ꂽ���l
	 */
	public static double calculation(String value, String multiPlier) {
		// �R�}���h���C�����炭��String�^�̒l��double�^�ɕϊ�
		double jissu = CastUtil.strToDouble(value);
		// �R�}���h���C�����炭��String�^�̒l��int�^�ɕϊ�
		int multiplier = CastUtil.strToInt(multiPlier);
		double powResult = pow(10, multiplier);
		double trimJissu = jissu * powResult + 0.5;
		// �����𐮐��ɕϊ�
		int seisu = (int) trimJissu;
		double result = (double) seisu / powResult;
		return result;
	}

	/**
	 * �ׂ���̌v�Z
	 *
	 * @param jissu
	 *            ����
	 * @param multiplier
	 *            �l�̌ܓ�����������
	 * @return power �ׂ���v�Z����
	 */
	public static double pow(double jissu, int multiPlier) {
		// �ׂ�����v�Z
		double power = 1;
		for (int i = 1; i <= multiPlier; i++) {
			power = power * jissu;
		}
		return power;
	}
}