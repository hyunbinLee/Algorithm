import java.util.Scanner;
//programmers lvl.4 가장 큰 정사각형

class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
     
        int answer = 0;
        //2차원 배열 dp 생성. board보다 길이 +1 (값을 찾을 때 대비)
        int [][]dp = new int[board.length+1][board[0].length+1];
        //board의 'O'를 찾아서 dp에 1넣기
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='O'){
                    dp[i+1][j+1] = 1;
                }
            }
        }
         
        //dp에 1값을 넣었으니 dp내에서 1의 값을 가진 정사각형 찾기
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
            	//정사각형이 모두 1 이상일 때
                if(dp[i][j]>=1 && dp[i][j-1]>=1 && dp[i-1][j-1]>=1 && dp[i-1][j]>=1){
                	//Math.min(x,y) x,y중 작은값 반환
                	/*   (w x)
                	 *   (y z) 중에  w,x 중 작은값 먼저 반환하고
                	 * 		       이후에 y랑 반환한 값 작은값 비교 후 최종 반환.
                	 * 		   dp[i][j]에 최종값 + 1 넣는다
                	 */
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1], dp[i-1][j]))+1; 
                }
            }
        }
	    
        //printArray(dp);
        
        //dp내에서 가장 큰 값 찾기
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
            	//Math.max(x,y) x,y중 큰 값 반환
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
