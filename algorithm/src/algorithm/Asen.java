package algorithm;

public class Asen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int[6];
		
		aa[0]=5;
		aa[1]=5;
		aa[2]=2;
		aa[3]=3;
		aa[4]=4;
		aa[5]=1;
		
		aa = Cal(aa);
		
		for(int i=0;i<aa.length;i++)
		System.out.println(aa[i]);
	}
	
	public static int[] Cal(int [] tmp){
		
		int tmp_s=0;
		int check=0;
		for(;;){
			check = 0 ;
			for(int i=0; i<(tmp.length-1);i++){
				if(tmp[i]>tmp[i+1]){
					tmp_s=tmp[i];
					tmp[i]=tmp[i+1];
					tmp[i+1] = tmp_s;   // 3 1 2 4
					check++;
				}
				
			}
			if(check == 0 )
				break;
		}
		
		return tmp;
		
	}
	
}
