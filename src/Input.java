/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 14th, 2021
 * Modified: Oct 14th, 2021
 * Description: This class will the gather the input measurements of the box. 
 */

//importing class Scanner
import java.util.Scanner;

public class Input {

	// private data members to hold measurement
	private int boxes;
	private double length;
	double width;
	double height;

	// no arg constructor
	public Input() {
	}

	// getter for Boxes
	public int getBoxes() {
		return boxes;

	}

	// setter for Boxes
	public void setBoxes(int boxes) {
		this.boxes = boxes;

	}

	// getter for Length
	public double getLength() {
		return length;

	}

	// setter for Length
	public void setLength(double length) {
		this.length = length;
	}

	// getter for Width
	public double getWidth() {
		return width;

	}

	// setter for Width
	public void setWidth(double width) {
		this.width = width;
	}

	// getter for Height
	public double getHeight() {
		return height;

	}

	// setter for Height
	public void setHeight(double height) {
		this.height = height;
	}

	public void computeInput() {

		Scanner input = new Scanner(System.in);

		// prompt user to number of box
		System.out.print("Enter the number of box: ");
		boxes = input.nextInt();

		// prompt user to enter the length of the box
		System.out.print("Enter the length of the box (cm): ");
		length = input.nextDouble();

		// prompt user to enter the width of the box
		System.out.print("Enter the width of the box (cm): ");
		width = input.nextDouble();

		// prompt user to enter the height of the box
		System.out.print("Enter the heigth of the box (cm): ");
		height = input.nextDouble();

		// parameters for the constructor
		SurfaceArea a1 = new SurfaceArea(boxes, length, width, height);

		// parameters for the constructor
		Volume v1 = new Volume(boxes, length, width, height);

		// set value for surfaceArea
		double surfaceArea = a1.computeSurfaceArea();

		// set value for volume
		double volume = v1.computeVolume();

		Output o1 = new Output(surfaceArea, volume);

		o1.computeOutput();

		// close scanner
		input.close();

	}

}