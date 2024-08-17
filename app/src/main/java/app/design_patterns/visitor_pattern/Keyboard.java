package app.design_patterns.visitor_pattern;

class Keyboard implements ComputerPart {


   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }


}
