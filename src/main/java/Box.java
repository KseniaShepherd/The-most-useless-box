public class Box {
    public static final int TIME_SLEEP = 2000;
    private volatile boolean toggleSwitchIncluded;

    public Box() {
        this.toggleSwitchIncluded = false;
    }

    public boolean getToggleSwitchIncluded() {
        return toggleSwitchIncluded;
    }

    public void setToggleSwitchIncluded(boolean toggleSwitchIncluded) {
        this.toggleSwitchIncluded = toggleSwitchIncluded;
    }

    public int getTimeSleep() {
        return TIME_SLEEP;
    }
}
