package hyunBeen;

import java.util.Scanner;

/**
 * @author hbLee
 *
 */
public class SamsungTest_1 {
	public static void main(String[] args) {

		Scanner aa = new Scanner(System.in);
		int testCase = aa.nextInt();
		int[] bb = new int[2];
		String result[] = new String[testCase];
		
		for(int i=0;i<testCase;i++){
			
			for(int j=0;j<2;j++){
				
				bb[j]=aa.nextInt();
				
			}
			if(bb[0]>bb[1])
				result[i] = ">";
			else if(bb[0]==bb[1])
				result[i] = "=";
			else
				result[i] = "<";
			
		}
		
		for(int i=0;i<testCase;i++)
			System.out.println("#"+(i+1)+" "+result[i]);
	}

}
