import java.util.Arrays;
import java.util.Scanner;
//programmers lvl.5 124나라의 숫자

public class OneTwoFour{
	public String change124(int n) {
		String answer = "0";

		int x = n/3;
		int y = n%3;
		
		switch(y){
		case 1:
			if(x%3 > 1){
				
				
			}
			answer += x;
			answer += 1;
			break;
		case 2:
			answer += x;
			answer += 2;
			break;
		case 0:
			answer += x-1;
			answer += 4;
			break;
		}
		
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(9));
	}
}