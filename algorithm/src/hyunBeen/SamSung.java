package hyunBeen;

/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class SamSung {
	static int Answer;

	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt,
		 * instead of standard(keyboard) input. To test your program, you may
		 * save input data in input.txt file, and call below method to read from
		 * the file when using nextInt() method. You may remove the comment
		 * symbols(//) in the below statement and use it. But before submission,
		 * you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			int numHuman = sc.nextInt();
			int lastScore[] = new int[numHuman];
			int tmp = 0;
			Answer = numHuman;
			
			for (int i = 0; i < numHuman; i++) {

				lastScore[i] = sc.nextInt();

			}

			for (int i = 0; i < numHuman; i++) {

				for (int j = i + 1; j < numHuman; j++) {

					if (lastScore[i] > lastScore[j]) {
						tmp = lastScore[j];
						lastScore[j] = lastScore[i];
						lastScore[i] = tmp;
					}
				}
			}

			for (int i = 0; i < numHuman; i++) {
				tmp = lastScore[i] + numHuman;
				if((lastScore[numHuman-1]+1) > tmp )
					Answer--;
				
			}
			
			

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The answer to the case will be
			 * stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

			// Print the answer to standard output(screen).
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}