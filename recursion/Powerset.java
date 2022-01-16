package recursion;

public class Powerset {

	public static void main(String[] args) {
		String str = "abc";
		powerSet(str, 0, "");
	}
	
	public static void powerSet(String s, int i, String cur) {
		if(i==s.length()) {
			System.out.println(cur);
			return;
		}
		powerSet(s, i+1, cur + s.charAt(i));
		powerSet(s, i+1, cur);
	}
	
}
