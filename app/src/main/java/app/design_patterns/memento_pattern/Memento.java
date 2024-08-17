package app.design_patterns.memento_pattern;

class Memento {

   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }


}
