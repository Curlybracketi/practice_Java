 // shapesTest.java
 // Test application that displays class shapes.
 import javax.swing.JFrame;
 import javax.swing.JOptionPane;

 public class ShapesTest
{
    public static void main( String[] args )
    {
        // obtain user's choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                        "Enter 2 to draw ovals" );

        int choice = Integer.parseInt( input ); // convert input to int

        // create the panel with the user's input
        Shapes Panel = new Shapes( choice );

        JFrame application = new JFrame(); // create a new JFrame

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel ); // add panel to the frame
        application.setSize( 300, 300 ); // set the desired size
        application.setVisible( true ); // show the frame
    } // end main
} // end class ShapesTest