package giyeol;

public class Solution02 {

	public static void main(String[] args) {
		
		//���ڸ� ��ǥ�� ���ؼ� ���ڸ��ϳ��־��ְ� ���ڸ� �ϳ��־���
		
		int[][] v = new int[][] { {1,4} , {3,4} , {3,10} };  // {1.10} ���;���
		
		int[] tempx = new int[4];
		int[] tempy = new int[4];
		
		//���ڸ� �ٴ����� ����ū���ΰ��ջ�  ex) 4 4 3   -> 4+4+3 - (4+4) = 3
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<2; j++) {
				if(j==0) { //x��ǥ
					tempx[i] = v[i][j];
				} else { //y��ǥ
					tempy[i] = v[i][j];
				}
			}
		}
		
		int sumx =0;
		int sumy =0;
		for(int i=0; i<3; i++) {
			sumx += tempx[i]; //x��ǥ��
			sumy += tempy[i]; //y��ǥ��
		}
		
		//ū�� ������ ã�·���
		int maxx = 0;
		int maxy = 0;
		int minx = 0;
		int miny = 0;
		
		//���⼭ ������ ����� �ȵ�
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
