import java.util.*;
public class arraySortingWithoutmethod {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of array element");
		int n=sc.nextInt();
		
		System.out.println("Enter "+ n+" array element:");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}