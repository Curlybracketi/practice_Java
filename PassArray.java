 // PassArray.java
 // passing arrays and individual array elements to methods.

 public class PassArray
 {
     // main creates array and calls modifyingArray and modifyingElement
     public static void main( String[] args )
     {
         int[] array = { 1, 2, 3, 4, 5 };

         System.out.println(
                 "Effects of passing reference to entire array:\n" +
                         "The value of the original array:" );

         // output original array elements
         for ( int value : array )
             System.out.printf( "   %d", value );

         modifyingArray( array ); // pass array reference
         System.out.println( "\n\nThe value of the modified array are:" );

         // output modified array elements
         for ( int value : array )
             System.out.printf( "  %d", value );

         System.out.printf(
                 "\n\nEffect of passing array elemnet value:\n" +
                         "array[3] before modifyElement: %d\n", array[ 3 ] );

         modifyElement( array[ 3 ] ); // attempt to modify array[ 3 ]
         System.out.printf(
                 "array[3] after modifyElement: %d\n", array[ 3 ] );
     } // end main

         // multiply each element of an array by 2
     public static void  modifyingArray( int[] array2 )
     {
         for ( int counter = 0; counter < array2.length; counter++ )
             array2[ counter ] *= 2;
     } // end modifyingArray

     // multiply argument by 2
     public static void modifyElement( int element )
     {
         element *= 2;
         System.out.printf(
                 "value of element in modifyingElement: %d\n", element );
     } // end method modifyElement
 } // end class PassArray