import java.util.Scanner;

public class TissueBoxStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()); // ティッシュ箱の高さ
        int M = Integer.parseInt(scanner.nextLine()); // 収納スペースの高さ
        scanner.close();

        if (N < 1 || N > 10 || M < 10 || M > 100 || N > M) {
            System.err.println("入力が無効です。制約条件を確認してください。");
            return;
        }

        int result = calculateTissueBoxes(N, M);
        System.out.println(result);
    }

    public static int calculateTissueBoxes(int N, int M) {
        return M / N;
    }
}
