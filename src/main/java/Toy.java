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
            box.setToggleSwitchIncluded(false);
            boolean result = box.getToggleSwitchIncluded();
            if (!result) {
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
