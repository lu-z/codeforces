import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  Hulk -- http://codeforces.com/problemset/problem/705/A
 */
public class Solution705A {

    private static final Map<Integer, String> sentimentMap = new HashMap<>();
    static {
        sentimentMap.put(0, "I hate");
        sentimentMap.put(1, "I love");
    }

    private static String getHulkSentiment(int sentiment) {
        final StringBuilder sb = new StringBuilder();

        for (int layer = 0; layer < sentiment; layer++) {
            sb.append(sentimentMap.get(layer % 2));
            if (layer == sentiment - 1) {
                sb.append(" it");
            } else {
                sb.append(" that ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        System.out.println(getHulkSentiment(scanner.nextInt()));
    }
}
