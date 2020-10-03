package java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        // convertir la Map en List : myCollection.stream().collect(Collectors.toList());
        List<String> values = map.values().stream().collect(Collectors.toList());
        
        // afficher la liste des elts
        values.forEach(System.out::println);
        
        System.out.println(">>> get first elt from the list : " + values.get(0));
        
        // le parcourir autrement
        values.forEach(it -> System.out.println(it));
        
        // on peut faire la même chose avec les keys
        // List<Integer> keys = map.keySet().stream().collect(Collectors.toList());
        
        System.out.println("### : exclure des éléments");
        List<String> appleOut = map.values().stream()
        		.sorted()
        		.filter(x -> !("apple".equalsIgnoreCase(x) || "banana".equalsIgnoreCase(x)))
        		.collect(Collectors.toList());
        
        appleOut.forEach(System.out::println);
        
        System.out.println(">>> convert map to list, then print the result..");
        map.values().stream()
        	.sorted()	// trier la liste
    		.collect(Collectors.toList())
    		.forEach(System.out::println);;

	}

}
