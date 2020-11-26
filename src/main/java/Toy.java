public class Toy extends Thread {
    private Box box;


    public Toy(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            try {
                Thread.sleep(box.getTimeSleep());
            } catch (InterruptedException e) {
                return;
            }
            boolean result = box.getToggleSwitchOn();
            if (result) {
                box.setToggleSwitchOn(false);
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
