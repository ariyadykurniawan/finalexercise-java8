package finalexercise.ariyady;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author trainee
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	static String file = "kamus-jawa.txt";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		String input2;
		List<String> result;
		do{
			System.out.println("Dictionary Bahasa<->Jawa");
			System.out.println("1. Found Word");
			System.out.println("2. Add Word");
			System.out.print("Input Your Choice  : ");
			input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.print("Input a word : ");
				input = sc.nextLine();
				try {
					result = foundWord(input);
					result.stream().map(String::toUpperCase).forEach(System.out::println);;
				} catch (NullPointerException e) {
					// TODO: handle exception
					System.out.print("Data Not Found");
				}
				break;
			case "2":
				System.out.print("Input a javanise word: ");
				input = sc.nextLine();
				System.out.print("Meaning in Bahasa : ");
				input2 = sc.nextLine();
				addWord(input,input2);
				break;
			default:
				break;
			}
			System.out.println("Repeat Program [Y/N]? ");
			input = sc.nextLine();
		}while(input.equals("Y"));
		sc.close();
		
	}
	
	public static List<String> foundWord(String inputString) throws Exception {
		List<String> words = null;
		
		words = Files.lines(Paths.get(file))
				  .filter(w -> w.contains(inputString))
				  .collect(Collectors.toList());
		
	    return words;
	  }
	
	
	public static void addWord(String inputString, String inputString2){
		Charset characterSet = Charset.defaultCharset();
		
		Path path = Paths.get(file);
	    try (PrintWriter out =
	      new PrintWriter(Files.newBufferedWriter(path, characterSet, StandardOpenOption.APPEND))) {
	          out.printf("%n"+inputString+" : "+inputString2);
	    } catch (IOException ioe) {
	      System.err.printf("IOException: %s%n", ioe);
	    }
	}

}

