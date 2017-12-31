package hyunBeen;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 0;
		
		Scanner aa = new Scanner(System.in);
		System.out.println("개수 입력");
		N=aa.nextInt();
		
		int [] a = new int[N];
		int [] b = new int[N];
		System.out.println("값 들 입력.");
		for(int i=0;i<N; i++){
			
			a[i] = aa.nextInt();
		}
			
		int takenTime = 0;
		int tmp=0;	
		
		for(int i = 0 ;i < N; i++){
			for(int j = i + 1 ; j < N; j++){
				
				if(a[i]>a[j]){
					
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
				else
					continue;
					
				
			}
			
		}
		
		for(int i = 0; i<N; i++){
			if(i!=0)
				b[i] = a[i] + b[i-1];
			else
				b[i]=a[i];
			

			takenTime += b[i];
		}
		

		System.out.println(takenTime);
	
		
	}

}
