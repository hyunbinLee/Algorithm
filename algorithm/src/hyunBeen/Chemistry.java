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
public class Chemistry {
	static String Answer;

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

		String[] chemist = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S",
				"Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As",
				"Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn",
				"Sb", "Te", "I", "Xe", "Cs", "Ba", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb",
				"Bi", "Po", "At", "Rn", "Fr", "Ra", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv",
				"La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac", "Th",
				"Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr" };

		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		String statement = "";

		String tmp = "";

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * Implement your algorithm here. The answer to the case will be
			 * stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			statement = sc.nextLine();

			for (int i = 0; i < chemist.length; i++) {

				if (chemist[i].length() == 2)
					statement = statement.replaceAll("(?i)" + chemist[i], "");
				if (statement.equals(" ")) {
					Answer = "YES";
					break;
				} else
					Answer = "NO";

			}

			if (Answer.equals("NO"))
				for (int i = 0; i < chemist.length; i++) {

					if (chemist[i].length() == 1){
						statement = statement.replaceAll("(?i)" + chemist[i], "");

					}

					if (statement.equals(" ")) {
						Answer = "YES";
						break;
					} else
						Answer = "NO";
				}
			
			// Print the answer to standard output(screen).
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}