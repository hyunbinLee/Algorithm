package giyeol;

public class Expressions {

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}
	
	public int expressions(int num) {
		int answer = 1;
		int nums = 1;
		
		
		while(nums<num) {
			int sum = 0;
			for(int i=nums; i<=num; i++) {
				sum = sum + i;
				if(sum==num) {
					answer++;
					break;
				} else if(sum>num) {
					break;
				}
			}
			nums++;
		}

		return answer;
	}
}