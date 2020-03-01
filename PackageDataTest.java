 // PackageDataTest.java
 // Package-access members of a class are accessible by other classes
 // in the same package.

 public class PackageDataTest
 {
     public static void main( String[] args )
     {
         packageData packageData = new packageData();

         // output String representation of packageData
         System.out.printf("After instantiation:\n%s\n", packageData);

         // change package access data in packageData object
         packageData.number = 77;
         packageData.string = "Goodbye";

         // output String representation of packageData
         System.out.printf("\nAfter changing values:\n%s\n", packageData);
     } // end main
 } // end class PackageDataTest

 // class with package Access instance variable
 class packageData
 {
     int number; // package-access instance variable
     String string; // package-access instance variable

     // constructor
     public packageData()
     {
         number = 0;
         string = "Hello";
     } // end PackageData constructor

     // return PackageData object String representation
     public String toString()
     {
         return String.format( "number: %d; String: %s", number, string );
     } // end method toSting
 } // end class PackageData