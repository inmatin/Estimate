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

public class Output {

	// private data members to hold calculations
	private double surfaceArea;
	private double volume;

	// parameters for constructor Output
	public Output(double surfaceArea, double volume) {
		this.surfaceArea = surfaceArea;
		this.volume = volume;
	}

	// getter for SurfaceArea
	public double getSurfaceArea() {
		return surfaceArea;

	}

	// setter for SurfaceArea
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	// getter for Volume
	public double getVolume() {
		return volume;
	}

	// setter for Volume
	public void setVolume(double volume) {
		this.volume = volume;
	}

	// method to print Output
	public double computeOutput() {

		double output = 0;

		System.out.println("Surface Area of the box (cm^2): " + surfaceArea);
		System.out.println("Volume of the box (cm^3): " + volume);
		System.out.println("Program by Ishtiaque Matin");

		return output;
	}

}
