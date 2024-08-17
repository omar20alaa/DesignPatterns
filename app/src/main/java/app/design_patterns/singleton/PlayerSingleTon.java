package app.design_patterns.singleton;

class PlayerSingleTon {

    private static PlayerSingleTon INSTANCE;
    String player_name;
    static int count = 0;


    private PlayerSingleTon() {
    }

    private PlayerSingleTon(String player_name) {
        this.player_name = player_name;
    }


    public static PlayerSingleTon getInstance() {
        synchronized (PlayerSingleTon.class) {
            if (INSTANCE == null) {
                count++;
                System.out.println("count PlayerSingleTon --> " + count);
                INSTANCE = new PlayerSingleTon();
            }
        }
        return INSTANCE;
    }

}
