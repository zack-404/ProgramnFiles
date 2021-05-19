package a__;

import java.util.Scanner;

public class a013_1 {
	private final static String rnums[] = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "Mx", "v", "Mv", "M", "CM",
			"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // �x�s�Ҧ�ù���Ʀr

	private final static int anums[] = { 1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000,
			5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // �x�sù���Ʀr��ܪ���

	public static void main(String[] args) { // �{���i�J�I
		Scanner sc = new Scanner(System.in); // �إ�Scanner����

		String input; // �ŧiinput�r��A�Ψ��x�s�ϥΪ̿�J����

		while (sc.hasNext()) { // �Y�٦���Ʃ|��Ū���A�h����
			do {
				input = sc.nextLine(); // Ū���@��r��
			} while (input.trim().length() < 1); // �p�G�S����J����r��A�N���sŪ��

			if (input.charAt(0) == '#') { // ��J���r�����}
				break;
			}

			if (isDigit(input)) { // �p�G�O���
				int n = Integer.parseInt(input); // �N�r���ର���
				if (n > 0 && n < 4000000) { // �p�Gn�j��0�B�p��4000000
					System.out.println(input + " = " + toRnums(n));
				} else { // �p�G�W�L�d��
					System.out.println("��J�����ԧB�Ʀr���~�I�����j��s�B�p��|�ʸU�I");
				}
			} else { // �p�G���O���
				int n = toAnums(input); // �Nù���r���ର���ԧB�Ʀr(�ƭ�)

				if (toRnums(n).equals(input)) { // �P�_��J��ù���r��榡�O�_���T(�ন���ԧB�Ʀr(�ƭ�)��A��^ù���r��A�ûP�쥻���r�갵���)
					System.out.println(input + " = " + n);
				} else {
					System.out.println("��J��ù���Ʀr���~�I");
				}
			}
		}
	}

	public static boolean isDigit(String s) { // �P�_�O�_�����
		try {
			int i = Integer.parseInt(s); // �N�r���ର���
		} catch (Exception e) { // �p�G�ഫ���ѡA�|��X�ҥ~
			return false; // ���O���
		}
		return true; // �O���
	}

	public static String toRnums(int num) { // �N����ন�H�r���ܪ�ù���Ʀr

		if (num == 0) { // �]��ù���Ʀr�̨èS���s�A�ҥH��XZERO�I
			return "ZERO";
		} else if (num < 0 || num > 3999999) { // ����P�_
			return "OVERFLOW";
		}

		StringBuilder output = new StringBuilder(); // �x�sù���Ʀr�r��

		for (int i = 0; num > 0 && i < anums.length; i++) // �M�������ù���Ʀr
		{
			while (num >= anums[i]) { // �Nù���Ʀr�[��output����
				num -= anums[i];
				output.append(rnums[i]);
			}
		}

		return output.toString(); // �Ǧ^ù���Ʀr�r��
	}

	public static int toAnums(String s) { // �Nù���Ʀr�ন���ԧB�Ʀr(�ƭ�)

		int num = 0;

		StringBuilder Buffer = new StringBuilder(s); // �N�r��s�s�J�r��w�İϤ�

		for (int i = 0; Buffer.length() > 0 && i < anums.length; i++) // �M�������ù���Ʀr
		{
			while (Buffer.indexOf(rnums[i]) == 0) { // �p�G�����ۦP��ù���Ʀr�r��A�B��m�b�r��̥���
				num += anums[i]; // �Nù���Ʀr�ର���ԧB�Ʀr(�ƭ�)�æs��num�ܼƤ�
				Buffer.delete(0, rnums[i].length()); // �R���wŪ���쪺�r��
			}
		}

		return num; // �Ǧ^�ഫ�᪺���ԧB�Ʀr(�ƭ�)
	}
}
