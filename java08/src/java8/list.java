package java8;

import java.util.Arrays;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		// Lambda
		List<String> list = Arrays.asList("java", ".net", "php", "vb");
		//list.forEach(str -> System.out.println(str));	// lambda expressions
		//list.forEach(System.out :: println);	// method reference
		
		list.forEach(str -> 
			{
				switch(str) {
					case "java" : System.out.println(">> Le meilleur des langages est JAVA."); break;
					case ".net" : System.out.println(">> .net est un langage bien utilisé."); break;
					case "php" : System.out.println(">> PHP est un langage open source."); break;
					case "vb" : System.out.println(">> VB est has been."); break;
					default : System.out.println(">> Niveau indéterminé.."); break;
				}
			}
		);
		
//		list.forEach(System.out::println);
		
	}

}
