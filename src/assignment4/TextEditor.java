package assignment4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class TextEditor {

	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(-100, 100); // X coordinates go from -100 to 100
		StdDraw.setYscale(100, -100); // Y coordinates also go from -100 to 100
		// lower left corner is (-100, -100) and the upper right corner is (100, 100)
		StdDraw.rectangle(0, 0, 90, 90); // allow the user to type in this rectangle
        StdDraw.setFont(new Font(Font.MONOSPACED, 24, 24));
        
        /**
         * Write your code here!
         */
        
        StdDraw.show();
    }
}
