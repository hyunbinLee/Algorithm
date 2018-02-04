package giyeol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class cookie {

	public static void main(String[] args) {
		
		int nums[] = {1,4,2,6,3,4,1,5};
		int result = eatCookie(nums);
		
		System.out.println(result);

	}
	
	public static int eatCookie(int[] nums)
	{
		int answer = 0;
		int startPoint = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			answer = 0;
			startPoint = nums[i];
			while(count<10) { //수정필
				System.out.println(i+" , "+count);
				for(int j=0; j<nums.length; j++) {
					if(startPoint==nums[j]+count) { //1,2,3...
						System.out.println("check"+i);
						answer++;
						break;
					}
				}
				count++;
			}
			map.put(i, answer); 
		}
		
		
		//이터레이터 돌려서
		//map에있는수중 answer가 가장큰수를 리턴
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			   Integer key = iterator.next();
			   Object value = map.get(key);
			   System.out.printf("키 : %d , 값 : %d %n", key, value);
		}
		
		return answer;
	}

}
