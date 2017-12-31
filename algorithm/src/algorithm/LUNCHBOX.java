package algorithm;

import java.util.Scanner;

public class LUNCHBOX {

	static int box_num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test_case;
		BOX_INFO[] box;
		Scanner aa= new Scanner(System.in);
		
		System.out.println("테스트케이스를 입력하시오");
		test_case=aa.nextInt();
		
	
		
		for(int i=0;i<test_case;i++){
			
			System.out.println("도시락 수를 입력하시오");
			box_num=aa.nextInt();
			
			box=new BOX_INFO[box_num];
			for(int k=0;k<box_num;k++){
				box[k]=new BOX_INFO();
			}
			
			System.out.println("데우는데 걸리는 시간을 입력하시오");
			for(int j=0;j<box_num;j++){
			
			box[j].setHitting_time(aa.nextInt());
			}
			System.out.println("먹는데 걸리는 시간을 입력하시오");
			for(int j=0;j<box_num;j++){
				
			box[j].setEatting_time(aa.nextInt());
			}
			
			Sorting(box);
			
			System.out.println("최소 값은 :"+Compare(box));

			
		}
	
	}
	
	public static void Sorting(BOX_INFO[] box){

		int temp;
		int temp2;
		for (int i=0; i<box_num; i++) {
			for (int j=0; j<box_num; j++){
				if (box[i].getEatting_time() > box[j].getEatting_time()){
					temp = box[i].getEatting_time();
					temp2 = box[i].getHitting_time();
					box[i].setEatting_time(box[j].getEatting_time());
					box[i].setHitting_time(box[j].getHitting_time());
					box[j].setEatting_time(temp); 
					box[j].setHitting_time(temp2);
					
				}
			}
		}
	}
	
	public static int Compare(BOX_INFO[] box){
		
		int total=0;
		int cpa=0;
		int aa[]=new int[box_num];
		aa[0]=2;
		for(int i=1;i<box_num;i++){
			
			aa[i]+=(aa[i-1]+box[i].getHitting_time());
		}
		total+=box[0].getEatting_time()+box[0].getHitting_time();
		
		for(int i=0;i<box_num;i++){
			
			if(i+1>box_num)
				break;
			
			if(total>aa[i]+box[i].getEatting_time()){
				continue;				
			}
			else
			{
				total=aa[i]+box[i].getEatting_time();
			}
				
				
			
		}
		
		
		
		return total;
		
		
	}

}



class BOX_INFO{
	
	private int eatting_time;
	private int hitting_time;
	
	
	public int getEatting_time() {
		return eatting_time;
	}
	public void setEatting_time(int eatting_time) {
		this.eatting_time = eatting_time;
	}
	public int getHitting_time() {
		return hitting_time;
	}
	public void setHitting_time(int hitting_time) {
		this.hitting_time = hitting_time;
	}
	
	
}
