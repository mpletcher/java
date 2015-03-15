/* *
Program file: Shape.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 5 2015
Assignment: Program 6
Course #: 90.297.061
*/
package shape;

public class Circle extends Shape {
	private double radius;
	
/** Constructor invokes the base constructor (passing the color), 
then sets the radius instance value
 */
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius * radius; //A = π * r * r
	}
	public String toString() {
		return getColor() + " circle with radius of " + radius + " and area of " + area();
	}
}