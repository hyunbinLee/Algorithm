import java.util.Scanner;
//codeground 2.프로그래밍 경진대회

public class prac2{
	static int Answer;

	public static void main(String args[]) throws Exception	{
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();		
		for(int test_case = 0; test_case < T; test_case++) {

			int N = sc.nextInt();
			int array[] = new int[N];
			int max;
			
			
			//응시자 점수 배열에 입력
				for(int i = 0; i < array.length; i++){
					array[i] = sc.nextInt();
				}
			
				for(int m = N; m > 0 ; m--){
					for(int i = 0; i < array.length; i++){
						array[i] += array[i] + m;						
					}
					
					
				}
				
			
			
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			
		}
	}
}