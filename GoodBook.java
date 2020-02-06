// GradeBook.java
// GradeBook class with a constructor to initialize the course name.

 public class GradeBook
 {
     private String courseName; // course name for this GradeBook

  // Constructor initializes courseName with String argument
  public GradeBook( String name ) // constructor name is class name
  {
    courseName = name; // initializes courseName
  } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
    courseName =name; // store the course name
   } // end method setCourseName

   // method to retrive the course name
    public String getCourseName()
   {
      return CourseName;
   } // end method getCourseName

   // display a welcome message  to the GradeBook user
  public void displayMessage()
  {
    // this statement calls getcourseName to get the
    // name of the course this Gradebook represents
    System.out.printf( "Welcome to the grade book for\n%s!\n",
            getCourse() );
  } // end method displayMesssage
 } // end class GradeBook