package hyunBeen;

public class Dayday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1월 1일은 월요일. 0월 1화 2수 3목 4금 5토 6일
		
		System.out.println(Cal(2,25));
		
		
		
	}

	public static String Cal(int month,int day){
		int [] numofday = new int[12];
		int result = 0;
		String [] dd = new String[7];
		dd[0]="MON";dd[1]="TUS";dd[2]="WEN";dd[3]="THU";dd[4]="FRI";dd[5]="SAT";dd[6]="SUN";
		numofday[0]=31;numofday[1]=28;numofday[2]=31;numofday[3]=30;numofday[4]=31;numofday[5]=30;numofday[6]=31;numofday[7]=31;numofday[8]=30;numofday[9]=31;numofday[10]=30;numofday[11]=31;
		
		for(int i=0;i<(month-1); i++){
			
			result += numofday[i];
		}
		
		result += (day-1);
		
			
		return dd[result%7];
		
		
		
		
	}
}
