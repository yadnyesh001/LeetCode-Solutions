class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = 0.5 * (hour * 60 + minutes);
        double minuteAngle = 6 * minutes;

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }
}
