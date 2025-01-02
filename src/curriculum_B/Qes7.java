package curriculum_B;
// BigDecimalクラスを使用するためのインポート処理
import java.math.BigDecimal;
// setScaleメソッドを使用するためのインポート処理
import java.math.RoundingMode;
// Scannerのインポート処理
import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
		/*
		 * [概要] Scannerの宣言
		 * [詳細] Scannerを使用し、コンソール入力が出来るようにする。
		 */
		// Scannerクラスのインスタンスの初期化。
		Scanner scanner = new Scanner(System.in);
		// コンソールに文字列を表示。
		System.out.print("生徒の人数を入力してください (2以上) :");
		/*
		 * [概要]２次元配列の定義
		 * [詳細]2次元配列を作成し、行方向の値を変数peopleに受け取る。また、列方向の値を4つ作成し、科目別に変数を作成する。
		 */
		//Scannerに入力された値を変数peopleに受け取る。
		int people = scanner.nextInt();
		// 2次元配列resultを作成し、行方向の配列の数をScannerに入力された値,列方向の配列の数を4つ作成。
		int results[][] = new int[people][4];
		/*
		 * [概要]拡張for文
		 * [詳細]拡張for文を使用して、配列の行数分だけ繰り返す処理を記述する。
		 */
		// 何人目の点数かを出力するための変数の宣言。
		int i = 1;
		// 拡張for文 変数resultsの行数を仮変数resultに受取、下記繰り返しの処理を実行する。
		for(int[] result : results) {
			// 英語の点数の入力を促す表示
			System.out.print(i + "人目" + "の「英語」の点数を入力してください:");
			// resultsにコンソールに入力された値を格納する。
			results[i-1][0] = scanner.nextInt();
			// 数学の点数の入力を促す表示
			System.out.print(i + "人目" + "の「数学」の点数を入力してください:");
			// resultsにコンソールに入力された値を格納する。
			results[i-1][1] = scanner.nextInt();
			// 理科の点数の入力を促す表示
			System.out.print(i + "人目" + "の「理科」の点数を入力してください:");
			// resultsにコンソール入力された値を格納する。
			results[i-1][2] = scanner.nextInt();
			// 社会の点数入力を促す表示
			System.out.print(i + "人目" + "の「社会」の点数を入力してください:");
			// resultsにコンソール入力された値を格納する。
			results[i-1][3] = scanner.nextInt();
			// 変数iをインクリメント。iの値を変更し、格納される値の行数を変更する。
			i++;
			// 改行
			System.out.println();
		}
		scanner.close();
		/*
		 * [概要]一人ひとりの平均点を求める処理
		 * [詳細]拡張for文を使用して人数分の平均点を算出、出力する。
		 */
		// 変数iの初期化
		i = 0;
		// 拡張for文 resultsの行数分だけ次の処理を繰り返し行う
		for(int[] result: results) {
			// 変数avgに平均の計算式を代入する。
			double avg = (results[i][0] + results[i][1] + results[i][2] + results[i][3]) / 4.0;
			// コンソール二出力する文字列 String.format()を使用し小数点第２位までの値を表示
			System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f", avg) + "点です。");
			// iをインクリメント。iの値を変更して繰り返しを実施。
			i++;
			// 改行
			System.out.println();
			}
		/*
		 * [概要]２重for文を使用して、科目別の平均点を算出する処理
		 * [詳細]２重for文を使用して、科目別の平均点を算出し、コンソールに表示する。
		 */
		
		// 科目の配列を作成し、科目を一つにまとめる。
		String[] subjects = {"英語","数学","理科","社会"};
		// for文 jが配列の値の数に到達するまで繰り返し処理を行う
		for(int j = 0; j < subjects.length; j++) {
			// 合計値を算出する変数sumを作成する。
			double sum = 0;
			// 内側のfor文 iがコンソール入力した人数に達するまで下記の処理をくりかえす。
			for(i = 0; i < results.length; i++) {
				// 科目ごとの合計点を変数sumに格納する。
				sum += results[i][j];
			}
			// 科目の平均点を算出する。
			double avg = sum / results.length;
			/*
			 * [概要]BigDecimalを使用して平均の値を丸める処理
			 * [詳細]平均の表記を小数点第2位までにし、第3位以下四捨五入とする。
			 */
			// BigDecimalの宣言、平均点avgの値に紐づける。
			BigDecimal bd = new BigDecimal(avg);
			// setScaleメソッドを使用して、小数点第2位までの表示と第3位以下を四捨五入して数字を丸める処理
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			// 科目平均点の出力処理
			System.out.println(subjects[j] + "の平均点は" + bd + "点です。");
		}
		/*
		 * [概要]全体の平均点を算出する処理
		 * [詳細]二重for文を使用して、全人数、全科目の合計点を算出し、1科目あたりの平均点を出力する。
		 */
		// 全人数、全科目の合計点数を受け取る変数の初期化
		double sum = 0;
		// 外側のループ処理 変数 iをインクリメント、人数分の繰り返しを指定
		for(i = 0; i < results.length; i++) {
			// 内側のループ処理 変数jをインクリメント、科目数文の繰り返しを指定。
			for(int j = 0; j < subjects.length; j++) {
				// results[i][j]の値を変数sumに加算行き全体の合計点数を格納する
				sum += results[i][j];
			}
		}
		// 平均の計算。 合計点を人数で割り、合計点の平均を科目数で割る。
		double avg = sum / results.length / subjects.length;
		// BigDecimalクラスの作成。avgの値を紐づける。
		BigDecimal bd = new BigDecimal(avg);
		// 桁数の指定。setScaleメソッドを使用して小数第2位まで格納、第3位以下四捨五入。
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		// 全体の平均点の出力
		System.out.println("全体の平均点は" + bd + "点です。");
	}
	
}
