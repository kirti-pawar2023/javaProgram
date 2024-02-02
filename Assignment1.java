class Assignment1{
	
	public static void main (String args[]){
		datatype();
		additionOfTwoInteger();
		substractionOfTwoFloatNumber();
		divisionOfTwoInteger();
		productOfTwoInteger();
		
		
	}
	public static void datatype(){
		int myNum=9;
		double myFloat=8.99f;
		char myLetter='K';
		boolean myBoolean=true;
		String myText="Hello World"; 
		
		System.out.println(myBoolean+" " + myFloat+" "+myLetter+" "+myNum+" " +myText);
	}
	public static void additionOfTwoInteger(){
		
		int val1=10;
		int val2=20;
		int result=val1+val2;
		System.out.println("Addition of two number is :"+ result);
		
	}
	public static void substractionOfTwoFloatNumber(){
		
		double val1=30.49;
		double val2=20.34;
		double result=val1-val2;
		System.out.println("Substraction of two number is :"+ result);
		
	}
	public static void productOfTwoInteger(){
		
		int val1=10;
		int val2=20;
		int result=val1*val2;
		System.out.println("Product of two number is :"+ result);
		
	}
	public static void divisionOfTwoInteger(){
		
		int val1=10;
		int val2=20;
		int result=val1/val2;
		System.out.println("division of two number is :"+ result);
		
	}
	
	
	
}