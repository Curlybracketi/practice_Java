 // ArrayListCollection.java
 // Generic ArrayList<T> collection demonstration.
  import java.util.ArrayList;

 public class ArrayListCollection
 {
      public static void main( String[] args )
      {
          // create a new ArrayList of Strings with an initial capacity of 10
          ArrayList< String > items = new ArrayList< String >();

          items.add( "red" ); // append an item to the list
          items.add( 0, "yellow" ); // insert the value at index 0

          // header
          System.out.print(
                  "Display list contents with counter-controlled loop:");

          // display the color in the list
          for ( int i = 0; i < items.size(); i++ )
              System.out.printf( "%s", items.get( i ) );

          // display colors using foreach in the display method
          display( items,
                  "\nDisplay list contents with enhanced for statement:" );

          items.add( "green" ); // add green to the end of the list
          items.add( "yellow" ); // add yellow to the end of the list
          display(items, "List with two new elemnts:");

          items.remove( "yellow" ); // remove the first "yellow"
          display( items, "Remove second list element (green):" );

          items.remove( 1 ); // remove items at index 1
          display( items, "Remove second list element (green):" );

          // check if value is in the list
          System.out.printf( "\"red\" is %sin the list\n",
                  items.contains( "red" ) ? "" : "not " );

          // display number of element in the list
          System.out.printf( "size: %s\n", items.size() );
      } // end main

     // display the ArrayList's elements on the console
     public static void display( ArrayList< String > items, String header )
     {
         System.out.print( header ); //display header

         // display each element in items
         for (String item : items )
             System.out.printf( "%s", item );

         System.out.println(); // display end of line
      } // end method display
 } // end class ArrayListCollection