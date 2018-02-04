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
        int [][]tcity = {{1,5},{2,2},{3,3}};  //��ġ,�α���
        System.out.println(test.chooseCity(tn,tcity));
    }
    
    public int chooseCity(int n, int [][]city)
    {
    	int answer = 0;
    	int[] position = new int[city.length];
    	
    	//��ġ�� 1�ϰ�� , 2�ϰ��, 3�ϰ�� ������� , �ݺ������� ��������
    	position[0] = (city[1][0] - city[0][0])*city[1][1] + (city[2][0] - city[0][0])*city[2][1];
    	position[1] = (city[1][0] - city[0][0])*city[0][1] + (city[2][0] - city[1][0])*city[2][1];
    	position[2] = (city[2][0] - city[0][0])*city[0][1] + (city[2][0] - city[1][0])*city[1][1];
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	map.put(city[0][0], position[0]);
    	map.put(city[1][0], position[1]);
    	map.put(city[2][0], position[2]);
    	
    	
    	//�Ÿ��� �ּ��ΰ���� ����Ʈ�� ���ϰ�,
    	System.out.println(position[0]); //8
    	System.out.println(position[1]); //8
    	System.out.println(position[2]); //12
    	
    	//����Ʈ�� �������ϰ�� x��ǥ�� �ּҰ��� x��ǥ(��ġ)��ȯ
    	Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator(); //Ű�� �������� ����
		while (iterator.hasNext()) {
			   Integer key = iterator.next(); 
			   Object value = map.get(key);
			   System.out.printf("xŰ : %d , �� : %d %n", key, value);
			   answer = key;
			   break;
			   // 1�϶� 8 break;
			   // 2�϶� 8
			   // 3�϶� 12��ȯ
		}

        return answer; //1��ȯ
    }
}