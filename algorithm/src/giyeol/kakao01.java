package giyeol;

import java.util.Scanner;

public class kakao01 {

	public static void main(String[] args) {
		
		int[] arr1 = {9,29,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int mok = 0; //��
		int nam = 0; //������
		String tempNum = "";
		
		while(n<1 || n>16) {
			n = scan.nextInt();
		}
		while(true) {
			mok = n/2;
			nam = n%2;
			n = mok;
			tempNum += String.valueOf(nam);
			
			if(n/2 == 0) {
				tempNum += String.valueOf(n);
				break;
			} 
		}
		
		int[] num = new int[tempNum.length()]; //������ ���� �迭
		
		for(int i=tempNum.length()-1; i>=0; i--) {
			num[(tempNum.length()-1)-i] = Integer.parseInt(String.valueOf(tempNum.charAt(i)));
		}
		//-> ������ �ʿ���� arr�迭 ���ڸ����� ä��� �ڸ����� ������, 0���� ä����
		
		for(int i=0; i<num.length; i++) { //������ �迭 Ȯ�ο�
			System.out.print(num[i]);
		}
		
		
		//1) n���� num[].length���۴ٸ�, arr[] ���ڸ��� n - num.length��ŭ 0���� ä��
		//2) arr1 , arr2 �迭������ �ึ�� 1�� ��ǥ�� ��ġ���� ��
		/*
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr1 = {9,29,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		*/
		
		
		
		

		
		
	}

}
