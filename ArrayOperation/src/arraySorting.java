import java.util.*;
public class arraySorting {

	public static void main(String[] args) {
		System.out.println("Enter total number of array :");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter array "+n+ " Element ");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
          Arrays.sort(arr);
          for(int i=0;i<n;i++) {
        	  System.out.println(arr[i]);
          }
		
		
		/*int maxnumber=arr[0];
		int minnumber=arr[0];
	
		for(int i=0;i<n;i++) {
			int val=arr[i];
			if(val>maxnumber) {
				maxnumber=val;
				
			}
		}
		for(int i=0;i<n;i++) {
			int val=arr[i];
			if(val<minnumber) {
				minnumber=val;
				
			}
		}
		System.out.println("Minimum value of array is "+minnumber);
		System.out.println("Maximum value of array is "+maxnumber);
		
		*/
          
          
          
          
          
          
	}

}
