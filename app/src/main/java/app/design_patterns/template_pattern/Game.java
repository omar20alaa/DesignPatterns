package app.design_patterns.template_pattern;

abstract class Game {

   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();


   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }


}
