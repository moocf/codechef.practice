import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float amt = in.nextFloat();
		float balance = in.nextFloat();
		if(amt > 0 && amt % 5 == 0 && amt+0.50f < balance)
			balance -= amt + 0.50f;
		System.out.printf("%.2f", balance);
	}
}
