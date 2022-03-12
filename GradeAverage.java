package hello;

import java.util.Scanner;


	public class GradeAverage {
	    int[] grades;
	    
	    public Scanner in;
	    
	    
	    public static void main(String[] args)
	    {
	        GradeAverage aGradeAverage = new GradeAverage();
	        aGradeAverage.in = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = aGradeAverage.in.nextInt();
	                
	        aGradeAverage.run(numStudents);
	    }
	        
	    
	    public void run(int numStudents)
	    {
	        if (numStudents <= 0) {
	            System.out.println("Invalid number of students.");
	            return;
	        }        
	        grades = new int[numStudents];
	        
	        double sum = 0;
	        int    i   = 0;
	        while (i < numStudents)
	        {
	            System.out.printf("Enter the grade for student %1$d: ", (i+1));
	            int grade = in.nextInt();
	            
	           
	            if ((grade >=0) && (grade <= 100)) {
	                grades[i] = grade;
	                sum      += grade;
	                i++;
	                continue;
	            }
	            System.out.println("Invalid grade, try again...");
	        }
	        System.out.printf("The average is %1$.2f\n", (sum / numStudents));
	    }
	    
}
