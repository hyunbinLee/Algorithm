package giyeol;

import java.util.Arrays;  //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
    	
    	int[] answer = null;
    	 
    	if(n==0) {
    		int[] answerTemp = new int[1];
    		answerTemp[0] = -1;
    		answer = answerTemp;
    	} else {
    		answer = new int[n];
    		int mok = s/n;
        	int nam = s%n;
        	for(int i=0; i<answer.length; i++) {
        		answer[i] = mok;
        		if(i == answer.length-1) {
        			answer[i] = mok+nam;
        		}
        		
        	}
    	}
    	
        return answer;
    }
    
    
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(5,19))); //3,13  5,19 -> 3,4,4,4,4
    }
    
    
    

}