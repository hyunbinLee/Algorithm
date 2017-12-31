package algorithm;

import java.util.Scanner;

public class ROPE {

	
	public static void main(String[] args) {
		int rope[]=new int[100000];
		int max_W[];
		int n=0;
		
		Scanner aa = new Scanner(System.in);
	

		System.out.println("로프 개수를 입력 하시오");
	
		n=aa.nextInt();
		
		max_W=new int[n];
		
		System.out.println("로프 최대 중량을 입력 하시오");

		for(int i=0;i<n;i++){
		rope[i]=aa.nextInt();
		}
		
		
		
		Sorting(rope,n);
		max_W[0]=rope[0];
		
		for(int i=1;i<n;i++){

			max_W[i]=(rope[i])*(i+1);
			
		}
		Sorting(max_W,n);
		
		System.out.println("최대값은 : "+max_W[0]+" 입니다.");

		
	}
	public static void Sorting(int[] rope,int n){

		int temp;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++){
				if (rope[i]>rope[j]){
					temp = rope[i];
					rope[i]=rope[j];
					rope[j]=temp;
					
				}
			}
		}
	}
	
	
}
