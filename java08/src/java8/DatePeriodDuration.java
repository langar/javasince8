package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatePeriodDuration {

	public static void main(String[] args) {
		// 1.
			//Le 25 Décembre 2018 a 13H37
			LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
			System.out.println("Date de référence : " + ldt);
			//Utilisation de l'objet ChronoUnit pour changer l'objet
			// on peut aussi l'appliquer sur LocalDate
			System.out.println("+1 semaine : " + ldt.plus(1, ChronoUnit.WEEKS));
			System.out.println("+2 mois : " + ldt.plus(2, ChronoUnit.MONTHS));
			System.out.println("+3 ans : " + ldt.plus(3, ChronoUnit.YEARS));
			System.out.println("+4 heures : " + ldt.plus(4, ChronoUnit.HOURS));
			System.out.println("-5 secondes : " + ldt.minus(5, ChronoUnit.SECONDS));
		
		// convert string to date
		String str = "01/01/2015";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateTime = LocalDate.parse(str, formatter); // string -> date
		System.out.println(dateTime.format(formatter)); // date -> string
		
		LocalDate local = LocalDate.now();
		System.out.println(">> " + local.format(formatter));
		LocalDate dtb = LocalDate.of(1971, 4, 24);
		System.out.println(">>>> " + dtb.format(formatter));
		
		// PERIOD
		int period = Period.between(dtb, local).getYears();
		System.out.println("PERIOD : " + period);
		
		LocalDate localDate = LocalDate.now(); localDate.plus(4, ChronoUnit.DAYS);
		System.out.println("LocalDate : " + localDate);
		LocalDateTime localDateTime = LocalDateTime.now(); // 2020-05-31
		System.out.println("localDateTime : " + localDateTime); // 2020-05-31T10:46:47.755
		
		
			
		dateTime = dateTime.parse("2007-12-03"); // string -> date
		System.out.println(dateTime.format(formatter)); // 03/12/2007
		
		LocalDate ld = LocalDate.of( 2018 , Month.DECEMBER , 25 ) ;
		LocalTime lt = LocalTime.MIN ;   // 00:00:00
		LocalDateTime localDT = LocalDateTime.of( ld , lt ) ;  // Xmas morning anywhere. 
		System.out.println(localDT);
		
		// DURATION
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		long duration = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("DURATION : " + duration);
	}

}
