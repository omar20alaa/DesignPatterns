package app.design_patterns.singleton;

class Player {

   String player_name;
   static int count = 0;


   public Player() {
      count++;
      System.out.println("count Player --> " + count);
   }

   public Player(String player_name) {
      this.player_name = player_name;
   }


}
