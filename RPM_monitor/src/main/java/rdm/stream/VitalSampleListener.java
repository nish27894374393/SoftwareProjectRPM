package rpm.stream;

import rpm.domain.VitalSample;
/**
 * Receives real-time vital sign samples
 * published by the simulator or sensor box.
 */
public interface VitalSampleListener {
    void onVitalSample(VitalSample sample);
}