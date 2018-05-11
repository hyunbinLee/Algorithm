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
		int result[] = new int[testCase];

		for (int i = 0; i < testCase; i++) {
			N = aa.nextInt();
			for (int j = 0; j < N; j++) {

				num = new int[N];

				num[j] = aa.nextInt();

			} // 값 받기.
			for(int j = 0; j < comp.length; j++){
				
				comp[j] = j;
			
			}
			
			for(int m = 1; m <= 3 ; m++){
				for(int j = 0; j < N -m +1; j++){
						int sum = 0;
					for(int k=0; k < m ; m++){
						sum += num[j+k]*Math.pow(10.0, m-k+1);
					}
					check[sum] = true;
				}
				
			}
			
			int j=0;
			
			for(int k = 0; k < 1000; k++){
				if(check[k] == false){
					result[i] = j;
					break;
				}
				
			}
		}
			
			
			

		for (int i = 0; i < testCase; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}

	}
	// 정렬 -> 작은거 +1 하면서 찾아보기

}
