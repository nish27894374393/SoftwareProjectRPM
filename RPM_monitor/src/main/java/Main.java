import Alarm.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        VitalSign hr = new HeartRate("P001", 130);
        Alarm alarm = new Alarm(hr);

        if (alarm.getAlarmLevel() != AlarmLevel.GREEN) {
            alarm.sendNotification();
        }
    }

}
