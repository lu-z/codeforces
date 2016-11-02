import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Towers -- http://codeforces.com/problemset/problem/37/A
 */
public class Solution37A {

    private static final Map<Integer, Integer> towers = new HashMap<>();

    private static int findTallestTower(int[] bars) {
        int tallest = 0;
        for (int barLength : bars) {
            int height = 1;
            if (towers.containsKey(barLength)) {
               height = towers.get(barLength) + 1;
            }
            towers.put(barLength, height);
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int barCount = scanner.nextInt();
        final int[] barLengths = new int[barCount];
        for (int i = 0; i < barCount; i++) {
            barLengths[i] = scanner.nextInt();
        }

        System.out.print(findTallestTower(barLengths) + " ");
        System.out.println(towers.size());
    }
}
