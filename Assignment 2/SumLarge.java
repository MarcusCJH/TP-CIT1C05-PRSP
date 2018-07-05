/*
	Question 	: 3
	Purpose		: Write a program to create two arrays of integers of size 10. 
					  Then, the program should generate and insert random numbers between 1 and 50, inclusive, into both arrays.
					  Next, the program should compute the sum for each array and print the array that has the larger sum 
					  (i.e. if it is the first array, the program should print “First Array”, otherwise print “Second Array”). 
					  In the case of a tie, the program should print “Tie”. 
	Author		: Marcus Chan
	Date			: 23/07/2011 
	Last Check	: 14/08/2011
*/
public class SumLarge
{
	public static void main (String [] args)
	{	
		//Declare Array Variable
		int[] firstArray = new int [10];
		int[] secondArray = new int [10];
		
		// Call Methods
		generateRandomInput(firstArray);
		generateRandomInput(secondArray);
		
		// Transverse the First Array
		System.out.print("First Array: ");
		for (int i = 0; i <10; i++)
		{
			System.out.print(firstArray[i]+ " ");
		}
		System.out.println();
		
		// Transverse the Second Array
		System.out.print("Second Array: ");
		for (int i = 0; i <10; i++)
		{
			System.out.print(secondArray[i]+ " ");
		}
		System.out.println();

		// Call Method PrintResult
		printResult(sumArray(firstArray), sumArray(secondArray));		
	}
	
	// Function: To Generate Random Input into the array.
	public static void generateRandomInput(int [] randomNumber)
	{
		for(int i = 0; i < randomNumber.length;i++)
		{
			randomNumber[i] = (int)((Math.random()*50)+1);
		}
	}
	
	// Function: To sum up the numbers inside the array.
	public static int sumArray(int [] sum)
	{	
		int total = 0; // To store the number of each array to get a final sum
		for (int j = 0; j< sum.length; j++)
		{
			total+=sum[j];
		}
		return total;
	}
	
	// Function: To print the results out.
	public static void printResult(int firstArray,int secondArray)
	{
		
		// Decide whether which Array is larger
		if (firstArray > secondArray)
		{
			System.out.println("Larger is First Array. Sum of first Array: "+firstArray);
		}
		else if (firstArray < secondArray)
		{
			System.out.println("Larger is Second Array. Sum of second Array: "+secondArray);
		}
		else if (secondArray == firstArray)
		{
			System.out.println("Tie");
		}

	}
}