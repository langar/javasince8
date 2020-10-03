package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.bean.User;

public class SortList {

	public static void main(String[] args) {
		
		User user0 = new User(0, "HELALI", "Myriam", 5);
		User user1 = new User(1, "COTTON", "Joe", 24);
		User user2 = new User(2, "HELALI", "Imed", 50);
		User user3 = new User(3, "SELLIMI", "Adel", 50);
		User user4 = new User(4, "MARADONA", "Diego", 57);
		User user5 = new User(5, "HELALI", "Adel", 51);
		User user6 = new User(6, "SELLIMI", "Samir", 56);
		User user7 = new User(7, "HELALI", "Myriam", 7);
		User user8 = new User(8, "NAJJAR", "Mickael", 32);
		
		List<User> users = Arrays.asList(user0, user1, user2, user3, user4, user5, user6, user7, user8);
		
		System.out.println("#### Tri par nom :");
		users.stream()
			.sorted(Comparator.comparing(x -> x.getNom()))
			.forEach(x -> System.out.println(
					x.getNom().concat(" ")
					.concat(x.getPrenom()).concat(" ")
					.concat(String.valueOf(x.getAge()))));
		
		System.out.println("\n#### Tri par age :");
		users.stream()
			.sorted(Comparator.comparing(x -> x.getAge()))
			.forEach(x -> System.out.println(
				x.getNom().concat(" ")
				.concat(x.getPrenom()).concat(" ")
				.concat(String.valueOf(x.getAge()))));
		
		System.out.println("\n#### trier par nom, prenom et âge");
		users.sort(Comparator.comparing(User::getNom)
			.thenComparing(User::getPrenom)
			.thenComparing(User::getAge));
		
		// juste pour affichage
		users
			.stream()
			//.sorted((x,y) -> Integer.compare(x.getAge(), y.getAge()))
			.forEach(x -> System.out.println(
				x.getNom().concat(" ")
				.concat(x.getPrenom()).concat(" ")
				.concat(String.valueOf(x.getAge()))));
		
		
		
		// trier une liste dans l'ordre décroissant
		System.out.println("Tri décroissant d'une liste d'entiers");
		List<Integer> list = Arrays.asList(8,2,3,5,9,4,7,6);
		list.stream()
			.filter(x -> x >= 2)
			.sorted(Collections.reverseOrder())
			.forEach(System.out::println);

	}

}
