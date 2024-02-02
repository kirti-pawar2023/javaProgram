package controlStttest;

public class additionOfArray {
	public static void main(String[] args) {
		int arr[]= {10,20,6,34,24,46,34};
		
		//System.out.print("Enter array element");
	
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Addition of array Element is "+sum);
		
	}

}
