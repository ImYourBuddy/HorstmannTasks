package com.mycompany.horstmann.chapter1.ex2;

public class NormalizeAngle {

    /**
     * Normalizes angle to a value between 0 and 359 degrees using % operator.
     * @param angle angle to be normalized
     * @return normalized angle
     */
    public static int normalize1 (int angle) {
        int result = angle % 360;
        return result < 0 ? result + 360 : result;
    }

    /**
     * Normalizes angle to a value between 0 and 359 degrees using {@link Math#floorMod(int, int)}
     * @param angle angle to be normalized
     * @return normalized angle
     */
    public static int normalize2 (int angle) {
        int result = Math.floorMod(angle, 360);
        return result < 0 ? result + 360 : result;
    }

}
