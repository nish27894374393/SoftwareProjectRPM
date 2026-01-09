package rpm;

public class RpmApp {

    public static void main(String[] args) {

        VitalSimulator simulator = /* Nish
        AlarmEngine alarmEngine = /* Belle
        VitalRepository repository = /* Rachel
        Dashboard dashboard = /* Hui

        simulator.addListener(alarmEngine);
        simulator.addListener(repository);

        alarmEngine.addAlarmListener(repository);
        alarmEngine.addAlarmListener(dashboard);

        simulator.start("normal");
        dashboard.show();
    }
}