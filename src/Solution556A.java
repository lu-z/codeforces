import java.util.Scanner;
import java.util.Stack;

/**
 * Case of the Zeros and Ones -- http://codeforces.com/problemset/problem/556/A
 */
public class Solution556A {

    private static int removePairs(int length, String input) {
        Stack<Character> processed = new Stack<>();

        for (char current : input.toCharArray()) {
            if (processed.isEmpty()) {
                processed.push(current);
            } else if (processed.peek() != current) {
                length -= 2;
                processed.pop();
            } else {
                processed.push(current);
            }
        }

        return length;
    }

    public static void main(String args[]) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        final int strLen = scanner.nextInt();
        final String binary = scanner.next();

        System.out.println(removePairs(strLen, binary));
    }
}
