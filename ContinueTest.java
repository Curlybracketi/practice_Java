 // ContinueTest.java
 // continue statement terminating an iteration of a for statement.
 public class ContinueTest
{
    public static void main( String[] args )
    {
        for ( int count =1; count <= 10; count++ ) // loop 10 times
        {
            if ( count == 5 ) // if count is 5,
                continue; // skip remaining code in loop

            System.out.printf( "%d ", count );
        } // end for

        System.out.println( "\nUsed continue to skip printing 5" );
    } // end main
} // end class ContinueTest
