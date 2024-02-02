package controlStttest;
import java.util.*;
public class checkcase {
	public static void main(String[] args) {
		System.out.println("Enter any alphabet");
		Scanner sc=new Scanner(System.in);
	    char ch=sc.next().charAt(0);
	    
	    if(Character.isUpperCase(ch)) {
	    	System.out.println(ch+" Character is in upper case");
	    }
	    else
	    	System.out.println(ch+" Character is in lower case");
	    	
	}

}
