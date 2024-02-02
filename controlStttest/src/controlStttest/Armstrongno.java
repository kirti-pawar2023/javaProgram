package controlStttest;
import java.util.Scanner;
public class Armstrongno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter any number : ");
		int number=sc.nextInt();
		
		System.out.println("Armstrong number is : " +isArmstrong(number));

	}
	static boolean isArmstrong(int n) {
		int digit=0,temp;
		int sum=0;
		temp=n;
		while(temp>0){
			temp=temp/10;
			digit++;
		}
		System.out.println("number of digit is/are " +digit);
		temp=n;
		while(temp>0) {
			int lastdigit=temp%10;
			sum=(int) (sum+Math.pow(lastdigit , digit));
			temp=temp/10;
		}
		if(sum==n){
			return true;
		}
		return false;
	}

}
