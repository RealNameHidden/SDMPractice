package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pen p= new InkPen();
        InkPen p2= new InkPen();
        Pen p3= new Pen();
        Pen p4= new SmallInkPen();
        InkPen p5= new SmallInkPen();

        p2.getDescription(); // method only in both child and parent
        p2.getManufacturer(); // Method only in parent class

        /**
         * Below throws compilation error cause static type of p4 does not have getColor() method
         */
        p4.getColor();
        p5.getColor();// Similar example

        /**
         * Below does not throw error cause
         * the static type of p2 that is InkPen does have the manufacture method as it's inherited from the Pen class
         */
        p2.getManufacturer(); // p2 static type is INkPen but accessing the method of Pen









    }
}
