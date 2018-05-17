package hyunBeen;

import java.util.Scanner;

class SWexpert_4261
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		String num;
		int numofstring = 0;
		String [] content;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int count = 0;
			num = sc.nextLine();
			numofstring = sc.nextInt();
			content = new String[numofstring];
			
			for(int i=0;i<numofstring; i++){
				
				content[i] = sc.nextLine();
			}
			String matching="";
			
			for(int i=0;i<numofstring; i++){
				for(int j=0;j<content[i].length();j++){
					
					matching += changek(content[i].charAt(j));
					
				}
				if(matching.equals(num))
					count++;
				
			}
			
			System.out.println("#" + (test_case) + " " + count);

		}
	}
	
	private static int changek(char tab){
	    if(tab == 'a' || tab== 'b' || tab == 'c'){return 2;}
	   else if(tab == 'd' || tab== 'd' || tab == 'f'){return 3;}
	   else if(tab == 'g' || tab== 'h' || tab == 'i'){return 4;}
	    else if(tab == 'j' || tab== 'k' || tab == 'l'){return 5;}
	    else if(tab == 'm' || tab== 'n' || tab == 'o'){return 6;}
	     else if(tab == 'p' || tab== 'q' || tab == 'r' || tab == 's'){return 7;}
	    else if(tab == 't' || tab== 'u' || tab == 'v'){return 8;}
	     else if(tab == 'w' || tab== 'x' || tab == 'y' || tab == 'z'){return 9;}
	    else {return -1;}
	}
}