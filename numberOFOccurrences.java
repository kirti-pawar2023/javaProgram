import java.util.*;
class numberOFOccurrences{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str;
		int i,len;
		int counter[]=new int[256];
		System.out.println("Enter String :");
		str=sc.nextLine();
		len=str.length();
		
		for(i=0; i<len; i++){
			counter[(int)str.charAt(i)]++;
			
		}
		
		for (i=0; i<256;i++){
			if(counter[i]!=0){
				System.out.println((char)i+"  ---"+ counter[i]);
			}
		}
	}
}