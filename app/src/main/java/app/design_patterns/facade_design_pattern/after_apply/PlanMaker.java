package app.design_patterns.facade_design_pattern.after_apply;

import app.design_patterns.facade_design_pattern.Ahly;
import app.design_patterns.facade_design_pattern.Smoha;
import app.design_patterns.facade_design_pattern.WadiDegla;

public class PlanMaker {

    private Ahly ahly;
    private Smoha smoha;
    private WadiDegla wadiDegla;

    public PlanMaker() {
        ahly = new Ahly();
        smoha = new Smoha();
        wadiDegla = new WadiDegla();
    }


    public void ahlyPlan() {
        ahly.game_plan();
    }


    public void smohaPlan() {
        smoha.game_plan();
    }

    public void wadiDeglaPlan() {
        wadiDegla.game_plan();
    }

}
