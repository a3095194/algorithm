package jp.ditgroup.algorithm;

/**
 * ���̉�����������ɕ��בւ�������N���X ��̒��ŏ������������Ɍ����č��[���珇�ɋl�߂Ă����A���בւ����Ƃ��J��Ԃ��܂��B
 */
public class ShellSort {
	/**
	 * ���ʂ̔z����o��
	 */
	public static void main(String[] args) {
		int type[] = calculateShell();
		for (int i = 0, num = type.length; i < num; i++) {
			System.out.print(type[i] + " ");
		}
	}

	/**
	 * �z������������ɕ��בւ�
	 *
	 * @return array ���בւ���̔z��
	 */
	public static int[] calculateShell() {
		int array[] = { 35, 26, 48, 34, 42 };
		for (int i = 0, length = array.length; i < length; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			if (min != i) {
				int tmp = array[min];
				array[min] = array[i];
				array[i] = tmp;
			}
		}
		return array;
	}
}
