/* *
Program file: Shape.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 5 2015
Assignment: Program 6
Course #: 90.297.061
*/
package shape;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle(String color, double length, double width) {
		super(color);
		this.width = width;
		this.length = length;
	}
	public double area() {
		return width * length;
	}
	public String toString() {
		return getColor() + " Rectangle with length of " + length + " and the width of " + width + " and area of " + area();
	}
}