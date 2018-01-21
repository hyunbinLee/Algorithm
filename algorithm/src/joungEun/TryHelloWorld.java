import java.util.Scanner;
//programmers lvl.4 ���� ū ���簢��

class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
     
        int answer = 0;
        //2���� �迭 dp ����. board���� ���� +1 (���� ã�� �� ���)
        int [][]dp = new int[board.length+1][board[0].length+1];
        //board�� 'O'�� ã�Ƽ� dp�� 1�ֱ�
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='O'){
                    dp[i+1][j+1] = 1;
                }
            }
        }
         
        //dp�� 1���� �־����� dp������ 1�� ���� ���� ���簢�� ã��
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
            	//���簢���� ��� 1 �̻��� ��
                if(dp[i][j]>=1 && dp[i][j-1]>=1 && dp[i-1][j-1]>=1 && dp[i-1][j]>=1){
                	//Math.min(x,y) x,y�� ������ ��ȯ
                	/*   (w x)
                	 *   (y z) �߿�  w,x �� ������ ���� ��ȯ�ϰ�
                	 * 		       ���Ŀ� y�� ��ȯ�� �� ������ �� �� ���� ��ȯ.
                	 * 		   dp[i][j]�� ������ + 1 �ִ´�
                	 */
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1], dp[i-1][j]))+1; 
                }
            }
        }

        //printArray(dp);
        
        //dp������ ���� ū �� ã��
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
            	//Math.max(x,y) x,y�� ū �� ��ȯ
                answer = Math.max(dp[i][j], answer);
            }
        }
         
        return answer*answer;
        
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
				char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}