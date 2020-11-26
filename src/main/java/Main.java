public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        User user = new User(box);
        Toy toy = new Toy(box);

        user.start();
        toy.start();

        user.join();
        toy.interrupt();
        toy.join();
    }
}

