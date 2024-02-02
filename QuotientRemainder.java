import java.util.*;
class QuotientRemainder{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Divident : ");
		int Divident=s.nextInt();
		System.out.println("Enter Divident : ");
		int Divisior=s.nextInt();
		int Remainder=Divident%Divisior;
		int Quotient=Divident/Divisior;
		System.out.println("Quotient is :"+ Quotient);
		System.out.println("Remainder is :"+ Remainder);
	}
	
}