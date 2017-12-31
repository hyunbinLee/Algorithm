package algorithm;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	
	public static char Cal(String alpha){
		
		char [] tmp = new char[alpha.length()];
		int [] count = new int[alpha.length()];
		for(int i=0; i<alpha.length();i++){
			tmp[i]=alpha.charAt(i);	
		}
	for(int i=0; i < alpha.length();i++){
		
			for(int j=i+1;j<alpha.length();j++){
				
				if(tmp[i]==tmp[j] || tmp[i]+32==tmp[j])
					count[i]++;
			}
		}
	int maximum=0;
	
	for(int i=0; i<count.length;i++){
		
		if(count[i]>count[i+1])
			maximum = i;
		else
			maximum=i+1;	
	}
	return tmp[maximum];
	
		
	}
}
