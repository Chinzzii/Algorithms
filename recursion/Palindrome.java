package recursion;

public class Palindrome {

	public static void main(String[] args) {
		String s = "racecar";
		int len = s.length()-1;
		System.out.println(isPal(s,0,len));
	}
	
	public static boolean isPal(String s, int l, int r) {
		if(l>=r) {
			return true;
		}
		if(s.charAt(l)!=s.charAt(r)) {
			return false;
		}
		return isPal(s, l+1, r-1);
	}
	
}
