package mx.jovannypcg.loggingusage.util;

import hugo.weaving.DebugLog;

public class Utilities {
    @DebugLog
    public static double average(double... notes) {
        double sum = 0;

        if (notes.length == 0) {
            return 0;
        }

        for (double note : notes) {
            sum += note;
        }

        return sum / notes.length;
    }
}
