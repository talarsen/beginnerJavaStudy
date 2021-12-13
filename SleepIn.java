
public class SleepIn {
    public static boolean printSleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        SleepIn result = new SleepIn();
        System.out.println(result.printSleepIn(false, false));
    }
}