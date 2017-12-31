import java.util.Scanner;
//codeground 3.시험공부

public class study{
	static int Answer;

	public static void main(String args[]) throws Exception	{
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {


			//시험점수 배열에 입력
			int[] array = new int[N];
			int[] study = new int[K];
			for(int i = 0; i < array.length; i++){
				array[i] = sc.nextInt();
			}
			
			
			int sum = 0;
			int a = array[0];
			int b = 0;
			
			//시험점수 최대값 구하기
			for(int j = 1; j < array.length; j++){
				if(array[j] > a){
					a = array[j];
				}				
			}
			
			
			//정렬
			
			//시험점수 합해서 최대값 구하기
			for(int j = 0; j + 1< array.length; j++){
				b = a + array[j];
				
				if(a + array[j+1] > b){
					b = a + array[j+1];
					
				}
				
			}
			
			System.out.println(a);
			System.out.println(b);
			
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}