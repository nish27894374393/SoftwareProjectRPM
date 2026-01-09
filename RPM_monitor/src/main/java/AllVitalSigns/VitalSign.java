package AllVitalSigns;

import Alarm.AlarmLevel;

import java.time.LocalDateTime;

public abstract class VitalSign {

    protected LocalDateTime dateTime;
    protected double value;
    protected String patientID;

    public VitalSign(String patientID, double value) {
        this.patientID = patientID;
        this.value = value;
        this.dateTime = LocalDateTime.now();
    }

    public double getValue() {
        return value;
    }

    public String getPatientID() {
        return patientID;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public abstract AlarmLevel getAlarmLevel();
}

