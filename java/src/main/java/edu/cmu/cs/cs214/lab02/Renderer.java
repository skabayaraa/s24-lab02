package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private final Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
        shape.draw();
    }
}
