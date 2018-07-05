/*
	Question 	: 1b
	Purpose		: Write a program to first generate one random number between 1 and 100, inclusive. 
					  Then, the program should generate a second random number between 1 and 10, inclusive. 
					  Next, using a while loop, the program should print the first number 'X' of times. 
					  'X' here will be based on the second number generated. (e.g. if the first number is 50 and the second number is 5, 
					  then the program should print 50 five times).	
	Author		: Marcus Chan
	Date			: 13/07/2011 
	Last Check	: 13/07/2011
*/

public class NumCountApp
{
	public static void main(String [] args)
	{
		// declaring variable
		int firstNum 	= 0; // First random number input from 1 to 100 inclusive
		int secondNum 	= 0; // Second random number input from 1 to 10 inclusive
		int count 		= 0; // Counter to count the numbers
		
		// Random Generator for First Number 1 to 100 inclusive
		firstNum = (int)((Math.random()*100)+1);
		System.out.println("The number should be display out is: " + firstNum);
		
		// Random number generator for second number 1 to 10 inclusive
		secondNum = (int)((Math.random()*10)+1);
		System.out.println("The number of time to display out is: " +secondNum);
		
		// To print secondNum number of firstNum
		while (count < secondNum)
		{	
			System.out.print(firstNum + " ");
			count++;
		}	
	}
}