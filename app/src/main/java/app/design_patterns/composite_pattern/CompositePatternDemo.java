package app.design_patterns.composite_pattern;

public class CompositePatternDemo {


    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();


        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("Red");
        drawing.draw("Green");
        drawing.draw("Blue");


    }

}
