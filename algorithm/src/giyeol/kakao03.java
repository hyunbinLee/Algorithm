package giyeol;

import java.util.Scanner;

public class kakao03 {
	public static void main(String[] args) {
		
		//������ , ����ġ ����������
		//LRU�˰��� �ֱٱ��� ������� ���� �����͸� ��ü
		//ĳ����Ʈ : cpu�� �����͸� ��û������ ĳ�� �޸𸮰� �ش� �����͸� ������ �ִ� ���.
		//ĳ�ù̽� : ĳ�� �޸𸮰����� �����ؼ� ���� ĳ�ù̽� ��..
		//https://namu.wiki/w/%EC%BA%90%EC%8B%9C%20%EB%A9%94%EB%AA%A8%EB%A6%AC
		
		int cashSize = 3; //ĳ��ũ��
		String cities[] = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; //�����̸� �迭
		int cachehit = 1;
		int cachemiss = 5;
		int execTime = 0;
		boolean check = false;
		Scanner scan = new Scanner(System.in);
		
		while(cashSize<0 || cashSize>30) {
			cashSize = scan.nextInt(); 
		}
		
		String cash[] = new String[cashSize];
		
		if(cashSize == 0) {
			execTime = cachemiss*cities.length;
		} else {
			//1. ĳ��ũ�⸸ŭ�� �켱 ĳ�ÿ� ��´�.
			for(int i=0; i<cashSize; i++) {
					cash[i] = cities[i];
					execTime += cachemiss;
			}
			
		/*	3���� 0,1,2 ��
			4���� 1,2,3 ��
			5���� 2,3,4 �� (5���� 1,2,3�̵ɼ���..)*/
			
			//2. ĳ�ÿ� ����ִ��� ��
			for(int i=cashSize; i<cities.length; i++) {
				for(int j=0; j<cash.length; j++) {
					if(cash[j].equals(cities[i])) {
						execTime += cachehit; //�̹� ĳ�ø޸𸮿� �����ϴ°�� +1
						check = true;
					} else if(j+1 == cash.length && check==false) { //����������
						cash[0] = cities[i]; //���� �����Ȱ� ��ü
						execTime += cachemiss; //�̹� ĳ�ø޸𸮿� �������� �ʴ°�� +5
					}
				}
			}
			
		}
		
		
		
		//����ð�
		System.out.println(execTime);
		
	}
}
