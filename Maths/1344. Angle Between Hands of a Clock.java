class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hourAngle = hour * .5 * 60;
        double minuteAngle = minutes * 5.5;
        double angle = 0;
        if(hourAngle > minuteAngle){
            angle = hourAngle - minuteAngle;
        }else{
            angle = minuteAngle - hourAngle;
        }
        return Math.min(angle, 360 - angle);
    }
}