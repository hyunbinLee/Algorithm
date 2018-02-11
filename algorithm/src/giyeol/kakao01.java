package giyeol;

import java.util.Scanner;

public class kakao01 {

	public static void main(String[] args) {
		
		int[] arr1 = {9,29,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int mok = 0; //몫
		int nam = 0; //나머지
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
		
		int[] num = new int[tempNum.length()]; //이진수 담은 배열
		
		for(int i=tempNum.length()-1; i>=0; i--) {
			num[(tempNum.length()-1)-i] = Integer.parseInt(String.valueOf(tempNum.charAt(i)));
		}
		//-> 뒤집을 필요없이 arr배열 뒷자리부터 채우고 자리수가 남으면, 0으로 채우기★
		
		for(int i=0; i<num.length; i++) { //이진수 배열 확인용
			System.out.print(num[i]);
		}
		
		
		//1) n보다 num[].length가작다면, arr[] 앞자리에 n - num.length만큼 0으로 채움
		//2) arr1 , arr2 배열만든후 행마다 1의 좌표가 겹치는지 비교
		/*
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr1 = {9,29,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		*/
		
		
		
		

		
		
	}

}
