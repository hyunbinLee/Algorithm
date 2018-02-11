package hyunBeen;

public class KakaoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };

		Cal(arr1, arr2);

	}

	public static int[] Cal(int[] aa, int[] bb) {

		int tmp[] = new int[aa.length];
		int result[][] = new int[tmp.length][20];

		for (int i = 0; i < aa.length; i++) {

			tmp[i] = aa[i] | bb[i];

		}

		for (int i = 0; i < tmp.length; i++) {

			for (int j = 0; tmp[i] > 0; j++) {

				result[i][j] = tmp[i] % 2;
				tmp[i] = tmp[i] / 2;

			}
		}

		for (int j = 0; j < tmp.length; j++) {
			for (int i = tmp.length - 1; i >= 0; i--) {

				if (result[j][i] == 1)
					System.out.print("#");
				else
					System.out.print(" ");

			}
			System.out.println("");
		}

		// 이진법 or 연산

		return aa;

	}

}
