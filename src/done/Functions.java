package done;

import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		Function<Integer, Integer> f= new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		Function<Integer, Integer> g = mult(5);
		System.out.println(f.apply(5));
		System.out.println(f.apply(5));

	}
	public static Function<Integer, Integer> mult(int x){
		return new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * x;
			}
		};
	}

}
