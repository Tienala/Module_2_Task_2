/* Module 2. Task 2
 * Classname: Square
 *
 * Version 1
 *
 * Zviertseva Nataliia, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;
//Child Class Square
public class Square extends Priamougolnik {
    private int side;
//Constructor
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
//Getter
    public int getSide() {
        return side;
    }
//Setter
    public void setSide(int side) {
        this.side = side;
    }

// Method Diagonal Square
    public double getDiagonal() {
        return side*Math.sqrt(2);
    }
//Method Area
    @Override
    public double getArea() {
        return super.getArea();
    }
//Method Length
    @Override
    public double getLength() {
        return super.getLength();
    }

    //To string
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
