

/*
길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
제한사항
     배열의 길이는 10만 이하입니다.
     배열의 원소는 10만 이하의 자연수입니다.
*/
// 결과 : 정확성 (O), 효율성(X)

package dohchoi;

import java.util.stream.IntStream;
public class Challenge3527 {
	public static void main(String args[]) {
    	int[] arr = {1,2,3,4};
    	
        boolean answer = true;
        
    	for (int i = 0; i < arr.length; i++) {
    		int value = i+1;
        	if (!(IntStream.of(arr).anyMatch(x -> x == value))) {
        		answer = false;
        	    break;
        	}
		} 
        System.out.println(answer);
	}
}
