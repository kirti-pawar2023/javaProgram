import java.util.*;
class reverse{
	public static void main(String args[]){
		int rev=0;
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		int temp;
		int palin=number;
		
		while(number!=0){
			temp=number%10;
			rev=rev*10+temp;
			number=number/10;
		}
		System.out.println("reverse number is " + rev);
		
		if(rev==palin){
			System.out.println("It is an palindron number");
		}
		else{
			System.out.println("It is not palindron number");
		}
	}
}