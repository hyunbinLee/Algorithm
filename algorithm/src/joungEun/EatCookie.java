import java.util.Scanner;
//programmers lvl.6 °úÀÚ ¸¹ÀÌ ¸Ô±â

public class EatCookie{
	

	public static void main(String args[]) throws Exception	{
	
		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
		// ¸ÔÀº ÄíÅ° °³¼ö
		int eat = 0;
		
		// Äí±â ¸À ´Ü°è
		for(int j = 0; j < 6; j++){
		// ÄíÅ°¿¡¼­ Ã£±â
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