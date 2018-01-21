import java.util.Scanner;
//programmers lvl.6 과자 많이 먹기

public class Expressions{
	

	public static void main(String args[]) throws Exception	{
	
		int N = 1085;
		int array[] = new int[N];
		int count = 0;
		
		
		//배열에 숫자 차례대로 넣기
		for(int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		
		
		for(int j = 0; j < array.length; j++){
			int sum = 0;
			
			for(int i = j; i <= array.length; i++){
				if(sum < N){
					sum += array[i];
				}
				
				else if(sum == N){
					System.out.println(sum);
					count++;
					break;
				}
				
				else if(sum > N){
					break;
				}
				
			
			}
		}
		
		System.out.println(count);
				
	}
}