package algorithm;

import java.util.Scanner;

public class SangSu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aa = new Scanner(System.in);
		
		System.out.println(Cal(aa.nextLine(),aa.nextLine()));
		
	}
	
	
	public static int Cal(String a,String b){
		int result=0;
		char tmp;
		String result_a="";
		String result_b="";
		
		result_a += a.charAt(2)+a.charAt(1)+a.charAt(0);
		result_b += b.charAt(2)+a.charAt(1)+a.charAt(0);
		
		if(Integer.parseInt(result_a)>Integer.parseInt(result_b))
			result=Integer.parseInt(result_a);
		else
			result=Integer.parseInt(result_b);

				
		
		
		return result;
	}
	
}
