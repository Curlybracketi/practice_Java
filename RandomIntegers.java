 // RandomIntegers.java
 // shifted and scaled rondom integers.
 import java.util.Random; // program uses class random

 public class RandomIntegers
 {
     public static void main( String[] args )
     {
         Random randomNumbers = new Random(); // random number generator
         int face; //stores each random integer generated

         // loop 20 times
         for ( int counter = 1 ; counter <= 20; counter++ )
         {
             // pick random integer from 1 to 6
             face = 1 + randomNumbers.nextInt( 6 );

             System.out.printf( "%d ", face ); // display generated value

             // if counter is divisble by 5, start a new line of output
             if ( counter % 5 == 0 )
                 System.out.println();
         } // end for
     } // end main
 } // end class RandomIntegers