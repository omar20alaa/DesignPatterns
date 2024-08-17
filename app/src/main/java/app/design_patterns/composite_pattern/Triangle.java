package app.design_patterns.composite_pattern;

public class Triangle implements Shape {

    /*
    Composite Design Pattern Leaf Objects
    Composite design pattern leaf implements base component and these are the building block for the composite
    . We can create multiple leaf objects such as Triangle, Circle etc.
     */

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }



}
