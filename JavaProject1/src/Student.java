import java.util.*;
public class Student {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter element to check weather it is prime number or not :");
		int n=sc.nextInt();
		boolean b=true;
		
		if(n==0|| n==1) {
			System.out.println("Is is not prime number.");
			
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				b=false;
			}
		}
		if(b==false) {
			System.out.println("It is not prime number");
			
		}
		else
			System.out.println(n+" is prime number ");
	}

}
