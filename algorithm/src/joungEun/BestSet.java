import java.util.Arrays;
import java.util.Scanner;
//programmers lvl.4 �ְ��� ����

public class BestSet{

	public int[] bestSet(int n, int s){
		
        int[] set = null;
    
        //������ ���°�� n�� s���� Ŭ ��
        if(n > s){
        	set = new int[1];
        	set[0] = -1;
        	return set;
        }
        
        //���� �ִ� ���
        set = new int[n];
        int x = s/n;        
        
        for(int i = 0; i< n; i++){
        	set[i] = x;
        }


        for(int j = 0; j < s%n; j++)
        	set[n-j-1]++;
        }
        
        
        return set;
	}
    
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}