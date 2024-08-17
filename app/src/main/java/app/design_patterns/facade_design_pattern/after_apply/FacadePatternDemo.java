package app.design_patterns.facade_design_pattern.after_apply;

class FacadePatternDemo {

   public static void main(String[] args) {

      // before facade
//      Ahly ahly = new Ahly();
//      ahly.game_plan();
//
//      Smoha smoha = new Smoha();
//      smoha.game_plan();
//
//      WadiDegla wadiDegla = new WadiDegla();
//      wadiDegla.game_plan();


//      // after facade
      PlanMaker club = new PlanMaker();
      club.ahlyPlan();
      club.smohaPlan();
      club.wadiDeglaPlan();


   }



}
