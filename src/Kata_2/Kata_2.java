package Kata_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Kata_2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[] data = new int[15];
        for (int i = 0; i < 15; i++) {
            data[i] = i;
        }
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

}