package main.java;

public class BabysitterCalculator {
    private static final int START_TIME_RATE = 16;

    public String calculate(int startTime) {
        int pay = startTime * START_TIME_RATE;

        return "$" + pay + ".00";
    }
}
