package giyeol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Airport
{
    public static void main(String[] args)
    {
    	Airport test = new Airport();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};  //위치,인구수
        System.out.println(test.chooseCity(tn,tcity));
    }
    
    public int chooseCity(int n, int [][]city)
    {
    	int answer = 0;
    	int[] position = new int[city.length];
    	
    	//위치가 1일경우 , 2일경우, 3일경우 각각계산 , 반복문으로 만들어야함
    	position[0] = (city[1][0] - city[0][0])*city[1][1] + (city[2][0] - city[0][0])*city[2][1];
    	position[1] = (city[1][0] - city[0][0])*city[0][1] + (city[2][0] - city[1][0])*city[2][1];
    	position[2] = (city[2][0] - city[0][0])*city[0][1] + (city[2][0] - city[1][0])*city[1][1];
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	map.put(city[0][0], position[0]);
    	map.put(city[1][0], position[1]);
    	map.put(city[2][0], position[2]);
    	
    	
    	//거리가 최소인경우의 리스트를 구하고,
    	System.out.println(position[0]); //8
    	System.out.println(position[1]); //8
    	System.out.println(position[2]); //12
    	
    	//리스트가 여러개일경우 x좌표가 최소값인 x좌표(위치)반환
    	Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator(); //키값 오름차순 정렬
		while (iterator.hasNext()) {
			   Integer key = iterator.next(); 
			   Object value = map.get(key);
			   System.out.printf("x키 : %d , 값 : %d %n", key, value);
			   answer = key;
			   break;
			   // 1일때 8 break;
			   // 2일때 8
			   // 3일때 12반환
		}

        return answer; //1반환
    }
}