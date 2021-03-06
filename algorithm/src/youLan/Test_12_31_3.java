package youLan;

import java.util.Arrays;
import java.util.Scanner;


class Test_12_31_3 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

			int num = sc.nextInt();
			
			 int[][] scorelist = new int[num][2];
			 
			 for(int i=0;i<num;i++){
					 scorelist[i][0]=sc.nextInt();
			 }
			
			 Arrays.sort(scorelist);
			 
			 for(int k=1;k<num+1;k++){
					 scorelist[k][1]=scorelist[k][0]+k;
			 }
			 
			 

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
