 // InitArray.java
 // Initializing an array using command-line arguments.

  public class InitArray
  {
      public static void main( String[] args )
      {
          // check number of command-line arguments
          if ( args.length != 3 )
              System.out.println(
                      "Error: Please re-enter the entire command, including\n" +
                              "an array size, initial and increment." );
          else
              {
              // get array size from first command-linne argument
              int arraylength = Integer.parseInt( args[ 0 ] );
              int[] array = new int[ arraylength ]; // create array

              // get initial value and increment from command-line arguments
              int initialValue = Integer.parseInt( args[ 1 ] );
              int increment = Integer.parseInt( args[ 2 ] );

              // calculate value for each array element
              for ( int counter = 0; counter < array.length; counter++ )
              array[ counter ] = initialValue + increment * counter;

              System.out.printf( "%s%8s\n", "Index", "Value" );

              // display array index and value
              for ( int counter = 0; counter < array.length; counter++ )
              System.out.printf( "%5d%8d\n", counter, array[ counter ] );
          } // end else
      } // end main
  } // end class InitArray