package hyunBeen;

import java.util.Scanner;


public class PICNIC {
	
	private static boolean areFreinds[][] = new boolean[10][10];
	private static boolean matched[] = new boolean[10];
	private static int n = 0; 
	private static int m = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//사람 수
        m = sc.nextInt();//매칭 되는 커플 수
        
        for(int i=0;i<n;i++)
        	for(int j=i+1;j<n;j++)
        		areFreinds[i][j] = areFreinds[j][i] = false;
        for(int index=0;index<n;index++){
        	int i=0;int j=0;
        	i = sc.nextInt(); j = sc.nextInt();
        	areFreinds[i][j] = areFreinds[j][i] = true;
        	
        }
        for(int i=0;i<n;i++)
        	matched[i] = false;
        int way=0;
        countPairings(0,n,way);
        
 
    }
    
    
    private static int countPairings(int cnt,int total,int way){
    
    	
    	int i=0,j=0;
    	if(cnt==total) return 1; 
    	
    	for(i=0;i<total;i++)
    		if(matched[i]=false)
    			break;
    	
    	for(j=i+1;j<total;j++){
    		
    		if(matched[j]==true)continue;
    		if(areFreinds[i][j]==true && areFreinds[j][i]==true)
    		{
    			matched[i]=matched[j]=true;
    			if(countPairings(cnt+2,total,way)==1)
    			{
    				way++;
    			}
    			
    			matched[i]=matched[j]=false;
    		}
    		
    	}
    	
    	return 0;
    }
}
