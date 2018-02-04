package joungEun;

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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(9));
	}
}