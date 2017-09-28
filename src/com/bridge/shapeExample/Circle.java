package com.bridge.shapeExample;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
