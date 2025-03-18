package edu.cmu.cs.cs214.lab02.shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + getWidth());
            }
        
            private String getWidth() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
            }
}
