package Alarm;

import java.time.LocalDateTime;

public class Alarm {

    private String patientID;
    private VitalSign vitalSign;
    private AlarmLevel alarmLevel;
    private String message;
    private LocalDateTime dateTime;

    public Alarm(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
        this.patientID = vitalSign.getPatientID();
        this.alarmLevel = vitalSign.getAlarmLevel();
        this.dateTime = LocalDateTime.now();
        this.message = buildMessage();
    }

    private String buildMessage() {
        return "Patient " + patientID +
                " | Vital: " + vitalSign.getClass().getSimpleName() +
                " | Value: " + vitalSign.getValue() +
                " | Level: " + alarmLevel;
    }

    public AlarmLevel getAlarmLevel() {
        return alarmLevel;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // UML method
    public void sendNotification() {
        System.out.println("🚨 ALARM: " + message);
        // Later you can connect email / sound here
    }
}
