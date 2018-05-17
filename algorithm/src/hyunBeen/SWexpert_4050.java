package hyunBeen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class SWexpert_4050
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T,N;
		Integer price[];
		int answer[];
		T=sc.nextInt();
		answer = new int[T];
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			N=sc.nextInt();
			price = new Integer[N];
			
			int sum = 0;

			
			for(int i=0; i<N; i++){
				
				price[i] = sc.nextInt();
				sum += price[i];
			}
			
			int tmp= 0; 
			
//			for(int i=0; i< N-1 ; i++){
//				
//				for(int j=0;j< N-i-1; j++){
//					
//					if(price[j]<price[j+1])
//					{
//						tmp = price[j];
//						price[j] = price[j+1];
//						price[j+1] = tmp;
//					}
//					
//				}
//			}
			
			Arrays.sort(price,Collections.reverseOrder());
			
			for(int i=1; i < N+1; i++){
				if(i % 3 == 0)
					sum-=price[i-1];
				
				
			}
			
			answer[test_case-1] = sum;
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println("#" + (i + 1) + " " + answer[i]);
		}
		
		
	}
}