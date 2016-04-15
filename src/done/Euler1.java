package done;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Euler1 {
	public static void main(String[] args) {
		range(1000)
		.filter(i -> i % 3 == 0 || i % 5 == 0)
		.reduce((a, b) -> a + b)
		.ifPresent(System.out::println);
	}
	
	public static IntStream range(int max){
		IntStream.Builder t = IntStream.builder();
		for(int i = 0; i < max; i++){
			t.add(i);
		}
		return t.build();
	}

}
