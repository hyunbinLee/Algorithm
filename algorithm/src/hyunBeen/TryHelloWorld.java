package hyunBeen;

class TryHelloWorld {
	public int chooseCity(int n, int[][] city) {
		int answer = 0;
		int [] z = new int [city.length];
		for (int i = 0; i < city.length; i++) {
			for (int j = 0; j < city.length; j++) {
				int tmp = 0;
				
				if(j==i) continue;
				
				tmp = city[j][0] - city[i][0];
				
				if (0 > tmp)  tmp = 0 - tmp;
				
				z[i]  += city[j][1]*tmp;
				
			}
		}
		
		
		for(int i = 0; i < z.length; i++){
			if(i == z.length-1)
				break;
			
			
			if(z[i] <= z[i+1])
				answer = i;
			else 
				continue;
			
		}
		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int tn = 3;
		int[][] tcity = { { 1, 5 }, { 2, 2 }, { 3, 3 } };
		System.out.println(test.chooseCity(tn, tcity));
	}
}