 // DrawPanelTest.java
 //application to diplay a drawpanel.
 import javax.swing.JFrame;

public class DrawPanelTest
{
 public static void main( String[] args )
 {
  // create a panel that contains our drawing
  DrawPanel panel = new DrawPanel();

  // create a new frame to hold the panel
  JFrame application = new JFrame();

  // set the frame to exit when it is closed
  application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

  application.add( panel ); // add the panel to the frame
  application.setSizes( 250,250 ); // set the size of the frame
  application.setVisible( true ); // make the frame visile
 } // end main
} // end class DrawPanelTest