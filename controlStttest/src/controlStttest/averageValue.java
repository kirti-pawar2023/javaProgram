package controlStttest;

public class averageValue {
	public static void main(String[] args) {
		int arr[]= {2,5,6,7,5,4};
		//System.out.println("Array is "+arr);
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			count++;
		}
		System.out.println("Addition of element is :"+sum);
		int avg=sum/count;
		System.out.println("Average value of array is : "+avg);
	}

}