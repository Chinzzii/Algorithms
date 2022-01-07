package sorting;
import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0; i<n-1; i++) {
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j+1];
					list[j+1] = list[j];
					list[j]=temp;
					sorted = false;
				}
			}
			if(sorted==true) break;
			
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
