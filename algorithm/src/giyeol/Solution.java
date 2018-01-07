package giyeol;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		boolean answer = true;
		
		//  test case 1,2
		//  int[] num = {4,1,3};
		int[] num = {4,1,3,2};
		
		/*Scanner scan = new Scanner(System.in);
		
		int n = -1;
		
		while(n>100000 || n<0) {
			n = scan.nextInt();
		}
		
		int[] num = new int[n];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}*/
		
		//배열 오름차순 정렬
		int temp = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		answer = solution(num); //함수호출
		
		System.out.println(answer);
		

	}
	
	
	//1~n 체크 메소드
	public static boolean solution(int[] arr) {
        boolean answer = true;
        int count = 1;
		for(int i=0; i<arr.length; i++) {
			if(count != arr[i]) {
				answer = false;
				break;
			}
			count++;
		}
		 return answer;
    }

}
