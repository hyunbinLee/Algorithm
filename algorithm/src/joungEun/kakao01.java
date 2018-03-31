package joungEun;

import java.util.Scanner;

public class kakao01{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int [] arr1 = new int [N];
			int [] arr2 = new int [N];
			String [] result = new String [N];
			
			//arr1, arr2에 값 넣기
			for(int i = 0; i < N; i++){
				arr1[i] = sc.nextInt();
			}
			for(int i = 0; i < N; i++){
				arr2[i] = sc.nextInt();
			}
		
			
			//arr1, arr2 더해서 2진수로 바꾸기
			for(int j = 0; j < N; j++){
		
				int sum;
				sum = arr1[j] | arr2[j];
				
				String sum2;
				sum2 = Integer.toBinaryString(sum);
				//sum2 = sum2.substring(1,sum2.length());
				
				if(sum2.length()-1 != N){
					int empty = N - sum2.length()-1;
					for(int k = 0; k < empty; k ++){
						sum2 = "0" + sum2;
					}
				}


				sum2 = sum2.replace("1", "#");
				sum2 = sum2.replace("0", " ");
				
				result[j] = sum2;
				System.out.println(result[j]);
				
			}
			
			/*5
			9 20 28 18 11
			30 1 21 17 28		*/	
	}
}
