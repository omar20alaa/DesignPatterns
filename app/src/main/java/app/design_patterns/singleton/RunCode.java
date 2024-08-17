package app.design_patterns.singleton;

class RunCode {

    public static void main(String[] args) {

        Runnable task = () -> {
            PlayerSingleTon instance = PlayerSingleTon.getInstance();
            System.out.println("New Instance --> " + instance.toString());
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();


    }

}
