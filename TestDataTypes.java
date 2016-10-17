/**
	This class introduces some basic
	data types and operators
*/
public class TestDataTypes{

	public static void main(String[] args){
	
		//example for a double from arithmatic operations
		double x =  3.0 - 6 * 2;
		
		//example char from octal code
		char c = (char) 0132;
		
		//example string
		String word = "some Word!";
		
		//another example of string
		String anotherWord = "Hi";
		anotherWord = "cat";
		
		//another way to instantiate string
		String word2 = new String("cat");
		
		//logical/comparison operators
		/*
			> --> greater than
			< --> lesser than
			>= --> greater than or equal to
			<= --> lesser than or equal to
			== --> is equal?
			!= --> not equal
			
			&& --> AND
			|| --> OR
			
			! --> not
			
		*/
		
		//operators
		/*
			+ --> addition
			- --> substruction
			/ --> division
			* --> mutlplication
			% --> modulus - Remainder
			= --> assignment
			
		*/
		
		//example with mod
		int r = 10 % 3;
		
		//example conditional expression
		boolean flag = x > 5 && r != 0;
		
		//concatenate types to output statements
		System.out.println("r " + r);
		System.out.println("x " + x);
		System.out.println("flag " + flag);
		
	}

}