/*
	Question 	: 4
	Purpose		: Making a program to compute the grade for students taking a programming subject in a school.
	Author		: Marcus Chan
	Date			: 12/06/2011
	Last Check	: 25/06/2011
*/

public class GradeApp
{
	public static void main(String[] args)
	{
		// declare variable
		int termTest = 0;		
		int assignment = 0;
		int attendance = 0;
		
		// generate a random number between 1 and 100 inclusive
		termTest = (int)((Math.random()*100) + 1);
		// genreate a random number between 1 and 100 inclusive
		assignment = (int)((Math.random()*100) + 1);
		// generate a random percentage between 1 and 100 percent inclusive
		attendance = (int)((Math.random()*100) + 1);
		
		// print Student scores and attendence
		System.out.println("Student term test score is: " + termTest);
		System.out.println("Student assignment score is: " + assignment);
		System.out.println("Student Attendance is: " + attendance + "%");
		
		// Decides overall and print overall grade result
		if (termTest >= 80 && termTest <= 100 && assignment >= 80 && assignment <= 100 && attendance >= 85)
		{
			System.out.println("Student grade is an A");
		}
		else if (termTest >= 60 && termTest <=70 && assignment >= 60 && assignment <= 65 && attendance >= 85)
		{
			System.out.println("Student grade is an C");
		}
		else if (termTest <= 40 && assignment == 0 && attendance >= 85 || termTest <= 20 && assignment <= 30 && attendance >= 85)
		{
			System.out.println("Student grade is an F");
		}
		else
		{
			System.out.println("Student grade cannot be determine");
		}
	}
}