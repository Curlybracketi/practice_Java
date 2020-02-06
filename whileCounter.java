 // whileCounter.java
 // Counter-controlled repetition with the while repetition statement.

  public class whileCounter
  {
    public static void main( String[] args )
    {
      int counter = 1; // declare and initialize control variable

      while ( counter <=10 ) // loop-continuation condition
      {
        System.out.printf( "%d ", counter );
        ++counter; // increment control variable by 1
      }// end while

      System.out.println(); // output a newline
    } // end main
  } // end class whileCounter