package joungEun;

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