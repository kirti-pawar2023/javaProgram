package controlStttest;
import java.util.*;
public class checknumbertype {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		
		if(n==0) {
			System.out.println("number is neither positive not negative ");
		}
		else if(n>0) {
			System.out.println( n+ " is positive number");
		}
		else
			System.out.println(n+" is negative number");
		
	}


}
