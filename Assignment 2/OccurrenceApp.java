/*
	Question 	: 2
	Purpose		: Write a program that display 10 random array numbers. Then create create another random integer.
					  Then find the first and last occurrence of value which is the same with the array.
					  If first and last occurrence cannot be found, print "1"
	Author		: Marcus Chan
	Date			: 14/07/2011 
	Last Check	: 22/07/2011
*/
public class OccurrenceApp
{
	public static void main( String [] args)
	{
		// Declare array size of 10 and listing
		int array [] = new int [10];
		
		
		// declare variable
		int value 	= 0;	// Random value
		boolean found = false;

		
		// looping 10 different integer
		System.out.print("Array: \t");
		for (int i = 0; i <10; i++)
		{
			array[i] = (int)((Math.random()*25)+1);
			System.out.print(array[i]+"\t");
		}
		System.out.print("\n");
				
		// Random integer generator
		value = (int)((Math.random()*25)+1);
		System.out.println("Value: \t" +value);
		
		// Checking for first occurrence that compiles with value
		for(int i = 0; i < array.length; i++)
		{
			if(array[i]==value)
			{
				System.out.println("First Occurrence: " + i);
				found = true;
				break;
			}
		}
		
		// Checking for last occurrence that compiles with value
		for(int i = array.length-1; i>=0;i--)
		{
			if(array[i] == value)
			{
				System.out.println("Last Occurrence: " + i);
				break;
			}
		}
		
		// If value is not found
		if (!found)
		{
			System.out.println("First Occurrence:-1");
			System.out.println("Last Occurrence: -1");
		}
	}
}