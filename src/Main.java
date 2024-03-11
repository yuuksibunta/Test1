import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // あなたの食べたい料理名を取得
        String wantedDish = scanner.nextLine();

        // メニューの単語数を取得
        int N = Integer.parseInt(scanner.nextLine());

        // メニュー名を取得し、食べたい料理名が含まれているかを判定
        boolean found = false;
        for (int i = 0; i < N; i++) {
            String menuDish = scanner.next();
            if (wantedDish.equals(menuDish)) {
                found = true;
                break;
            }
        }

        // 結果を出力
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //Gitの使い方の学習の為コメントを入れました。

        scanner.close();
    }
}
