import java.util.*;
class Operation{
	public static void main(String args[]){
		
		arithmaticOperator();
		logicalOperator();
		
		
	}
	public static void arithmaticOperator(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=s.nextInt();
		System.out.println("Enter Second number");
		int b=s.nextInt();
		int k=a+b;
		int c=a-b;
		int d=a/b;
		int e=a%b;
		int f=a*b;
		System.out.println("a+b="+k);
		System.out.println("a-b="+c);
		System.out.println("a/b="+d);
		System.out.println("a%b="+e);
		System.out.println("a+b="+f);
		
	}
	public static void logicalOperator(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=s.nextInt();
		System.out.println("Enter Second number");
		int b=s.nextInt();
		int c=a&b;
		int d=a|b;
		System.out.println("a&&b="+c);
		System.out.println("a||b="+d);
	}


}