package giyeol;

public class Solution02 {

	public static void main(String[] args) {
		
		//앞자리 좌표를 비교해서 앞자리하나넣어주고 뒷자리 하나넣어줌
		
		int[][] v = new int[][] { {1,4} , {3,4} , {3,10} };  // {1.10} 나와야함
		
		int[] tempx = new int[4];
		int[] tempy = new int[4];
		
		//앞자리 다더한후 제일큰수두개합뺌  ex) 4 4 3   -> 4+4+3 - (4+4) = 3
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<2; j++) {
				if(j==0) { //x좌표
					tempx[i] = v[i][j];
				} else { //y좌표
					tempy[i] = v[i][j];
				}
			}
		}
		
		int sumx =0;
		int sumy =0;
		for(int i=0; i<3; i++) {
			sumx += tempx[i]; //x좌표합
			sumy += tempy[i]; //y좌표합
		}
		
		//큰수 작은수 찾는로직
		int maxx = 0;
		int maxy = 0;
		int minx = 0;
		int miny = 0;
		
		//여기서 검증이 제대로 안됨
		for(int i=0; i<2; i++) {
			if(tempx[i]>tempx[i+1]) {
				maxx = tempx[i];
				maxy = tempy[i];
				minx = tempy[i+1];
				miny = tempy[i+1];
			} else {
				maxx = tempx[i+1];
				maxy = tempy[i+1];
				minx = tempx[i];
				miny = tempy[i];
			}
		}
		
		
		tempx[3] = sumx - maxx*2;
		tempy[3] = sumy - maxy*2;
		System.out.println("["+tempx[3]+","+tempy[3]+"]");
		
	}
}
