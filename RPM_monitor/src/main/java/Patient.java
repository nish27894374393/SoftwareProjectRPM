public class Patient extends VitalSignsGenerator {
    private String name;
    private int age;
    private int hr;
    private BloodPressure bp;
    private double ECG;
    private int RR;
    private double temp;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        updateVitals();
    }

    public void updateVitals() {
        this.hr = generateHeartRate();
        this.bp = generateBloodPressure();
        this.ECG = generateECG();
        this.RR = generateRespiratoryRate();
        this.temp = generateBodyTemperature();
    }

    /* ----- Getters ----- */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHr() {
        return hr;
    }

    public BloodPressure getBp() {
        return bp;
    }

    public double getECG() {
        return ECG;
    }

    public int getRR() {
        return RR;
    }

    public double getTemp() {
        return temp;
    }

    /* ----- Potential Display in the UI ----- */
    public String PatientDisplay() {
        return "Patient\n"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Heart Rate: " + hr + " bpm\n"
                + "Blood Pressure: " + bp.toString() + "\n"
                + String.format("ECG: %.3f mV%n", ECG)
                + "Respiratory Rate: " + RR + " breaths/min\n"
                + String.format("Body Temperature:  %.1f °C%n", temp) + "\n";
    }

        /* ----- Example usage ----- */

        public static void main(String[] args) throws InterruptedException {
            Patient p = new Patient("John Smith", 35);

            while (true) {
                p.updateVitals();
                System.out.println(p.PatientDisplay());
                Thread.sleep(1000);
            }
        }
    }