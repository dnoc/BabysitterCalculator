package main.java;

public class BabysitterCalculator {
    private static final int START_TIME_RATE = 12;
    private static final int BED_TIME_RATE = 8;
    private static final int END_TIME_RATE = 16;

    private static final int MIDNIGHT = 12;

    /**
     * Calculates pay based on Start, Bed, and End times.
     *
     * @param startTime
     *      Time shift starts. Must be > 5, <= bedTime
     * @param bedTime
     *      Time kid goes to bed. Must be >= startTime, <= MIDNIGHT
     * @param endTime
     *      Time shift ends. Must be >= 0, <= 4.
     * @return
     *      Total pay or an error message if the times were out of bounds.
     */
    public String calculate(int startTime, int bedTime, int endTime) {
        if (verifyTimes(startTime, bedTime, endTime).isEmpty()) {
            int pay = calculatePay(startTime, bedTime, endTime);
            return "$" + pay + ".00";
        } else {
            return verifyTimes(startTime, bedTime, endTime);
        }
    }

    /**
     * Verifies times are within bounds.
     * @param startTime
     *      Time shift starts. Must be > 5, <= bedTime
     * @param bedTime
     *      Time kid goes to bed. Must be >= startTime, <= MIDNIGHT
     * @param endTime
     *      Time shift ends. Must be >= 0, <= 4.
     * @return
     *      Empty string or an error message if the times were out of bounds.
     */
    private String verifyTimes(int startTime, int bedTime, int endTime) {
        if (startTime < 5) {
            return "Start time cannot be before 5.";
        } else if ((startTime > bedTime) || (bedTime >= MIDNIGHT)) {
            return "Bed time must be between " + startTime + " and Midnight.";
        } else if (endTime > 4) {
            return "End time cannot be after 4.";
        } else if (endTime < 0) {
            return "End time cannot be before Midnight.";
        } else {
            return "";
        }
    }

    /**
     * Calculates total pay for shift based on times and rates.
     * @param startTime
     *      Time shift starts.
     * @param bedTime
     *      Time kid goes to bed.
     * @param endTime
     *      Time shift ends.
     * @return
     *      int pay, calculated total pay
     */
    private int calculatePay(int startTime, int bedTime, int endTime) {
        int startPay = (bedTime - startTime) * START_TIME_RATE;
        int bedPay = (MIDNIGHT - bedTime) * BED_TIME_RATE;
        int endPay = ((endTime + 12) - MIDNIGHT) * END_TIME_RATE;

        int pay = startPay + bedPay + endPay;
        return pay;
    }
}
