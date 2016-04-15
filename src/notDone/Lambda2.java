package notDone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for(int i: l){
			System.out.println(i);
		}
		
		List<Integer> ll = new ArrayList<>(l);
		for(int i = 0; i < ll.size(); i++){
			if(ll.get(i) % 2 != 0){
				ll.remove(i);
			}
		}
		for(int i = 0; i < ll.size(); i++){
			ll.set(i, ll.get(i) * 10);
		}
		int sum = 0;
		for(int i = 0; i < ll.size(); i++){
			sum += ll.get(i);
		}
		System.out.println(sum);
		

	}

}
