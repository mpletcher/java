/* *
Program file: Shape.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 5 2015
Assignment: Program 6
Course #: 90.297.061
*/
package shape;

public class Square extends Shape {
	private double side;
	
	public Square(String color, double side) {
		super(color);
		this.side = side;
	}
	public double area() {
		return side * side;
	}
	public String toString() {
		return getColor() + " Square with side length of " + side + " and area of " + area();
	}
}