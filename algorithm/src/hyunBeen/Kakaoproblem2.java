package hyunBeen;

public class Kakaoproblem2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 크기
		//
	}
	

}

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int max = arr.length;
        int [] aa = new int[max];
        
        for(int i=0;i<max;i++){
            aa[i]=i+1; 
        }
        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(arr[i]==aa[j]){
                    answer = true;
                    break;
                }
                else
                   answer = false;
                }
            if(answer == false)
                return answer;
        }
        
        return answer;
    }
}