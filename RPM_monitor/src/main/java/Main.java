package rpm;

public class RpmApp {

    public static void main(String[] args) {

        //VitalSimulator simulator = /* Nish
        //AlarmEngine alarmEngine = /* Belle
        //VitalRepository repository = /* Rachel
        //Dashboard dashboard = /* Hui

        simulator.addListener(alarmEngine);
        simulator.addListener(repository);

        alarmEngine.addAlarmListener(repository);
        alarmEngine.addAlarmListener(dashboard);

        simulator.start("normal");
        dashboard.show();
    }
}
        System.out.println("Hello world");

        //code to test if the generator works
        VitalSignsGenerator signGenerator = new  VitalSignsGenerator();
        System.out.println("Heart Rate: " + signGenerator.generateHeartRate() + " bpm");
        System.out.println("Blood Pressure: " + signGenerator.generateBloodPressure());
        System.out.println("ECG: " + signGenerator.generateECG() + " mV");
        System.out.println("Respiratory Rate: " + signGenerator.generateRespiratoryRate() + " breaths/min");
        System.out.println("Body Temperature: " + signGenerator.generateBodyTemperature() + " °C");

    }




}
