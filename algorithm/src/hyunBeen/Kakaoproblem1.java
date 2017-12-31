package hyunBeen;

import java.util.Scanner;

public class Kakaoproblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aa = new Scanner(System.in);
		System.out.println(cal(aa.nextLine()));
		
	}
	
	
	public static int cal(String N){
		
		int result=0;
		
		for(int i=0;i<N.length();i++)
		{
			result+=Integer.parseInt(String.valueOf(N.charAt(i)));
		}
		
		
		return result;
		
	}
	
	
}
