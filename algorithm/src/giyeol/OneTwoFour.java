package giyeol;

public class OneTwoFour {
	public String change124(int n) {
		String answer = "0";
		String[] check = {"1","2","4"};
		int count = 1;
		
		for(int i=1; i<100; i++) {
			boolean k = false;
			String temp = String.valueOf(i);
			
			for(int j=0; j<temp.length(); j++) {
					if(check[0].equals(String.valueOf(temp.charAt(j))) || check[1].equals(String.valueOf(temp.charAt(j))) || check[2].equals(String.valueOf(temp.charAt(j))) ) {
						k = true;
					} else {
						k = false;
						break;
					}
			}
			
			if(k==true) {
				if(n==count) {
					//System.out.println(i);
					answer = String.valueOf(i);
				}
				count ++;
			}
			
		}
		

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(10));
	}
}
