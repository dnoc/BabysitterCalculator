package main.java;

public class BabysitterCalculator {
    private static final int START_TIME_RATE = 12;
    private static final int BED_TIME_RATE = 8;

    private static final int MIDNIGHT = 12;

    public String calculate(int startTime, int bedTime) {
        int pay;

        if (startTime < 5) {
            return "Start time cannot be before 5.";
        } else {
            int startPay = (bedTime - startTime) * START_TIME_RATE;
            int bedPay = (MIDNIGHT - bedTime) * BED_TIME_RATE;

            pay = startPay + bedPay;
            return "$" + pay + ".00";
        }
    }
}
