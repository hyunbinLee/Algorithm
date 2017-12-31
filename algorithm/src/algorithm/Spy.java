package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cal("011"));
	}

	public static int cal(String a) {

		int num = 0, tmp = 0, check = 0;

		char list[] = new char[a.length()];
		List<String> caselist = new ArrayList<String>();

		for (int i = 0; i < a.length(); i++) {
			list[i] = a.charAt(i);

		}

			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < a.length(); j++) {
					for(int k=0; k < i + 1; k++){
						String tmp1="";
						tmp1 = tmp1 + list[k];
						caselist.add(tmp1);

					}
					
				}
			}
		

		// for (int i = 0; i < a.length(); i++) {
		//
		// for (int j = i + 1; j < a.length(); j++) {
		//
		// tmp = Integer.parseInt(a.substring(i, j+1));
		//
		// for (int k = 2; k < tmp; k++) {
		// if (tmp % k == 0)
		// check++;
		// }
		//
		// if (check == 0)
		// num++;
		//
		// }
		//
		// check=0;
		// }
		//
		// for (int i = 0; i < a.length(); i++) {
		//
		// for (int j = i + 1; j < a.length(); j++) {
		//
		// tmp = Integer.parseInt(new
		// StringBuffer(a).reverse().toString().substring(i, j+1));
		// for (int k = 2; k < tmp; k++) {
		// if (tmp % k == 0)
		// check++;
		// }
		//
		// if (check == 0)
		// num++;
		//
		// }
		//
		// check=0;
		// }
		return num;

	}

}
