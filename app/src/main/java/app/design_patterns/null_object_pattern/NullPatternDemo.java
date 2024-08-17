package app.design_patterns.null_object_pattern;

class NullPatternDemo {


   public static void main(String[] args) {


      AbstractCustomer customer1 = CustomerFactory.getCustomer("Omar");
      AbstractCustomer customer2 = CustomerFactory.getCustomer("Kapten Maged");
      AbstractCustomer customer3 = CustomerFactory.getCustomer("Mo7kk Konan");
      AbstractCustomer customer4 = CustomerFactory.getCustomer("Kapten Yassin");


      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());


   }


}
