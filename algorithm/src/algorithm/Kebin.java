package algorithm;

public class Kebin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(cal());
		
		
		
	}
	
	public static int cal(){
		
		boolean [][] f = new boolean[5][5];
		
		int [][] cnt = new int[5][5];
		
		int result=1;
		 
		for(int i=0; i<5;i++)
			for(int j=0;j<5; j++){
				f[i][j] = false;cnt[i][j]=0;
			}
		
		//1 3 
		//1 4
		//4 5
		//4 3
		//3 2
		f[0][2] = true;f[2][0] = true; f[0][3] = true;f[3][0] = true; f[3][4] = true; f[4][3] = true; f[3][2] = true; f[2][3] = true;f[2][1] = true;f[1][2] = true;
		
		
		//1단계 친구
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				
				if(f[i][j]){
					cnt[i][j]++; cnt[j][i]++;
				}
				
			}
			
						
		}
		for(int i=0;i<5;i++){
			
				for(int k=i+1;k<5;k++){
				
					if(!f[i][k]){
					
						cnt[i][k] = cnt[i][k]+cnt[i][k];
					}
				
			
				}
		}
		
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				
				if(cnt[i][j]!=0)
					if(result >= cnt[i][j])
						result = cnt[i][j];
			}
			
						
		}
		
		
		return result;
		
	}

}
