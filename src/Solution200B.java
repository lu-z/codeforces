import java.util.Scanner;

/**
 * Drinks -- http://codeforces.com/problemset/problem/200/B
 */
public class Solution200B {

    private static double getOjPercentage(int drinkCount, double[] ojPercents) {
        double result = 0;
        final double drinkContibution = 1.0 / drinkCount;
        for (int drink = 0; drink < drinkCount; drink++) {
            result += drinkContibution * ojPercents[drink];
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] ojPercents = new double[count];
        for (int drink = 0; drink < count; drink++) {
            ojPercents[drink] = scanner.nextDouble();
        }
        System.out.println(getOjPercentage(count, ojPercents));
    }
}
