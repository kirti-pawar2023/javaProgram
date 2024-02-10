
public class AdditionOfEvenAndOddNumber  {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int even=0;
		int odd=0;
		
		int[] arr2= {0,0,2,1,3,5,2};
		System.out.print("First Array is : ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else
				odd+=arr[i];
		}
		System.out.println("\nAddition of Even number in array element is : "+even);
		System.out.println("Addition of Even number in array element is : "+odd);
		
		System.out.print("Second  Array is : ");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("Addition of two array of Same Index number is: "); 
		for(int i=0;i<arr2.length;i++) {
			arr[i]+=arr2[i];
			System.out.print(arr[i]+" ");
		}
	


	}

}
