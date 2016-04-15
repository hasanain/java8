package done;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Euler2 {

	static class Fibs implements IntSupplier {
		int a, b;

		public Fibs() {
			this.a = 0;
			this.b = 1;
		}

		@Override
		public int getAsInt() {
			int temp = a;
			a = b;
			b += temp;
			return temp;
		}

	}

	public static void main(String[] args) {
		
		IntStream.generate(new Fibs())
		// Java 9 adds a takeWhile
		.limit(35)
		.filter(i -> i < 4000000)
		.filter(i -> i % 2 == 0)
		.reduce((a, b) -> a + b)
		.ifPresent(System.out::println);
	}

}
