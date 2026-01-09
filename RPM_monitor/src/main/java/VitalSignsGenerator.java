import java.util.Random;

public class VitalSignsGenerator {

    private static final Random random = new Random();

    /**
     * Generates a random heart rate in beats per minute (bpm)
     * Typical adult resting range: 60–100 bpm
     */
    public static int generateHeartRate() {
        return randomIntInRange(30, 120);
    }

    /**
     * Generates random blood pressure values (systolic/diastolic)
     * Typical normal range: 90–120 / 60–80 mmHg
     */
    public static BloodPressure generateBloodPressure() {
        int systolic = randomIntInRange(80, 160);
        int diastolic = randomIntInRange(50, 100);
        return new BloodPressure(systolic, diastolic);
    }

    /**
     * Generates a random ECG value (simulated voltage in millivolts)
     * Typical ECG signal range: -1.0 to +1.0 mV
     */
    public static double generateECG() {
        return randomDoubleInRange(-1.0, 1.0);
    }

    /**
     * Generates a random respiratory rate (breaths per minute)
     * Typical adult resting range: 12–20 breaths/min
     */
    public static int generateRespiratoryRate() {
        return randomIntInRange(7, 30);
    }

    /**
     * Generates a random body temperature in Celsius
     * Normal range: 36.1–37.2 °C
     */
    public static double generateBodyTemperature() {
        return randomDoubleInRange(34, 40);
    }

    /* ---------- Helper Methods ---------- */

    private static int randomIntInRange(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    private static double randomDoubleInRange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    /* ---------- Supporting Class ---------- */

    public static class BloodPressure {
        private final int systolic;
        private final int diastolic;

        public BloodPressure(int systolic, int diastolic) {
            this.systolic = systolic;
            this.diastolic = diastolic;
        }

        public int getSystolic() {
            return systolic;
        }

        public int getDiastolic() {
            return diastolic;
        }

        @Override
        public String toString() {
            return systolic + "/" + diastolic + " mmHg";
        }
    }

}
