 // GradebookTest.java
 // GradeBookTest creates a GradeBook object using a two-dimensional array
 // of grades, then invokes method processGrades to analyze them.
  public class GradebookTest
  {
      // main method begins program execution
      public static void main( String[] args )
      {
          // two-dimensional array of student grades
          int[][] gradesArray ={ { 87, 68, 94 },
                  { 100, 83, 78 },
                  { 85, 91, 76 },
                  { 87, 70, 67 },
                  { 78, 98, 70 } ,
                  { 67, 100, 89 },
                  { 65, 64, 82 },
                  { 76, 73, 91 },
                  { 84, 83, 88 },
                  { 60, 84, 93 },
                  { 93, 99, 90 } };

          Gradebook myGradebook = new Gradebook (
          "CS101 Introduction to  Java Programming", gradesArray );
            myGradebook.displayMessage();
           myGradebook.processGrades();
      } // end main
  } // end class GradebookTest