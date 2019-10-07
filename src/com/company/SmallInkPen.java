package com.company;

public class SmallInkPen extends InkPen {
    @Override
    public void getDescription() {
        System.out.println("SmallInkPen class method - I'm small pen");
    }

    @Override
    public void inkLoader() {
        System.out.println("SmallInkPen class method - Small ink loaded");
    }
    //Only in this class
   public void getColor(){
        System.out.println("SmallInkPen class method - Purple");
   }
}
