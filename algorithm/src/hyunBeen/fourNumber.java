package hyunBeen;

public class fourNumber {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1000; i<10000; i++)
			if(HexCal(i) == Cal(i) )
				System.out.println(i);
		
	}
	
	
	
	
	public static int HexCal(int number){	
		
		String a = Integer.toHexString(number);
		int [] tmp = new int[a.length()];
		int result=0;
		
		for(int i= 0; i < a.length(); i++){
			tmp[i]=Integer.parseInt(""+a.charAt(i),16);
			result += tmp[i];
		}
		
		
		return result;
		
		
	}
	
	public static int Cal(int number){	
		
		int result =0;
		
		 while(number!=0){
	            result+= number%10;
	            number /= 10;
	        }


		return result;
		
	}
	
	
}
