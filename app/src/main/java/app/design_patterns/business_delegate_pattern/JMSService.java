package app.design_patterns.business_delegate_pattern;

class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }


}
