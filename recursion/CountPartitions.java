package recursion;

public class CountPartitions {

	public static void main(String[] args) {
		System.out.println(countPart(5,5));
	}
	
	public static int countPart(int n, int m) {
		int count=0;
		if(n==0) {
			return 1;
		}
		if(m==0 || n<0) {
			return 0;
		}
		return countPart(n-m, m) + countPart(n, m-1);
	}
}
