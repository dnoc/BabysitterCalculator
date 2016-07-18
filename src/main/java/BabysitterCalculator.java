package main.java;

public class BabysitterCalculator {
    private static final int START_TIME_RATE = 12;
    private static final int BED_TIME_RATE = 8;
    private static final int END_TIME_RATE = 16;

    private static final int MIDNIGHT = 12;

    public String calculate(int startTime, int bedTime, int endTime) {
        if (startTime < 5) {
            return "Start time cannot be before 5.";
        } else if ((startTime > bedTime) || (bedTime > MIDNIGHT)) {
            return "Bed time must be between " + startTime + " and Midnight.";
        } else {
            int pay = calculatePay(startTime, bedTime, endTime);
            return "$" + pay + ".00";
        }
    }

    private int calculatePay(int startTime, int bedTime, int endTime) {
        int startPay = (bedTime - startTime) * START_TIME_RATE;
        int bedPay = (MIDNIGHT - bedTime) * BED_TIME_RATE;
        int endPay = ((endTime + 12) - MIDNIGHT) * END_TIME_RATE;

        int pay = startPay + bedPay + endPay;
        return pay;
    }
}
