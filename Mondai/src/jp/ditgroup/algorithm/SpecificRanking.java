package jp.ditgroup.algorithm;

import java.util.ArrayList;
import java.util.List;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;
import jp.ditgroup.common.ReplaceValue;

public class SpecificRanking {

	/**
	 * ���̓`�F�b�N�Ə��ʂ̊i�[
	 *
	 * @param �R�}���h���C������(�C�ӂ̏���)
	 */
	public static void main(String[] args) {
		int data[] = { 49, 32, 11, 90, 31, 75, 58, 46, 12 };
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0, length = data.length; i < length; i++) {
			array.add(data[i]);
		}
		// �����ł��邩�̓��̓`�F�b�N
		if (!NumberUtil.isInt(args[0])) {
			System.out.println("�u" + args[0] + "�v" + "�Ƃ���" + "�����ȊO�����͂���܂���");
			// 0(�[��)�łȂ����̓��̓`�F�b�N
		} else if (!NumberUtil.isNotZero(args[0])) {
			System.out.println("0(�[��)�����͂���܂���");
			// ���̒l�łȂ����̓��̓`�F�b�N
		} else if (!NumberUtil.isPositiveNumber(args[0])) {
			System.out.println("�u" + args[0] + "�v" + "�Ƃ���" + "�}�C�i�X�̒l�����͂���܂���");
		} else {
			// ���͂��ꂽ������String����int�֌^�ϊ�
			int rank = CastUtil.strToInt(args[0]);
			// ���ƂȂ�f�[�^�̔z����o��
			arrayPrintln(array);
			// ���͂��ꂽ�������f�[�^���ȏ�̒l��������
			if (rank > array.size()) {
				System.out.println("��L�̃f�[�^���������݂��Ȃ�����" + rank + "�ʂ͑��݂����܂���");

			} else {
				// ���͂������ʂɂ���f�[�^���擾
				int matchRankData = serchMatchData(array, rank - 1);
				// ���ʂ̏o��
				System.out.println("��L�̃f�[�^�̂����u" + rank + "�ʁv�́u" + matchRankData + "�v�ł�");
			}
		}
	}

	private static int serchMatchData(List<Integer> array, int rank) {
		boolean ctl = false;
		int data = 0;
		do {
			ctl = false;
			for (int i = 0, size = array.size(); i < size; i++) {
				if (i < rank) {
					if (array.get(i) > array.get(rank)) {
						ReplaceValue.doReplace(array, rank, i);
						data = array.get(rank);
						ctl = true;
					}
				} else {
					if (array.get(i) < array.get(rank)) {
						ReplaceValue.doReplace(array, rank, i);
						data = array.get(rank);
						ctl = true;
					}
				}
			}
		} while (ctl == true);
		return data;
	}

	/**
	 * �z��̒l���o�͂���
	 *
	 * @param �z��
	 */
	private static void arrayPrintln(List<Integer> array) {
		for (int i = 0, size = array.size(); i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println("");
	}
}
