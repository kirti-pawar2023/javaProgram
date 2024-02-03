package looping;

public class frequencyOfElement {

	public static void main(String[] args) {
		int[] arr= {4,2,5,3,4,2,4,5,4,2,80};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
		    for(int j=0;j<arr.length;j++) {
		    	if(arr[i]==arr[j]) {
		    		 count++;
		    		 j++;
		    		
		    	}
		    }
		    System.out.println( " Number is :"+ arr[i]+" Count count is "+count);
		}
		
	}

}
