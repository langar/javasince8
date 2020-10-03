package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java8.bean.User;

public class StreamSortFilter {

	public static void main(String[] args) {
		
		User user = new User(0, "HELALI", "Myriam", 5);
		User user1 = new User(1, "COTTON", "Joe", 24);
		User user2 = new User(2, "HIM", "Yann", 32);
		User user3 = new User(3, "SELLIMI", "Adel", 16);
		User user4 = new User(4, "MARADONA", "Diego", 57);
		
		List<User> users = Arrays.asList(user, user1, user2, user3, user4);
		
		users.stream()
			//.filter(it -> it.getAge() > 20)
			//.filter(it -> it.getNom().startsWith("S"))
			.sorted((x,y) -> x.getAge() - y.getAge())
			.forEach(it -> System.out.println(it.getNom() + " - " + it.getAge()));
		
		System.out.println("########### avant tri..");
		//users.stream().forEach(System.out::println);
		users.stream().forEach(x -> System.out.println(x.getNom() + " - " + x.getAge()));
		//Collections.sort(users, (x,y) -> x.getNom().compareTo(y.getNom())); // tri par nom
		Collections.sort(users, (x,y) -> x.getAge() - y.getAge()); // tri par age
		System.out.println("########### après tri..");
		//users.stream().forEach(x -> System.out.println(x.getNom() + " - " + x.getAge()));
		users.stream().forEach(System.out::println);

	}

}
