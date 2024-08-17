package app.design_patterns.composite_pattern;

public interface Shape {

 /*
  Composite pattern base component defines the common methods for leaf and composites.
  We can create a class Shape with a method draw(String fillColor) to draw the shape with given color. Shape.java
  */
  void draw(String fillColor);


}
