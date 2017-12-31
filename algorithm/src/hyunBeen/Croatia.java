package hyunBeen;

public class Croatia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Cal("ljes=njak"));
	}
	
	public static int Cal(String alpha){
		
		String [] croatia = new String [8];
		croatia[0]="c=";croatia[1]="c-";croatia[2]="dz=";croatia[3]="d-";croatia[4]="lj";croatia[5]="nj";croatia[6]="s=";croatia[7]="z=";
		int count=0;
		for(int i=0;i<croatia.length;i++){
			
			
			for(int j=0;j<alpha.length();j++){
				
				if(i!=2){
					if(j+1==alpha.length())break;

					if(alpha.substring(j,j+2).equals(croatia[i])){	
						count++;
					}
				}
				else{
					if(j+2==alpha.length())break;

					if(alpha.substring(j,j+3).equals(croatia[i]))
						count++;
				}
					
			}
		}
		
		return count;
		
	}
	
		

}
