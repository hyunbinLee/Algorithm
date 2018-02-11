package hyunBeen;

public class KakaoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void Cal(String score) {

		char tmp;
		int number = 0;
		int[] prenumber = new int[10];
		int result = 0;
		int count = 0;
		for (int i = 0; i < score.length(); i++) {
			
			
			if (score.contains("#") || score.contains("*")) {

				tmp  = score.charAt(i);
				
				if(47 < tmp || tmp <58 ){
					number = tmp;
				}
				else if(tmp == 'S')
				{
					number = number;
					prenumber[count] = number;
					count++;
				}
				else if(tmp == 'D')
				{
					number = number * number;
					prenumber[count] = number;
					count++;
				}
				else if(tmp == 'T')
				{
					number = number * number * number;
					prenumber[count] = number;
					count++;
				}
				else if(tmp == '*')
				{
					number *= 2;
					prenumber[count-1] *= 2;
				}
				else if(tmp == '#')
				{
					number *= -1;
					
				}
				
			} else {

				tmp = score.charAt(i);

				if (i % 2 == 0) {
					number = tmp;
				}

				else {

					if (tmp == 'S') {
						number = number;
						result += number;
					} 
					else if (tmp == 'D') {
						number = number*number;
						result += number;

					} 
					else {
						number = number*number*number;
						result += number;

					}

				}
			}

		}

	}

}
