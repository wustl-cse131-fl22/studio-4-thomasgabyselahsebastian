package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		Scanner shape = new Scanner(f);
		String shapeType = shape.next();
		int redComponent = shape.nextInt();
		int greenComponent = shape.nextInt();
		int blueComponent = shape.nextInt();
		boolean isFilled = shape.nextBoolean();
		double parameterOne = shape.nextDouble();
		double parameterTwo = shape.nextDouble();
		double parameterThree = shape.nextDouble();
		double parameterFour = shape.nextDouble();
		
		Color shpColor = new Color (redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(shpColor);
		if (isFilled == true) {
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		
	}
}
