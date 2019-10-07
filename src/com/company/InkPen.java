package com.company;

public class InkPen extends Pen {
    @Override
    public void getDescription() {
        System.out.println("InkPen class method - I'm ink pen");
    }

    // this method only in the child class
    public void inkLoader(){
        System.out.println("InkPen class method: Ink is now loaded");
    }


}
