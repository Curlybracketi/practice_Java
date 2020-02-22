 // Gradebook.java
 // Gradebook class using a two-dimensional array to store test grades.

 public class Gradebook
         {
             private String courseName; // name of course this GradeBook represents
             private int[] grades; // array of student grades

         // two-argument contructor initializes courseName and grades array
         public Gradebook( String name, int[] gradesArray )
         {
             courseName = name; // initialize courseName
         grades = gradesArray; // store grades
         } // end two-argument GradeBook constructor

         // method to set the course name
         public void setCourseName( String name )
         {
             courseName = name; // store the course name
         } // end method setCourseName

         // method to retrieve the course name
         public String getCourseName()
         {
             return courseName;
         } // end method getCourseName

         // display a welcome message to the Gradebook user
         public void displayMessage()
         {
             // getCourseName gets the name of the course
         System.out.printf( "Welcome to the grade book for\n%s!\n\n",
         getCourseName() );
         } // end method displayMessage

         // perform various operations on the data
         public void processGrades()
         {
         // output grades array
         outputGrades();

         // call methods getAverage to calculate the average grade
         System.out.printf("\nClass average is %.2f\n", getAverage());

         // call methods getMinimum and getMaximum
         System.out.printf("Lowest grade is %d \nHighest grade is %d\n\n",
         getMinimum(),getMaximum());

         // call outputBarchart to print grade distribution chart
         outputBarChart();
         } // end method processGrades

         // fine minimum grade
         public int getMinimum()
         {
             int lowGrade = grades[ 0 ]; // assume grades[ 0 ] is smallest

         // loop through gardes array
          for ( int grade : grades )
         {
             // if grade lower than lowGrade, assign it to lowGrade
         if ( grade < lowGrade )
             lowGrade = grade; // new lowest garde
         } // end for

         return lowGrade; // return lowest grade
         } // end method getMinimum

         // find maximum grade
         public int getMaximum()
         {
             int highGrade = grades[ 0 ]; // assume grades[ 0 ] is largest

         // loop through grades array
         for ( int grade : grades )
         {
             // if grade greater than highGrade, assign it to highGrade
         if ( grade > highGrade )
             highGrade = grade; // new highest grade
         } // end for

         return highGrade; // return highest grade
         } // get maximum

         // determine average grade for test
         public double getAverage()
         {
             int total = 0; // initialize total

         // sum grades for one student
         for ( int grade : grades )
             total += grade;

         // return average of grades
         return (double) total / grades.length;
         } // end method getAverage

         // output bar chart displaying grade distribution
         public void outputBarChart()
         {
             System.out.println( "Grade distribution:" );

             // stores frequency of grades in each range of 10 grades
         int[] frequency = new int[ 11 ];

         // for each grade, increment the appropriate frequency
         for ( int grade : grades )
             ++frequency[ grade / 10 ];

         /// for each frequency, print bar in chart
         for ( int count = 0; count < frequency.length; count++ )
         {
             // output bar label ( "00-09: ", ..., "90-99: ", "100: ")
         if ( count == 10 )
             System.out.printf( "%5d: ", 100 );
         else
             System.out.printf( "%02d-%02d: ",
         count * 10, count * 10 + 9 );

         // print bar of asterisks
         for ( int stars = 0; stars < frequency[ count ]; stars++ )
             System.out.print( "*" );

         System.out.println(); // starts a new line of output
         } // end outer for
         } // enf method outputBarChart

         // output the contents of the grades array
         public void outputGrades()
         {
          System.out.println( "The grades are:\n" );

          // output each student's grade
         for ( int  student = 0; student < grades.length; student++ )
             System.out.printf( "Student %2d: %3d\n",
         student + 1, grades[ student ] );
         } // end method outputGrades
         } // end class GradesBook