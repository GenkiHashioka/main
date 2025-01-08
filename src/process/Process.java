package process;
// LocalDateTimeクラスを使用するためのインポート処理
import java.time.LocalDateTime;
// DateTimeFormatterクラスを使用するためのインポート処理
import java.time.format.DateTimeFormatter;
public class Process {
	/*
	 * [概要]処理用の変数の宣言
	 * [詳細]指定された処理に必要なフィールド変数を宣言する。
	 */
	// 挨拶を格納するフィールド変数。
	public String greeting;
	// 感想を格納するフィールド変数。
	public String thoughts;
	// 説明を格納するフィールド変数。
	public String explanation;
	// 日時を格納するフィールド変数。
	public String time;
	/*
	 * [概要]コンストラクタの作成。
	 * [詳細]Processクラスのコンストラクタを作成し、インスタンスを生成した際に実行する処理を記述する。
	 */
	// コンストラクタの宣言。
	public Process() {
		// フィールド変数greetingに下記文字列を代入する。
		this.greeting = "こんにちは！ここは日本です！";
		// フィールド変数thoughtsに下記文字列を代入する。
		this.thoughts = "この寿司はうまい";
		// フィールド変数explanationに下記文字列を代入する。
		this.explanation = "寿司は和食です";
		/*
		 * [概要]現在時刻を取得する処理。
		 * [詳細]LocalDateTimeクラスとDateTimeFormatterクラスを使用して、現在時刻を指定した表示形式で取得する。
		 */
		// LocalDateTime.nowメソッドを使用して変数ldtに現在時刻を取得。
		LocalDateTime ldt = LocalDateTime.now();
		// Date.TimeFormatter.ofPatternメソッドを使用して、表示形式を指定し、変数fに取得する。
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// フィールド変数timeに下記文字列と、LocalDateTime.formatメソッドを使用して指定した表示形式の現在時刻を代入する。
		this.time = "今の現在日時は" + ldt.format(f) + "です";
	}
}
