import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		for(long i=0; i<t; i++) {
			long d = 0, n = in.nextLong();
			for(long j=5; j<=n; j*=5)
				d += n / j;
			System.out.println(d);
		}
	}
}
