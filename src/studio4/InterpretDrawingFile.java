package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int rgbr = in.nextInt();
		int rgbg = in.nextInt();
		int rgbb = in.nextInt();
		boolean filled = in.nextBoolean();
		double para1 = in.nextDouble();
		double para2 = in.nextDouble();
		double para3 = in.nextDouble();
		double para4 = in.nextDouble();
		
		Color realcolor = new Color(rgbr,rgbg,rgbb);
		StdDraw.setPenColor(realcolor);
		
		if (Objects.equals(shape, "rectangle")) {
			if (filled == false) {
				StdDraw.rectangle(para1, para2, para3, para4);
			}
			else {
				StdDraw.filledRectangle(para1, para2, para3, para4);
			}
		}
		
		else if (Objects.equals(shape, "ellipse")) {
			if (filled == false) {
				StdDraw.ellipse(para1, para2, para3, para4);
			}
			else {
				StdDraw.filledEllipse(para1, para2, para3, para4);
			}
		}
		
		else if (Objects.equals(shape, "triangle")) {
			double para5 = in.nextDouble();
			double para6 = in.nextDouble();
			double[] xcoor = {para1, para3, para5};
			double[] ycoor = {para2, para5, para6};
			if (filled == false) {
				StdDraw.polygon(xcoor, ycoor);
			}
			else {
				StdDraw.filledPolygon(xcoor, ycoor);
			}
		}
	}
}
