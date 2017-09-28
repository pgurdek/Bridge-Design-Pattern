package com.bridge.shapeExample;

public class ShowExampleShape {

    public static void showExample(){
//        Old example w/o bridge
//        Shape circle = new Circle();
//        Shape square = new Square();

//        New with bridge

        Color red = new Red();
        Color blue = new Blue();
        Shape circle = new Circle(red);
        Shape square = new Square(blue);

        circle.applyColor();
        square.applyColor();

//   As you can see we have same result
    }
}
