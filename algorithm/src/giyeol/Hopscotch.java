package giyeol;

public class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        //�Լ��� �ϼ��ϼ���.
        
        int[] rowTemp = new int[4];
        int[] rowMax = new int[size];
        int[] yHint = new int[size]; //y��ǥ
        
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<4; j++) {
				rowTemp[j] = board[i][j]; //�� �迭
			}
			
				//���� �ִ밪 ����
				int temp = 0;
				for(int m=0; m<rowTemp.length; m++) {
					for(int n=m+1; n<rowTemp.length; n++) {
						if(rowTemp[m] < rowTemp[n]) {
							temp = rowTemp[m];
							rowTemp[m] = rowTemp[n];
							rowTemp[n] = temp;
						}
					}
				}
					rowMax[i] = rowTemp[0];
				//�ִ밪�� ��ǥã��, ��ǥ�� ���� ��ġ�ϸ� rowTemp[1]�� ������
					for(int x=0; x<board.length; x++) { //5,8,4,17
						for(int y=0; y<4; y++) {
							if(rowMax[i] == board[x][y]) {
								System.out.println("x :"+x+" , y:"+y); //�̿ϼ� 1,0�� �ֳ�������..
								System.out.println(board[x][y]);
								yHint[i] = y;
							}
						}
					}
					/*System.out.println("a"+yHint[0]);
					System.out.println("a"+yHint[1]);
					System.out.println("a"+yHint[2]);*/
					//rowMax[i] = rowTemp[1];
					
		}
		
		for(int i=0; i<rowMax.length; i++) {
			//System.out.println(rowMax[i]);
			result += rowMax[i];
		}
        
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.hopscotch(test, test.length));
    }

}