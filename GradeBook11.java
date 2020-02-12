 // GradeBookTest.java
  // create GradeBookTest.java, input grade and display grade report.

 public class GradeBookTest
 {
     public static void main(String[] args )
     {
         // create GradeBook object myGradeBook and
         // pass course name to constructor
         GradeBook myGradeBook = new GradeBook(
                 "cs101 Introduction to java programming" );

         myGradeBook.displayMessage(); // display welcome message
         myGradeBook.inputGrades(); // read grades from user
         myGradeBook.displayGradeReport(); // display report based on grades
     } // end main
 } // end class GradeBookTest