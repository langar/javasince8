package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class files {

	public static void main(String[] args) {
		
		String folder = "/Users/mac/Documents/all";
	    try {
	    	Stream<Path> paths = Files.list(Paths.get(folder));
	    	paths.filter(it -> it.toString()
	    		.endsWith(".docx"))
	           	.forEach(System.out::println);
	    		//.forEach(it -> System.out.println(it));  // même syntaxe
	    	paths.close();
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	    
	    lireLeContenuDeChaqueFichier(folder);

	}
	
	/**
	 * La méthode suivante permet de lire le contenu des fichiers de type "txt"
	 * @param folder
	 */
	private static void lireLeContenuDeChaqueFichier(String folder) {
		try {
	    	Stream<Path> paths = Files.list(Paths.get(folder));
	    	paths
	    		.filter(it -> it.toString()
	    		.endsWith(".txt"))
	           	.forEach(it-> {
	           		try {
						Stream<String> stream = Files.lines(it); //stream contain line's file
						stream.forEach(line-> System.out.println(line));
						stream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
	           	}
	           			);
	    		//.forEach(it -> System.out.println(it));  // même syntaxe
	    	paths.close();
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	}

}
