 // MyLine.java
 // myLime class represents a line
 import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
    private int x1; // x-coordinate of first endpoint
    private int y1; // y-coordinate of first endpoint
    private int x2; // x-coordinate of second endpoint
    private int y2; // y-coordinate of second endpoint
    private Color myColor; // color of this shape

    // constructor with input values
    public MyLine( int x1, int y1, int x2, int y2, Color color )
    {
        this.x1 = x1; // set x-coordinate of first endpoint
        this.y1 = y1; // set y coordinate of first endpoint
        this.x2 = x2; // set x-coordinate of second endpoint
        this.y2 = y2; // set y coordinate of second endpoint
        myColor = color; // set the color
    } // end MyLine constructor

    // Draw the line in the specified color
    public void draw( Graphics g )
    {
        g.setColor( myColor );
        g.drawLine( x1, y1, x2, y2 );
    } // end method draw
} // end class MyLine