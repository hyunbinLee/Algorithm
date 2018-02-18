package giyeol;

import java.util.Scanner;

public class kakao03 {
	public static void main(String[] args) {
		
		//제이지 , 어피치 지도개발팀
		//LRU알고리즘 최근까지 사용하지 않은 데이터를 교체
		//캐시히트 : cpu가 데이터를 요청했을때 캐시 메모리가 해당 데이터를 가지고 있는 경우.
		//캐시미스 : 캐시 메모리공간이 부족해서 나는 캐시미스 등..
		//https://namu.wiki/w/%EC%BA%90%EC%8B%9C%20%EB%A9%94%EB%AA%A8%EB%A6%AC
		
		int cashSize = 3; //캐시크기
		String cities[] = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; //도시이름 배열
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
			//1. 캐시크기만큼만 우선 캐시에 담는다.
			for(int i=0; i<cashSize; i++) {
					cash[i] = cities[i];
					execTime += cachemiss;
			}
			
		/*	3번과 0,1,2 비교
			4번과 1,2,3 비교
			5번과 2,3,4 비교 (5번과 1,2,3이될수도..)*/
			
			//2. 캐시에 들어있는지 비교
			for(int i=cashSize; i<cities.length; i++) {
				for(int j=0; j<cash.length; j++) {
					if(cash[j].equals(cities[i])) {
						execTime += cachehit; //이미 캐시메모리에 존재하는경우 +1
						check = true;
					} else if(j+1 == cash.length && check==false) { //마지막까지
						cash[0] = cities[i]; //가장 오래된것 교체
						execTime += cachemiss; //이미 캐시메모리에 존재하지 않는경우 +5
					}
				}
			}
			
		}
		
		
		
		//실행시간
		System.out.println(execTime);
		
	}
}
