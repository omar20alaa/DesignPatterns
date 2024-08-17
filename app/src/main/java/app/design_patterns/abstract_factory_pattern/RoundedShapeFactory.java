package app.design_patterns.abstract_factory_pattern;

public class RoundedShapeFactory extends AbstractFactory{
   @Override
   Shape getShape(String shapeType) {
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }
      return null;
   }
}
