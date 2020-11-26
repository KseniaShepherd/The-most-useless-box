public class Box {
    public static final int SLEEP_TIME = 2000;
    private volatile boolean toggleSwitchOn;

    public Box() {
        this.toggleSwitchOn = false;
    }

    public boolean getToggleSwitchOn() {
        return toggleSwitchOn;
    }

    public void setToggleSwitchOn(boolean toggleSwitchOn) {
        this.toggleSwitchOn = toggleSwitchOn;
    }

    public int getTimeSleep() {
        return SLEEP_TIME;
    }
}
