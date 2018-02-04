package joungEun;

public class EatCookie{
	

	public static void main(String args[]) throws Exception	{
	
		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
		// ���� ��Ű ����
		int eat = 0;
		
		// ��� �� �ܰ�
		for(int j = 0; j < 6; j++){
		// ��Ű���� ã��
		for(int i = 0; i < cookies.length; i ++){
			if(cookies[i] == j){
				eat++;
				break;
			}			
		}			
	}
		
		 System.out.print(eat);
		
					
					
				
				
	}
}