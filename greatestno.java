import java.util.*;
class greatestno{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int a=s.nextInt();
		System.out.println("Enter Any Number:");
		int b=s.nextInt();
		System.out.println("Enter Any Number:");
		int c=s.nextInt();
		if(a>b){
			
			if (a>c){
				System.out.println("Greatest number is "+a);
			}
			else{
				System.out.println("Greatest number is "+c);
			}
		}
		else if(b>a){
			if (b>c){
				System.out.println("Greatest number is "+b);
			}
			else{
				System.out.println("Greatest number is "+c);
			}
		}
		else 
			System.out.println("invalid input");
			
	}


}