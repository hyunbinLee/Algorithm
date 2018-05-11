package hyunBeen;

import java.util.Scanner;

public class SWexpert_3809 {// 화섭이의 정수나열

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aa = new Scanner(System.in);

		int testCase = 0;
		int N = 0;
		int num[] = null ;
		int comp[] = new int[1000];
		boolean check[] = new boolean[comp.length];
		
		
		testCase = aa.nextInt();
		int lowestNum = 0;
		int lowestIndex =0;
		int lastest =0;
		int result[] = new int[testCase];

		for (int i = 0; i < testCase; i++) {
			N = aa.nextInt();
			for (int j = 0; j < N; j++) {

				num = new int[N];

				num[j] = aa.nextInt();

			} // 값 받기.

			
//			for(int j = 0; j < N; j++){
//				
//				if(num[j]<=lowestNum){
//					lowestNum = num[j];//가장 작은 값 찾기.
//					lowestIndex = j;
//				}
//				
//			}
			
			for(int j = 0; j < comp.length; j++){
				
				comp[j] = j;
			
			}
			
			int k = 0;
			for(int m = 1; m <= 3 ; m++)
				for(int j = 0; j < N -m +1; j++){
						int sum = 0;
						
						sum = 
						
				}
			}
			
			

		for (int i = 0; i < testCase; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}

	}
	// 정렬 -> 작은거 +1 하면서 찾아보기

}
