package sorting;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();
		
		int list[] = new int[n];
		
		System.out.println("Enter Elememts: ");
		for(int i=0; i<n; i++) {
			list[i]=sc.nextInt();
		}
		
		System.out.println("Entered List is: ");
		for(int i=0; i<n; i++) {
			System.out.print(list[i] + "	");
		}
		System.out.println();
		System.out.println();
		
		for(int i=1; i<n; i++) {
			int temp = list[i];
			for(int j=i-1; j>=0; j--) {
				if(list[j]>temp) {
					list[j+1]=list[j];
					list[j]=temp;
				}
			}
			
			System.out.println("List after " + (i+1) + " iterations is: ");
			for(int k=0; k<n; k++) {
				System.out.print(list[k] + "	");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sorted List is: ");
		for(int i=0; i<n; i++) {
			System.out.print(list[i] + "	");
		}
		System.out.println();
		
	}

}
