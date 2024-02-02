import java.util.*;
class PrimeNumber{
    public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		boolean b=true;
		if(n==0||n==1){
			System.out.println(n+" is not prime number");
		}
		for(int i=2;i<n; i++){
			if(n%i==0){
				System.out.println(n+" is not prime number");
				b=false;
				break;
			}
		}
		if(b=true){
			System.out.println(n+" is not prime number");
			break;
		}
		else 
			System.out.println(n+" is prime number");
	}
	
}