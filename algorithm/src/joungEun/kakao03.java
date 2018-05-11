package joungEun;

import java.util.LinkedList;

public class kakao03{
	public static void main(String args[]){
		solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
			
	}
	
	public static void solution(int cachesize, String[] cities){
		LinkedList<String> cache = new LinkedList<String>();
		int time = 0;
		
		for(int i = 0; i < cities.length; i++){
			String city = cities[i].toUpperCase();
			
			if (cache.contains(city)){
				cache.remove(city);
				cache.add(city);
				time+=1;
				System.out.println(cache);
			} else {
				//cache.remove(0);
				cache.add(city);
				time+=5;
			}
			
		}
		
		//ĳ�û����� �ν�X �Ȱ��� ���ڰ� ������ remove�ϰ� add�ѰŸ� �ν�
		
		
	}
}