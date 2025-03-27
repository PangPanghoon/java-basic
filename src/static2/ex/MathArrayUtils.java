package static2.ex;

public class MathArrayUtils {
    private static int value;


    public static int sum(int[] values) {
        for (int i : values) {
            value += i;
        }
        return value;
    }

    public static double average(int[] values) {
        return (double) value / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (maxValue <= values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
