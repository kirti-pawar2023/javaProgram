class febonacciSeries{
	
	public static void main(String args[]){
		
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
        System.out.println(secondnumber);
		
		for(int i=2;i<=10; i++){
			int temp=firstnumber+secondnumber;
			System.out.println(temp);
			firstnumber=secondnumber;
			secondnumber=temp;
			
			
			
		}
		
		
		
	}
	
	
	
}