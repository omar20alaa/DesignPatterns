package app.design_patterns.visitor_pattern;

class VisitorPatternDemo {

   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());

   }


}
