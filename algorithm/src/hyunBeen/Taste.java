package hyunBeen;

import java.util.Scanner;

public class Taste {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aa = new Scanner(System.in);
		int taste[][];
		int testCase=aa.nextInt();
		int result = 0;
		for(int i=0; i<testCase; i++){
			int numOffood = aa.nextInt();
			taste = new int[numOffood][numOffood];
			for(int j =0; j < numOffood; j++){
				for(int k =0; k < numOffood; k++){
					
					taste[j][k] = aa.nextInt();
					
				}	
			}
			
			for(int j =0; j < numOffood; j++){
				
//				result = taste[j][k]
			}
			
			
		}
		
		
	}
}
