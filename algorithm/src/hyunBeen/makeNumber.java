package hyunBeen;

import java.util.Scanner;

public class makeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aa = new Scanner(System.in);
		
		int Tcase = aa.nextInt();
		int calOfnum [] = null;
		int whatnum [] = null;
		int result[];
		for(int i=0; i<Tcase; i++){//테스트 케이스 전체
			int nOn = aa.nextInt();
			//각각의 테스트 케이스 nOn은 숫자의 개수

			for(int k = 0; k < 4;k++)
				calOfnum[k] = aa.nextInt();//연산자 개수 받기. + - * /
			
			for(int k = 0; k<nOn; k++)
				whatnum[k] = aa.nextInt(); //숫자 개수 받기.
			
				
//				result = new int[x];//x는 조합의 개수..
//				
//				for(int m = 0; m < x ; m++){
//					
//					result = whatnum[k]
				
				
				}
			
//			for(int j=0; j<nOn; j++){
//				calOfnum = new int[nOn-1];
//				whatnum = new int[nOn];
//				
//				for(int k = 0; k<nOn-1;k++)
//					calOfnum[k] = aa.nextInt();//연산자 개수 받기. + - * /
//				
//				for(int k = 0; k<nOn; k++)
//					whatnum[k] = aa.nextInt(); //숫자 개수 받기.
//				
//				calOfnum[]
//				
//				}
				
				
			}
			
		

}


