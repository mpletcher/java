/* *
Program file: Shape.java
Author: Marcos R. Pletcher
Email: marcos_rochapletcher@student.uml.edu
Date: March, 5 2015
Assignment: Program 6
Course #: 90.297.061
*/
package shape;

public class Shape {
    private String color;

    public Shape(String color) {
	this.color = color;
    }
    public String getColor(){
	return this.color;
    }
    public double area(){
	return 0.0;
    }

    public String toString(){
	return "Generic Shape";
    }    
}

