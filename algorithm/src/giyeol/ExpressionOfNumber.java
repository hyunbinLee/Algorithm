package giyeol;

public class ExpressionOfNumber {
	public static void main(String[] args) {
		
		int testNo = 15;
		int testAnswer = expressions(testNo);
		
		System.out.println(testAnswer);
		
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
		
	}
	
	public static int expressions(int testCase)
	{
		int answer = 1;
		int num = 1;
		
		
		while(num<testCase) {
			int sum = 0;
			for(int i=num; i<=testCase; i++) {
				sum = sum + i;
				if(sum==testCase) {
					answer++;
					break;
				} else if(sum>testCase) {
					break;
				}
			}
			num++;
		}

		return answer;
	}
}
