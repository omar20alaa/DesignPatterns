package app.design_patterns.command_pattern;


public class MenuOptions {

    Document document = new Document();
    ActionListenerCommand actionSave;
    ActionListenerCommand actionOpen;


    public MenuOptions(ActionListenerCommand actionSave, ActionListenerCommand actionOpen) {
        this.actionSave = actionSave;
        this.actionOpen = actionOpen;
    }


    void clickOpen() {
         document.open();
    }


    void clickSave() {
        document.save();
    }

}
