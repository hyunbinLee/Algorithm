package giyeol;

import java.util.Scanner;

public class kakao02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String dartResult = scan.next();  //���ڿ� �ޱ� ����x
		int level = 0;
		
		//��ȸ�� ����
		String group[] = {"","",""}; 
		
		
		//SȤ�� DȤ�� T���ڰ� ���ö����� �о �׷���
		for(int i=0; i<dartResult.length(); i++) {
			if(level == 0) {
				group[0] += String.valueOf(dartResult.charAt(i));
				if(dartResult.charAt(i)=='S' || dartResult.charAt(i)=='D' || dartResult.charAt(i)=='T') {
					level++;
				}
			} else if (level == 1) {
				group[1] += String.valueOf(dartResult.charAt(i));
				if(dartResult.charAt(i)=='S' || dartResult.charAt(i)=='D' || dartResult.charAt(i)=='T') {
					level++;
				}
			} else if (level == 2) {
				group[2] += String.valueOf(dartResult.charAt(i));
			}
		
		}
		
		//�׷쿡�� *�̳� #�� üũ�Ͽ� �����Ͽ� �ٽ� �׷������� , ��׷쿡 *,+,- ������ üũ
		////////////////
		int a = 0;
		int b = 0;
		int c = 0;
		int total = 0;
		int checkSum[] = {1,1,1};
		
		for(int i=0; i<group.length; i++) {
			if(group[i].length() > 2) {
				if(group[i].contains("*")) {
					group[i].replace("*", "");
					if(i==1) {
						checkSum[0] = checkSum[0]*2;
						checkSum[1] = checkSum[1]*2;
					} else if(i == 2) {
						checkSum[1] = checkSum[1]*2;
						checkSum[2] = checkSum[2]*2;
					}
				} else if(group[i].contains("#")){
					group[i].replace("#", "");
					if(i==1) {
						checkSum[1] = checkSum[1]*(-1);
					} else if(i == 2) {
						checkSum[2] = checkSum[2]*(-1);
					}
				}
			}
		}
		
		////////////////
		int[] sum = new int[3];
		for(int i=0; i<group.length; i++) {
			
			if(group[i].charAt(1) == 'S') {
				sum[i] += (int) (Math.pow(Integer.parseInt(String.valueOf(group[i].charAt(0))), 1)*checkSum[i]);
			} else if(group[i].charAt(1) == 'D') {
				sum[i] += (int) (Math.pow(Integer.parseInt(String.valueOf(group[i].charAt(0))), 2)*checkSum[i]);
			} else if(group[i].charAt(1) == 'T') {
				sum[i] += (int) (Math.pow(Integer.parseInt(String.valueOf(group[i].charAt(0))), 3)*checkSum[i]);
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			total += sum[i];
		}
		
		System.out.println(total);
		
		
	}
}
