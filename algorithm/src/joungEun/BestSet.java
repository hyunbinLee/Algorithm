import java.util.Arrays;
import java.util.Scanner;
//programmers lvl.4 최고의 집합

public class BestSet{

	public int[] bestSet(int n, int s){
		
        int[] set = null;
    
        //집합이 없는경우 n이 s보다 클 때
        if(n > s){
        	set = new int[1];
        	set[0] = -1;
        	return set;
        }
        
        //집합 있는 경우
        set = new int[n];
        int a = s/n;        
        
        for(int i = 0; i< n; i++){
        	set[i] = a;
        }

        for(int j = 0; j < s%n; j++){
        	set[n-j-1]++;
	}        
        
        return set;
	}
    
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}
