import java.util.Scanner;
//programmers lvl.6 과자 많이 먹기

public class Expressions{
	

	public static void main(String args[]) throws Exception	{
	
		int N = 15;
		int count = 0;
		
		for(int j = 1; j <= N; j++){
			int sum = 0;
			
			for(int i = j; i <= N; i++){
				sum += i;
				
				if(sum == N){
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