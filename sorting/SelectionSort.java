package sorting;
import java.util.Scanner;

public class SelectionSort {

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
			int k=i;
			for(int j=i+1; j<n; j++) {
				if(list[j]<list[k]) {
					k = j;
				}
			}
			if(k!=i) {
				int temp = list[i];
				list[i] = list[k];
				list[k] = temp;
			}
						
			System.out.println("List after " + (i+1) + " iterations is: ");
			for(int l=0; l<n; l++) {
				System.out.print(list[l] + "	");
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
