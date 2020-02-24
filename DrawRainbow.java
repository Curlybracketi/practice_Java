 // DrawRainbow.java
 // demonstrates using colors in an array.
 import java.awt.Color;
 import java.awt.Graphics;
 import javax.swing.JPanel;

  public class DrawRainbow extends JPanel
   {
       // defien indigo and violet
        private final static Color VIOlET = new Color( 128, 0, 128 );
        private final static Color INDIGO = new Color( 75, 0, 130 );

        // colors to use in the rainbow, starting from thr innermost
        // the two white entries result in an empty arc in the center
    private Color[] colors =
                { Color.WHITE, VIOlET, INDIGO, Color.BLUE,
                        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    // constructor
      public DrawRainbow()
     {
       setBackground( Color.WHITE ); // set the background to white
     }  // end DrawRainbow constructor

     // draws a rainbow using cencentric arcs
     public void paintComponent( Graphics g )
     {
     super.paintComponent( g );

     int radius = 20; // radius of an arc

      // draw the rainbow near thr bottom center
      int centerX = getWidth() / 2;
      int centerY = getHeight() -10;

      // drawmfilled arcs starting with the outermost
      for ( int counter = colors.length; counter > 0; counter-- )
      {
       // set the color for the current arc
       g.setColor( colors[ counter - 1 ] );

       // fill the arc from 0 to 180 degrees
       g.fillArc( centerX - counter * radius,
               centerY - counter * radius,
               counter * radius * 2, counter * radius * 2, 0, 180 );
      } // end for
     } // end method paintComponent
   } // end class DrawRainbow