/*
* CMPU-101 Spring 2016
* Assignment 1
* Due: Monday, Feb. 8th
* Kelly
*
* File: Rainbow.java
* -------------------------
* This program creates a six color rainbow on a cyan rectangle.
*
* The colors are as follows:
* background (sky):
 * cyan
* stripes from bottom to top:
* magenta, blue, green, yellow, orange, and red
*/

package rainbow;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
    
    public void run() {

        GRect rect = new GRect(0, 0, 500, 500);
        rect.setFilled(true);
        rect.setColor(Color.CYAN);
        add(rect);

        GOval ovalRed = new GOval(0, 0, 500, 500);
        ovalRed.setFilled(true);
        ovalRed.setColor(Color.RED);
        add(ovalRed);
        
        GOval ovalOrange = new GOval(10, 10, 480, 480);
        ovalOrange.setFilled(true);
        ovalOrange.setColor(Color.ORANGE);
        add(ovalOrange);
        
        GOval ovalYellow = new GOval(20, 20, 460, 460);
        ovalYellow.setFilled(true);
        ovalYellow.setColor(Color.YELLOW);
        add(ovalYellow);

        GOval ovalGreen = new GOval(30, 30, 440, 440);
        ovalGreen.setFilled(true);
        ovalGreen.setColor(Color.GREEN);
        add(ovalGreen);
        
        GOval ovalBlue = new GOval(40, 40, 420, 420);
        ovalBlue.setFilled(true);
        ovalBlue.setColor(Color.BLUE);
        add(ovalBlue);
        
        GOval ovalMag = new GOval(50, 50, 400, 400);
        ovalMag.setFilled(true);
        ovalMag.setColor(Color.MAGENTA);
        add(ovalMag);
        
        GOval ovalCyan = new GOval(60, 60, 380,380);
        ovalCyan.setFilled(true);
        ovalCyan.setColor(Color.CYAN);
        add(ovalCyan);
        
        GRect rect2 = new GRect(0, 250, 501, 250);
        rect2.setFilled(true);
        rect2.setColor(Color.CYAN);
        add(rect2);
        
        GLabel lab = new GLabel("Happy, Happy, Joy, Joy", 200, 125);
        add(lab);
        
    }
    
    /* Execution starts here */
    public static void main(String[] args) {
        new Rainbow().start();
    }
    
    /* 
     * Constants for the height and width of the graphics window
     */
    public static final int APPLICATION_HEIGHT = 300;
    public static final int APPLICATION_WIDTH = 500;
}