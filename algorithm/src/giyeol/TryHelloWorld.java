package giyeol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;

        return answer;
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
				
				int[] xsum = new int[5];
				int[] ysum = new int[5];
				HashMap<Integer, Integer> xmap = new HashMap<>();
				HashMap<Integer, Integer> ymap = new HashMap<>();
				
				//행마다 O의갯수 최대값을 찾는다
				for(int i=0; i<board.length; i++) {
					for(int j=0; j<board.length; j++) {
						if(board[i][j] == 'O') {
							xsum[i]++;
						}
					}
					//System.out.println("check"+i+" , "+xsum[i]);
					xmap.put(i, xsum[i]);
				}
				
				//열마다 O의갯수 최대값을 찾는다
				for(int i=0; i<board.length; i++) {
					for(int j=0; j<board.length; j++) {
						if(board[j][i] == 'O') {
							ysum[i]++;
						}
					}
					//System.out.println("check"+i+" , "+ysum[i]);
					ymap.put(i, ysum[i]);
				}
				
				//행의첫최대값위치와 열의첫최대값의 교차점부터 시작해 정사각형을 그린다.
				//시작 좌표부터 찾기(1,2)
				Set<Integer> xkeySet = xmap.keySet();
				Set<Integer> ykeySet = ymap.keySet();
				Iterator<Integer> xiterator = xkeySet.iterator();
				Iterator<Integer> yiterator = ykeySet.iterator();
				
				while (xiterator.hasNext()) {
					   Integer key = xiterator.next();
					   Object value = xmap.get(key);
					   System.out.printf("x키 : %d , 값 : %d %n", key, value);
				}
				while (yiterator.hasNext()) {
					   Integer key = yiterator.next();
					   Object value = ymap.get(key);
					   System.out.printf("y키 : %d , 값 : %d %n", key, value);
				}
				

        System.out.println(test.findLargestSquare(board));
    }
}