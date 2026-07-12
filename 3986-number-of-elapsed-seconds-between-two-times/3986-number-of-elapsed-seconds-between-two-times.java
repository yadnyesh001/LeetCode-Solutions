class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = 0;
        int end = 0;
        int sh = (startTime.charAt(0) - '0') * 10 * 3600 + 
                    (startTime.charAt(1) - '0') * 3600;
        int sm = (startTime.charAt(3) - '0') * 10 * 60 + 
                    (startTime.charAt(4) - '0') * 60;
        int ss = (startTime.charAt(6) - '0') * 10  + 
                    (startTime.charAt(7) - '0');
        int eh = (endTime.charAt(0) - '0') * 10 * 3600 + 
                    (endTime.charAt(1) - '0') * 3600;
        int em = (endTime.charAt(3) - '0') * 10 * 60 + 
                    (endTime.charAt(4) - '0') * 60;
        int es = (endTime.charAt(6) - '0') * 10  + 
                    (endTime.charAt(7) - '0');

        start = sh + sm + ss;
        end = eh + em + es;
        return end - start;
    }
}