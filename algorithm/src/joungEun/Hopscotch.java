package joungEun;

public class Hopscotch{
	
	int hopscotch(int[][] board, int size) {
        
		int sum = 0;

		for(int i = 1; i < size; i ++){
			int max = 0;
			
			for(int k = 0; k < 4; k++){
					for(int j = 0; j < 4; j ++){
						if(board[i-1][j] > max)
							max = board[i-1][j];
					}
					
				if(board[i-1][k] == max)
					board[i][k] = board[i-1][k];


				System.out.println(max);
			}
			
			sum += max;
		}
		
        return sum;
    }

	
	public static void main(String args[]) throws Exception	{
	
		Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.hopscotch(test, 3));
        
        
    }
}