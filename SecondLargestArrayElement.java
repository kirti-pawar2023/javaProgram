
public class SecondLargestArrayElement {
	public static void main(String[] args) {
		int arr[]= {25,10,35,15,45};
		
		System.out.println("Second largest element is :"+getelement(arr,5));
	}
	static int getelement(int[] arr,int total) {
		
		int temp;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr[arr.length-2];
	}
	

}
