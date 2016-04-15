package notDone;

public class Euler2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; fib(i) < 4000000; i++) {
			if (fib(i) % 2 == 0) {
				sum += fib(i);
			}
		}
		System.out.println(sum);
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}