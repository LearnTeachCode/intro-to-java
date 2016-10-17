/*
	This class introduces a while loop
*/
public class TestLoops{

	public static void main(String[] args){
		
		/*	
			while(conditional statement){
				//do stuff
			}
		*/
		
		//we can print out numbers like this
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//or we can use a loop to print out the numbers
		int start = 1;
		int end = 100;
		boolean flag = true;
		
		//this is a while loop
		while(!flag || start <= end){
			System.out.println(start); //this prints out the number	
			start = start + 1; //this is the same as start++;
			
			//condition that makes the flag false
			//so that it only prints up to 50
			if(start == 50){
				flag = false;
			}
			
		}//end of while loop
		
		System.out.println("Done!");
		
	}//end of main
	
}//end of class