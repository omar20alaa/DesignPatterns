package app.design_patterns.command_pattern;

public class ActionSave implements ActionListenerCommand {


    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }

}
