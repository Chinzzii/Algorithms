package recursion;

public class Permutations {

	public static void main(String[] args) {
			String str = "abc";
			int len = str.length()-1;
			permute(str, 0, len);
	}
	
	public static void permute(String s, int l, int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=l; i<=r; i++) {
			s=swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);
		}
	}	
	
	public static String swap(String s, int a, int b) {
		
		char ch[] = s.toCharArray();
		char temp = ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
		s=String.valueOf(ch);
		
		return s;
	}
	
}
