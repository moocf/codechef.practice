import java.util.*;

class Main {
	
	static List add(List a, List b) {
		int c = 0;
		List res = new ArrayList();
		for(int ia=a.size()-1, ib=b.size()-1; ; ia--, ib--) {
			
		}
	}
	
	static String multiplyStr(String strVal, int val) {
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			long d = 1, n = in.nextLong();
			for(long j=2; j<=n; j++)
				d *= j;
			System.out.println(d);
		}
	}
}
