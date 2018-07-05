/*
	Question		: 1
	Purpose		: Making a program that helps people say the reason for where they are today
	Author		: Marcus Chan
	Date			: 11/06/2011
	Last Check	: 06/07/2011
*/
	
import java.util.Scanner;
public class ThankApp
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// read yourname
		System.out.println("Enter your name: ");
		String yourName = sc.nextLine();
		
		// read relationship
		System.out.println("Enter your Relationship to other person: ");
		String relationship = sc.nextLine();
		
		// read othername
		System.out.println("Enter other person name: ");
		String otherName = sc.nextLine();
		
		// read years
		System.out.println("Enter number of years known");
		int years = sc.nextInt();
		sc.nextLine();
		
		// print why are you here today.
		System.out.println("I, " + yourName + " am here today because of my " + relationship + ",");
		System.out.println( otherName + ". The reason I have made it so far is because of");
		System.out.println( otherName + ". I have known " + otherName + " for over " + years + " years");
		System.out.println("and during this time, " + otherName + " has been very supportive of me and");
		System.out.println("has always helped me in my time of need. I would like thank " + otherName);
		System.out.println("for all the help!"); 

		
	
	}
	
}
