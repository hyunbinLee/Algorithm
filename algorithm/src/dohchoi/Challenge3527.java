

/*
���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�.
1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ� ��� true��, �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.
���ѻ���
     �迭�� ���̴� 10�� �����Դϴ�.
     �迭�� ���Ҵ� 10�� ������ �ڿ����Դϴ�.
*/
// ��� : ��Ȯ�� (O), ȿ����(X)

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
