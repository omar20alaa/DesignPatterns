package app.design_patterns.interpreter_pattern;

class InterpreterPatternDemo {

   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Omar");
      Expression john = new TerminalExpression("Maged");
      return new OrExpression(robert, john);
   }

   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Dalia");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
   }


   public static void main(String[] args) {

      Expression isMale = getMaleExpression();
      System.out.println("Omar is male? " + isMale.interpret("Omar"));

      Expression isMarriedWoman = getMarriedWomanExpression();
      System.out.println("Dalia is a married women? " +
              isMarriedWoman.interpret("Married "));


   }

}
