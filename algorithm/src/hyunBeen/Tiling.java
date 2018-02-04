package hyunBeen;

public class Tiling {

	public int tiling(int n) {
		int answer = 0;
		int Arr[] = new int[n];
		Arr[0] = 1;

		if (n > 0) {

			Arr[1] = 2;
			for (int i = 2; i < n; i++) {

				Arr[i] = Arr[i-1] + Arr[i-2];
			}

		}
		
		String bb = Arr[n-1]+"";
		if(bb.length()>5){
			
			 bb = bb.substring(bb.length()-5,bb.length());
			
		}
		
		
		answer = Integer.parseInt(bb);
		
		
		return answer;

	}

	public static void main(String args[]) {
		Tiling Tiling = new Tiling();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.print(Tiling.tiling(50));
	}
}
