import java.util.List;

public class FindMax {
    public static int findMax(List<Integer> temperatures) {
        int highTemperature = Integer.MIN_VALUE;
        for (int temperature : temperatures) {
            highTemperature = Math.max(highTemperature, temperature);
        }
        return highTemperature;
    }
}
