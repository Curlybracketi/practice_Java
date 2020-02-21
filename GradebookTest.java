 // GradebookTest.java
 // GradeBookTest creates a GradeBook object using an array of grades,
 // then invokes method processGrades to analyze them.
  public class GradebookTest
  {
      // main method begins program execution
      public static void main( String[] args )
      {
          //array of student grades
          int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

          Gradebook myGradebook = new Gradebook (
          "CS101 Introduction to  Java Programming", gradesArray );
            myGradebook.displayMessage();
           myGradebook.processGrades();
      } // end main
  } // end class GradebookTest