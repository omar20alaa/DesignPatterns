package app.design_patterns.factory_pattern.after_apply;

import app.design_patterns.factory_pattern.Shape;

public class FactoryPatternDemo {


    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

//        Circle circle = new Circle();
//        circle.draw();
//
//        Square square = new Square();
//        square.draw();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();


        Shape shape_circle = shapeFactory.getShape("CIRCLE");
        shape_circle.draw();


        Shape shape_rectangle = shapeFactory.getShape("RECTANGLE");
        shape_rectangle.draw();


        Shape shape_square = shapeFactory.getShape("SQUARE");
        shape_square.draw();

    }

}
