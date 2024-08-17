package app.design_patterns.null_object_pattern;

public class CustomerFactory {

    public static final String[] names = {"Omar", "Kapten Maged", "Mo7kk Konan"};

    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }


}
