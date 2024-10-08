package app.design_patterns.null_object_pattern;

public class NullCustomer extends AbstractCustomer {


    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
