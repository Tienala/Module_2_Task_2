/* Module 2. Task 2
 * Classname: Main
 *
 * Version 1
 *
 * Zviertseva Nataliia, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;
public class Main {

    public static void main(String[] args) {
        Priamougolnik priamougolnik1 = new Priamougolnik(3,4);
        Priamougolnik priamougolnik2 = new Priamougolnik((10+5)/5, 4);
        System.out.println(priamougolnik1);
        System.out.println(priamougolnik1.hashCode());
        boolean equals = priamougolnik1.equals(priamougolnik2);
        System.out.println(equals);
        Square ePriamougolnik = new Square(4);
        System.out.println(ePriamougolnik.getLength());

    }
}
