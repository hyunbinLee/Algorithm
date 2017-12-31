package javalec.test1;

import java.util.Arrays;
import java.util.Scanner;

class Test_12_31_1 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */

			 int num = sc.nextInt();

			 int choice = sc.nextInt();
			 
			 int[] scorelist = new int[num];
			 
			 for(int i=0;i<num;i++){
				scorelist[i]=sc.nextInt();
			 }
			 
			 Arrays.sort(scorelist);
			 
			 for(int j=num;j>choice-1;j--){
				 System.out.println(scorelist[j]);
			 }
			 
			 
			 
			/////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}