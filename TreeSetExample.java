package Lab4;
import java.util.Scanner;
import java.util.TreeSet;


public class TreeSetExample {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a list of strings: ");

	        String input = scanner.nextLine();


	        // TODO: Split the input into strings and store them in a TreeSet

	        // TODO: Print the elements in alphabetical order
	        
	        TreeSet<String> treeSet = new TreeSet<>();
	        String[] words = input.split("\\s+");
	        for (String word : words) {
	            treeSet.add(word);
	        }

	        // Print the elements in alphabetical order
	        System.out.println("Strings in alphabetical order:");
	        for (String word : treeSet) {
	            System.out.println(word);
	        }

	        scanner.close();

	    }

}


