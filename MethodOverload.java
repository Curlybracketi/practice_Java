   // MethodOverload.java
   // Overloaded method declaration.

   public class MethodOverload
   {
       // test Overloaded square methods
       public static void main( String[] args )
           {
               System.out.printf( "Square of integer & is %d\n", square( 7 ) );
               System.out.printf( "Square of double 7.5 is %d\n", square(7.5 ) );
           } // end main

           // square method with int argument
           public static int square( int intValue )
           {
           System.out.printf("\nCalled square with int argument: %d\n",
           intValue);
           return intValue*intValue;
           } // end method square with int argument

           // square method with double argument
           public static double square( double doubleValue )
           {
               System.out.printf( "\nCalled square with double argument: %f\n",
           doubleValue );
               return doubleValue * doubleValue;
           } // end method square with double argument
   } // end class MethodOverload