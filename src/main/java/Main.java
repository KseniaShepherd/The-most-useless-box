public class Main {
    public static final int PAUSE = 500;

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        User user = new User(box);
        Toy toy = new Toy(box);
        user.start();
        Thread.sleep(PAUSE);
        toy.start();
        user.join();
        if (!user.isAlive()) {
            toy.interrupt();
            toy.join();
        }

    }
}

