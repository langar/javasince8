package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class x3streamMaxExp {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("fadhel", "helali");
		// valeurs en majuscule
		List<String> collect = list.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	    
		System.out.println(collect);
		
		//##########
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
		// doubler les valeurs
		List<Integer> result = ints.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		// filtrer
		String str = list.stream()
				.filter(x -> x.startsWith("fa"))
				.findAny()
				.orElse("resultat null");
		System.out.println(str);
	}
}
