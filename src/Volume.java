/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 14th, 2021
 * Modified: Oct 14th, 2021
 * Description: This class will calculate the order of how many packages of 
 * weather stripping is needed.
 */

public class Volume {

	// private data members to hold measurement
	private int boxes;
	private double length;
	private double width;
	private double height;

	// parameter for constructor Volume
	public Volume(int boxes, double length, double width, double height) {
		this.boxes = boxes;
		this.length = length;
		this.width = width;
		this.height = height;
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

	// method to calculate Volume
	public double computeVolume() {

		double volume = 0;

		// calculate volume
		volume = (height * width * length) * boxes;

		return volume;

	}

}
