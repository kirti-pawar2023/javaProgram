
public class ArraySwaping {
	    public static void main(String args[])
	    {
	        int[] arr = {7,0,1,6,87};
	        System.out.println("Original Array");
	        for(int i:arr) {
	        	System.out.print(i+" ");
	        }
	       System.out.println("\nReverse Array using Swaping :");
	        int j=0;
	        for(int i=arr.length-1;i>=arr.length/2;i--) {
	     
	        	int temp=arr[i];
	             arr[i]=arr[j];
	             arr[j]=temp;
	        	j++;
	        	
	        }
	        for(int i:arr) {
	        	System.out.print(i+" ");
	        }
	        System.out.println("\nReverse Array using another array");
	        int[] arr2=new int[arr.length];
	        for(int i=arr.length-1;i>=0;i--) {
	        	arr2[i]=arr[i];
	        	System.out.print(arr2[i]+" ");
	        }
	    }
	

}
