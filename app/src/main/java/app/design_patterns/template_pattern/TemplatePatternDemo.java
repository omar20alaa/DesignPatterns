package app.design_patterns.template_pattern;

class TemplatePatternDemo {


   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();

      game = new Football();
      game.play();


   }

}
