import java.util.*;
class switchCase{
	public static void main(String args[]){
		System.out.println("Enter any Character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		switch(Character.toUpperCase(ch)){
			case 'A' :
			System.out.println("It is a vowel ");
			break;
			case 'E' :
			System.out.println("It is a vowel ");
			break;
			case 'I' :
			System.out.println("It is a vowel ");
			break;
			case 'O' :
			System.out.println("It is a vowel ");
			break;
			case 'U':
			System.out.println("It is a vowel ");
			break;
			default:
			System.out.println("It is not vowel ");
			break;
		}
	}



}