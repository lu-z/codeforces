import java.util.Scanner;

/**
 * A and B and Compilation Errors -- http://codeforces.com/problemset/problem/519/B
 */
public class Solution519B {

    private static int getDisappearingError(int[] before, int[] after) {
        int result = 0;
        for (int error : before) {
            result ^= error;
        }
        for (int error : after) {
            result ^= error;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] errorsStart = new int[count];
        for (int error = 0; error < count; error++) {
            errorsStart[error] = scanner.nextInt();
        }
        int[] errorsIntermediate = new int[count-1];
        for (int error = 0; error < count-1; error++) {
            errorsIntermediate[error] = scanner.nextInt();
        }
        int[] errorsEnd = new int[count-2];
        for (int error = 0; error < count-2; error++) {
            errorsEnd[error] = scanner.nextInt();
        }
        System.out.println(getDisappearingError(errorsStart, errorsIntermediate));
        System.out.println(getDisappearingError(errorsIntermediate, errorsEnd));
    }
}
