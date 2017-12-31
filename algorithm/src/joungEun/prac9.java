import java.util.Scanner;
//codeground 9.화학자의 문장

public class prac9{
	static int Answer;

	public static void main(String args[]) throws Exception	{
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		String n = sc.nextLine();
		String array[] = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al",
				   "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe",
				   "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr",
				   "Y","Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb",
				   "Te", "I", "Xe", "Cs", "Ba", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au",
				   "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Rf", "Db", "Sg",
				   "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv", "La", "Ce", "Pr", "Nd",
				   "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac",
				   "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md",
				   "No", "Lr"};
		
		
		
		
		for(int test_case = 0; test_case < T; test_case++) {
			boolean contains = false;
			

			for(int i = 0; i < array.length; i++){
				
				//배열 - 문자 비교 후 문자열에서 지우기
				if(n.toLowerCase().contains(array[i].toLowerCase())){
					n = n.replace(array[i], "");
					contains = true;
				}
				
			}
			
			
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			System.out.println(contains);
			System.out.println(n);
			
		}
	}
}