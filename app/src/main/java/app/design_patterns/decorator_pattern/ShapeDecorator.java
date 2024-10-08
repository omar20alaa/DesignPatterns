package app.design_patterns.decorator_pattern;

public abstract class ShapeDecorator {

   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }


}
