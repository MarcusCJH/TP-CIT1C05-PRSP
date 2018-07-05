/*
	Question 	: 1a
	Purpose		: Write a program, using a for loop, to generate 20 random numbers between 30 and 50, inclusive. 
					  Then, the program should display how many of those numbers are larger than or equal 40 and how many are smaller than 40. 
	Author		: Marcus Chan
	Date			: 12/07/2011 
	Last Check	: 12/07/2011
*/

public class ForIntApp
{
	public static void main(String [] args)
	{
		// declare array
		int [] rNum = new int[20];
		
		// declare variable
		int count1 = 0; //Store number which is >= 40
		int count2 = 0; //Store number which is < 40
		
		// Generating 20 random number from numbers 20 to 50 inclusively 
		for (int i = 0; i < rNum.length; i++)
		{
			rNum[i] = (int)((Math.random()*30)+21);
			System.out.print(rNum[i] + " ");
		}
		System.out.println();
		
		
		// Counting the number of numbers which is more than or equal to 40
		for (int i = 0; i <rNum.length;i++)
		{
			if (rNum[i] >=40)
			{
				count1++;
			}
		}
		
		// count the number of numbers which less than 40
		for (int i = 0; i <rNum.length; i++)
		{
			if (rNum[i] <40)
			{
				count2++;
			}
		}
		
		// print the outputs
		System.out.println("The total number(s) which are more than or equal to forty is : "+ count1);
		System.out.println("The total number(s) which are less than forty is : "+ count2);
	}
}