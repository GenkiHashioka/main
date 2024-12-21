package curriculum_B;
// Scannerクラスを使用するためのインポート処理
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		/*
		 * [概要]課題1.コンソールにユーザー名が入力できるようにする処理。
		 * [詳細]Scannerクラスを使用してコンソールに文字を入力,出力できるようにする。
		 */
		
		// Scannerクラスのオブジェクトを生成する。
		Scanner scanner = new Scanner(System.in);
		
		/*
		 *  [概要]while文を使用してコンソール入力の繰り返し
		 */
		while(true) {
			// 入力された値をusernameに受け取る
			String  username = scanner.next();
		/*
		 * [概要]課題1.条件定義の処理
		 * [詳細]if文を使用し、文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力する。
		 */
		
		// ifを使用した条件分岐 length()メソッドを使用し、入力された文字数を取得する。
		if (username.length() > 10) {
			// usernameの文字数が10文字より大きい場合にコンソールに出力させる処理。
			System.out.println("「名前を10文字以内にしてください」");
		//else if により条件分岐を追加。
		} else if (username.length() == 0 || username == null) {
			// usernameの文字数が0もしくはnullの場合にコンソールに出力させる処理
			System.out.println("「名前を入力してください」");
			// matchesメソッドを使用して、usernameが半角英数字のみで構成されているかどうかを取得。
		} else if (!username.matches("^[0-9a-zA-z]+$")){
			// 半角英数字のみではない場合にコンソールに表示する文字列
			System.out.println("「半角英数字のみで名前を入力してください」");
			// 上記条件以外なら以下の処理を実施。
		} else {
			// 入力された値が適正なら表示する文字列
			System.out.println("ユーザー名「" + username + "」を登録しました。");
			// 繰り返し処理の終了
			break;
			}
		}
		/*
		 * [概要] 配列を作成する処理
		 * [詳細] じゃんけんの選択肢を配列でまとめる。
		 */
		// 配列の宣言と値の読み込み
		String[] rps = {"グー","チョキ","パー"};
	}
}
