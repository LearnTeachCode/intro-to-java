import java.util.Scanner; //import to use Scanner

/*
	This class takes in user input
	and simple prints out ther user input
*/
public class TestInput{


	public static void main(String[] args){
		
		//set up Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//Ask the user for an input
		System.out.println("Enter in a whole number: ");
		
		//assign user input to a variable
		int num1 = input.nextInt();
		
		System.out.println("Now enter a decimal number: ");
		double num2 = input.nextDouble();
		
		System.out.println("Enter a word: " );
		String word1 = input.next(); // "3.5"
		
		//parse the double out of word1 example
		double parsedNum2 = Double.parseDouble(word1);
		//int parsedNum1 = Integer.parseInt(word1); //example on parsing an integer
		
		//print out the user input
		System.out.println("You chose the number " + num1);
		System.out.println("You chose the decimal number" + num2);
		System.out.println("You chose the word " + word1);
		System.out.println("Parsed double " + parsedNum2);
		
	}
	
	
}