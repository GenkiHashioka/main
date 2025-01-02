package curriculum_B;
//Randomクラスを使用するためのインポート処理
import java.util.Random;
// Scannerクラスを使用するためのインポート処理
import java.util.Scanner;
public class Qes6 {
	
	public static void main(String[] args) {
		/*
		 * [概要] Scannerの宣言
		 * [詳細] 配列に文字列で入力された値を取得する
		 */
		// Scannerクラスのインスタンスの初期化
		Scanner scanner = new Scanner(System.in);
		/*
		 * [概要]区切り文字を指定する処理
		 * [詳細]コンソールに入力された文字列を配列で受け取ることが出来るようにsplitメソッドを使用して区切り文字を指定する。
		 */
		// コンソールにて検索された文字列を配列に格納する
		String[] search = scanner.nextLine().split("、");
		scanner.close();
		/*
		 * [概要]乱数の取得処理
		 * [詳細]残り台数を0~11の乱数で取得する。
		 */
		// Randomクラスのインスタンスの初期化
		Random random = new Random();
		// 乱数を変数numに取得する
//		int num = random.nextInt(12);
		
		int MAX = 11;
		/*
		 * [概要]拡張for文を使用した記述
		 * [詳細]拡張for文を使用して取得した配列を順番に取り出す。
		 */
		// 配列searchの値を変数strに取り出す
		for (String str: search) {
			/*
			 * [概要] 乱数の取得処理
			 */
			// 整数0~11の値を変数numに取得する
			int num = random.nextInt(12);
			// コンソールに表示される文字列を変数resltに代入。
			String result = str + "の残り台数は" + num + "台です";
			/*
			 * [概要]switch文の処理
			 * [詳細]switch文で変数strに受け取る文字列を指定する。
			 */
			// switch文の宣言
			switch (str) {
			// パソコンから加湿器までの文字列をコンソールに受け取った時はresultに正常の文字列を表示する
			case "パソコン":
				// break; 上記値を入力されたとしても次の処理を実行しないようにする
				break;
			case "冷蔵庫":
				// break; 上記値を入力されたとしても次の処理を実行しないようにする
				break;
			case "扇風機":
				// break; 上記値を入力されたとしても次の処理を実行しないようにする
				break;
			case "洗濯機":
				// break; 上記値を入力されたとしても次の処理を実行しないようにする
				break;
			case "加湿器":
				break;
			// テレビ ディスプレイを同じ商品として宣言。break;を使用しない。
			case "テレビ":
			case "ディスプレイ":
				// 条件演算子を使用し、ディスプレイを受け取った場合、reslutに受け取る文字列を指定する。
				result = "ディスプレイ" == str  ? ("ディスプレイの残り台数は" + (MAX - num) + "台です"): result;
				// break; 次の処理を実行しないようにする。
				break;
				// コンソール二入力された結果が上記パソコン~ディスプレイ以外の場合、次の処理を実行する。
				default:
					// 変数resultに格納する文字列
					result = "「" + str + "」は指定の商品ではありません"; 
			}
			// コンソールにresultに受け取った値を出力する。
			System.out.println(result);
		}
		
	}
}
