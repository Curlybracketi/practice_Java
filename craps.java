 // Craps.java
 // Craps class simulates the dice game craps.
  import java.util.Random;

 public class craps
 {
   // create random number generator for use in method rollDice
     private static final Random randomNumbers = new Random();

     // enumeration with constants that represent the game status
     private enum status  { CONTINUE, WON, LOST };

     // constants that represent common rolls of the dice
     private static final int SNAKE_EYES = 2;
     private static final int TREY = 3;
     private static final int SEVEN = 7;
     private static final int YO_LEVEN = 11;
     private static final int BOX_CARS =12;

     // plays one game of carps
     public static void main( String[] args )
     {
       int myPoint = 0; // point if no win or loss on first roll
       status gameStatus; // can contain CONTINUE, WON or LOST

       int sumOfDice = rollDice(); // first roll of the dice

       // detremine game status and point based on first roll
       switch ( sumOfDice )
       {
         case SEVEN: // win with 7 on first roll
         case YO_LEVEN: // win with 11 on first roll
           gameStatus = status.WON;
           break;
         case SNAKE_EYES:  // lose with 2 on first roll
         case TREY: // lose eith 3 on first roll
         case BOX_CARS: // lose with 12 on the first roll
           gameStatus = status.LOST;
           break;
         default: // did not or lose so remember point
           gameStatus = status.CONTINUE; // game is not over
           myPoint = sumOfDice; // remember the point
           System.out.printf( "Point is %d\n", myPoint );
           break; // optional at the end of switch
       } // end switch

       // while game is not complete
       while ( gameStatus == status.CONTINUE ) // not WON or LOST
       {
         sumOfDice = rollDice(); // roll dice again

        // determine game status
        if ( sumOfDice == myPoint ) // win by making point
          gameStatus = status.WON;
            else
              if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
                gameStatus = status.LOST;
       } // end while

       // display won or lose message
       if ( gameStatus == status.WON )
         System.out.println( "Player Wins" );
       else
         System.out.println( "Player loses" );
     } // end main

   // roll dice, calculate sum and display results
   public static int rollDice()
   {
     // pick random die values
     int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
     int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll

     int sum = die1 + die2; // sum of die values

     // display results of this roll
     System.out.printf( " Player rolled %d + %d = %d\n",
             die1, die2, sum );

     return sum; // return sum of dice
   } // end method rollDice
 } // end class Craps
