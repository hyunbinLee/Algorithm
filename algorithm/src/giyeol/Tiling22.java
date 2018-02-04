package giyeol;

class Tiling22 {
	
	
	public int tiling(int n) {
		int count = 1;
		int a=1, b=0, c=0;
		
		if(n==1) {
			return n;
		}
		
		while(count <= n) {
			//System.out.println(a+" ");
			c=b;
			b=a;
			a=b+c;
			count++;
		}
		if(a>99999) { 
			String str = String.valueOf(a);
			a = Integer.parseInt(str.substring(str.length()-5, str.length()));
		}
		
		return a;
	}

	public static void main(String args[]) {
		Tiling22 tryHelloWorld = new Tiling22();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		
		System.out.print(tryHelloWorld.tiling(5));
	}
}