package giyeol;

class Tiling2 {
	
	
	public int tiling(int n) {
		int answer = 1;
		
		if(n<=1) {
			answer = 1;
		} else {
			answer = tiling(n-2)+tiling(n-1);
		}
		
		if(answer>99999) { 
			String str = String.valueOf(answer);
			answer = Integer.parseInt(str.substring(str.length()-5, str.length()));
		}
		
		return answer;
	}

	public static void main(String args[]) {
		Tiling2 tryHelloWorld = new Tiling2();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		
		System.out.print(tryHelloWorld.tiling(25));
	}
}