package done;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {
	public static void main(String[] args) {
		final List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		l.forEach(i -> System.out.println(i));
		l.forEach(System.out::println);

		l.stream().filter((i) -> {
			return i % 2 == 0;
		}).map((i) -> {
			return 10 * i;
		}).reduce((a, b) -> {
			return a + b;
		}).ifPresent(System.out::println);

	}

}
