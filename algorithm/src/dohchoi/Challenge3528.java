/*	
 	���簢���� ����� �� �ʿ��� 4���� �� �� 3���� ��ǥ�� �־��� ��, ������ �� ���� ��ǥ�� ���Ϸ��� �մϴ�. 
 	�� 3���� ��ǥ�� ����ִ� �迭 v�� �Ű������� �־��� ��, ���簢���� ����� �� �ʿ��� ������ �� ���� ��ǥ�� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
 	��, ���簢���� �� ���� x��, y�࿡ �����ϸ�, �ݵ�� ���簢���� ���� �� �ִ� ��츸 �Է����� �־����ϴ�.

	���ѻ���
    v�� �� ���� ��ǥ�� ����ִ� 2���� �迭�Դϴ�.
    v�� �� ���Ҵ� ���� ��ǥ�� ��Ÿ����, ��ǥ�� [x�� ��ǥ, y�� ��ǥ] ������ �־����ϴ�.
         ��ǥ���� 1 �̻� 10�� ������ �ڿ����Դϴ�.
         ���簢���� ����� �� �ʿ��� ������ �� ���� ��ǥ�� [x�� ��ǥ, y�� ��ǥ] ������ ��� return ���ּ���.
         
        ����� ��
	v 	                          result
	[[1, 4], [3, 4], [3, 10]] => [1, 10]
	[[1, 1], [2, 2], [1, 2]] => [2, 1] 
*/

package dohchoi;

// ���ذ�!!
public class Challenge3528 {
	public static void main(String arg[]) {
		int[][] v = {{1, 1}, {2, 2}, {1, 2}};
        int[] answer = new int[2];
        boolean flag = false;
        
        for (int i = 0; i < 2; i++) {
    		int resValue = v[0][i];
    		flag = false;
    		for (int j = 1; j < 3; j++) {
        		if (!flag) {
	        		if (resValue == v[j][i]) {
						flag = true;
					} else {
						flag = false;
					}
				} else {
					if (v[j][i -1] == v[j][i]) {
						resValue = v[j][i];	
					} else {
						resValue = v[j][i-1];
					}
				}
			}
        	answer[i] = resValue;
		}
        	
        System.out.println(answer[0]);
        System.out.println(answer[1]);
		
	}
}
