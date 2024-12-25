package curriculum_B;
// Randomクラスを使用するためのインポート処理
import java.util.Random;
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
		// [修正] ユーザー名を格納するための変数を定義。
		String username = null;
		
		/*
		 *  [概要]while文を使用してコンソール入力の繰り返し
		 */
		while(true) {
			// 入力された値をusernameに受け取る
			username = scanner.nextLine();
		/*
		 * [概要]課題1.条件定義の処理
		 * [詳細]if文を使用し、文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力する。
		 */
		
		// ifを使用した条件分岐 length()メソッドを使用し、入力された文字数を取得する。
		if (username.length() > 10) {
			// usernameの文字数が10文字より大きい場合にコンソールに出力させる処理。
			System.out.println("「名前を10文字以内にしてください」");
		//else if により条件分岐を追加。 
			// [修正] username == 0 →　username.isEmpty() (isEmptyメソッドを使用してみた)
		} else if (username.isEmpty() || username == null) {
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
			break;
			}
		}
		/*
		 *  [概要] 配列の作成処理
		 *  [詳細] じゃんけんの手を配列に格納する
		 */
		// 配列の宣言
		String[] hands = {"グー","チョキ","パー"};
		// インデックスで使用する変数の初期化
		int choice = 0;
		/* 
		 * [概要] じゃんけんを行った回数を変数に受け取る処理
		 * [詳細] じゃんけんに勝つまでにじゃんけんを行った回数を勝った時にコンソールに表示させる 
		 */
		// 変数の初期化
		int count = 0;
		
		/*
		 * [概要] Randomクラスを使用して指定した変数に乱数を取得する処理。
		 * [詳細] 変数に0~2の乱数を取得し、相手の手をランダムに出力する。
		 */
		// Randomクラスのインスタンスの初期化
		Random random = new Random();
		
		// 繰り返しの処理。
		while(true) {
			// scannerに数値を受取り変数choiceに代入
			choice = scanner.nextInt();
			// 0~2の乱数を変数に受け取る処理
			int randomvalue = random.nextInt(3);
			// コンソールに表示させる文字列
			System.out.println("ユーザー名「" + username + "」を登録しました");
			// コンソールに表示させる文字列 handsのインデックスはScannerに入力された値を使用する
			System.out.println(username + "の手は「" + hands[choice] + "」");
			// コンソールに表示させる文字列 handsのインデックスには乱数を使用。
			System.out.println("相手の手は「" + hands[randomvalue] + "」");
			/*
			 * [概要] 条件分岐処理
			 * [詳細] じゃんけんの結果によって表示される文字列が変化するようにする。
			 */
			// ifで条件分岐を行う。
			if (choice == 0 && randomvalue == 1 || choice == 1 && randomvalue == 2 || choice == 2 && randomvalue == 0) {
				// 勝った時に表示する文字列
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				// インクリメント処理
				count++;
				// じゃんけんを行った回数を表示する処理
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				// Scannerの終了を宣言
				scanner.close();
				// 繰り返しの終了を宣言
				break;
				// 自分がじゃんけんでグーに負けた場合の条件分岐
			} else if (choice == 1 && randomvalue == 0) {
				// 表示される文字列
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				// インクリメント処理
				count++;
				// 自分がじゃんけんでチョキに負けた場合の条件分岐
			} else if (choice == 2 && randomvalue == 1){
				// 表示される文字列
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				// インクリメント処理
				count++;
				// 自分がじゃんけんでパーに負けた場合の条件分岐
			} else if (choice == 0 && randomvalue == 2) {
				// 表示される文字列
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				// インクリメント処理
				count++;
				// あいこの場合の処理
			} else {
				// 表示される文字列
				System.out.println("DRAW あいこ もう一回しましょう！");
				// インクリメント処理
				count++;
			}
			
		}
	}
}
