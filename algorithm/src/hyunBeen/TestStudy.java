package hyunBeen;

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
public class TestStudy {
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
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			int numsubject = sc.nextInt();
			int numstudysubject = sc.nextInt();
			int score[] = new int[numsubject];
			int tmp = 0;

			for (int i = 0; i < numsubject; i++) {

				score[i] = sc.nextInt();
			}

			for (int i = 0; i < numsubject; i++) {

				for (int j = i + 1; j < numsubject; j++) {

					if (score[i] > score[j]) {
						tmp = score[j];
						score[j] = score[i];
						score[i] = tmp;
					}

				}

			}

			tmp = numsubject - 1;

			for (int i = 0; i < numstudysubject; i++) {

				Answer += score[tmp--];
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