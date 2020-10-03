package java8;

import java.util.stream.Stream;

public class x4streamEterate {

	public static void main(String[] args) {
		
		Stream.iterate(0, n -> n + 1)
        .limit(10)
        .forEach(x -> System.out.println(x));

	}

}
