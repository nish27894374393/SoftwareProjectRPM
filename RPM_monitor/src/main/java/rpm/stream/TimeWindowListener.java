package rpm.stream;

/**
 * Receives updates when the user changes
 * the selected time window (last n seconds).
 */
public interface TimeWindowListener {
    void onTimeWindowChanged(int windowSeconds);
}