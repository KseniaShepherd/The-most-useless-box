public class User extends Thread {
    private static final int NUMBER_OF_MOVES = 5;

    private Box box;

    public User(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        int count = NUMBER_OF_MOVES;
        while (count > 0) {
            try {
                Thread.sleep(box.getTimeSleep());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean result = box.getToggleSwitchOn();
            if (!result) {
                box.setToggleSwitchOn(true);
                System.out.println("Пользователь включил тумблер");
                count--;
            }
        }
        System.out.println("Я наигрался!");
    }
}
