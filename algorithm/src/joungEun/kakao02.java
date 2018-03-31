
package joungEun;
import java.util.Scanner;

public class kakao02{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
			//1S2D*3T
			String[] N = sc.nextLine().split("");
			String num[] = {"0","1","2","3","4","5","6","7","8","9","10"};
			String dart[] = new String[3];
			
			int round = 0;
			
			for(int i = 0; i < N.length; i++){
				for(int j = 0; j < 10; j++){
					//���ڰ� ���� ���ο� ���� ����
					if(N[i].equals(num[j])){
						round++;		
					}
				}
				//dart�� �Ѱ��Ӿ� �б�
				if(round == 1){
					dart[0] += N[i];
				}else if (round == 2){
					dart[1] += N[i];
				}else if (round == 3){
					dart[2] += N[i];
				}
			}
			
			
			
			//�������
			for(int j = 0; j< dart.length; j++){
				
			}
			
			
	}
}