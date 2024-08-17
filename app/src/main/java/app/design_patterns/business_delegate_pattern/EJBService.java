package app.design_patterns.business_delegate_pattern;

class EJBService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }

}
