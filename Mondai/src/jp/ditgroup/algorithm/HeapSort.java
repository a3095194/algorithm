package jp.ditgroup.algorithm;

import java.util.ArrayList;

import jp.ditgroup.common.CastUtil;
import jp.ditgroup.common.NumberUtil;

public class HeapSort {

	/**
	 * ���̓`�F�b�N��AArrayList�z��Ƃ��đg�ݗ��Ă� �܂����ʂ̏o�͂��s��
	 */
	public static void main(String[] args) {
		// ���בւ��O�̔z����o��
		System.out.print("���בւ��O�F");
		for (String a : args) {
			System.out.print(a + " ");
		}
		System.out.println();
		ArrayList<Integer> orgArray = new ArrayList<Integer>();
		// root�̃C���f�b�N�X��[1]�Ƃ���ׁA���Ƀ_�~�[�f�[�^������
		orgArray.add(999);
		for (int i = 0, length = args.length; i < length; i++) {
			// �����݂̂ł��邩�̓��̓`�F�b�N
			if (!NumberUtil.isInt(args[i])) {
				System.out.println("�����ȊO�����͂���܂���");
			}
			// ���͂��ꂽ������String����int�֌^�ϊ���AArrayList�ɋl�߂�
			orgArray.add(CastUtil.strToInt(args[i]));
		}
		// �󂯎�����\�[�g�ς݂̔z����o��
		System.out.print("���בւ���F");
		ArrayList<Integer> newArray = calculateHeap(orgArray);
		for (int i = 1, size = newArray.size(); i < size; i++) {
			System.out.print(newArray.get(i) + " ");
		}
	}

	public static ArrayList<Integer> calculateHeap(ArrayList<Integer> orgArray) {
		for (int i = orgArray.size() - 1; i >= 1; i--) {
			int parent = 1; // ������1�ɂ���ƒ��_�����܂Ōo���Ă��ς����Ȃ����A0�ɂ���Ǝq�̏ꏊ�����m�ɂƂ�Ȃ�
			while (parent <= i / 2) {
				int childLeft = parent * 2;
				int rightNode = parent * 2 + 1;
				if (rightNode > i) {
					rightNode = childLeft;
				}
				if (orgArray.get(childLeft) < orgArray.get(rightNode)) {
					int temp = orgArray.get(childLeft);
					orgArray.set(childLeft, orgArray.get(rightNode));
					orgArray.set(rightNode, temp);
				}
				if (orgArray.get(parent) < orgArray.get(childLeft)) {
					int temp = orgArray.get(parent);
					orgArray.set(parent, orgArray.get(childLeft));
					orgArray.set(childLeft, temp);
					parent = parent / 2;
					if (parent < 1) {
						parent = 1;
					}
				} else {
					parent++;
				}
			}
			int temp = orgArray.get(1);
			orgArray.set(1, orgArray.get(i));
			orgArray.set(i, temp);
		}
		return orgArray;
	}
}
