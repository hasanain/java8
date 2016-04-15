package done;

import java.util.ArrayList;
import java.util.Iterator;

public class Euler2Iter {
	static class Fibs implements Iterator<Integer> {
		
		int a, b;
		int lim;
		
		private Fibs(int lim) {
			this.lim = lim;
			this.a = 0;
			this.b = 1;
		}

		@Override
		public boolean hasNext() {
			return a <= lim;
		}

		@Override
		public Integer next() {
			int temp = a;
			a = b;
			b += temp;
			return temp;
		}
		public static Iterator<Integer> getGenerator(int lim){
			return new Fibs(lim);
		}


	}
	public static ArrayList<Integer> list(Iterator<Integer> it){
		ArrayList<Integer> l = new ArrayList<>();
		it.forEachRemaining(l::add);
		return l;
	}
	public static void main(String[] args) {
		
		list(Fibs.getGenerator(400000))
		.stream()
		.filter(i -> i % 2 == 0)
		.reduce((a, b) -> a + b)
		.ifPresent(System.out::println);
	}

}
