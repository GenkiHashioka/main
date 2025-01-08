package basicClass;
// LocalDateTimeクラスを使用するためのインポート処理。
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		/*
		 * [概要]クラスの呼び出し
		 * [詳細]クラスを呼び出し、受け取った値をコンソールに表示する処理を記述する。
		 */
		// Dogクラスのインスタンスの生成。インスタンス名をdogとする。
		Dog dog = new Dog();
		// dogクラスのフィールド変数nameを取得し、コンソールに表示する。
		System.out.println(dog.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		/*
		 * [概要]フィールド変数の値の変更。
		 * [詳細]クラスを呼び出し、コンストラクタの引数に、数値を渡す。
		 */
		// インスタンスに引数として数値を渡す。
		dog = new Dog(3);
		// フィールド変数numを呼び出し、コンソールに表示する。
		System.out.println(dog.num);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		/*
		 * [概要]現在の日時を取得し、コンソールに表示する処理。
		 * [詳細]LocalDateTimeクラスを呼び出し、コンソールに現在時刻を表示する。
		 */
		// インスタンスの生成。インスタンス名をldtとする。LocalDateTimeクラス内のnowメソッドを使用して、インスタンスに現在時刻の値を格納する。
		LocalDateTime ldt = LocalDateTime.now();
		/*
		 * [概要]日時の表示形式を指定する処理。
		 * [詳細]DateTimeFormatterクラスを使用して日時の表示形式を指定する。
		 */
		// クラスの呼び出し、変数名をdtfとし、日時の表示形式を指定する。ofPatternメソッドに引数として、表示したい形式の文字列を渡す。
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// 文字列の変数formatldtを作成し、formatメソッドに引数として、現在時刻を渡す。formatldtに処理結果を格納する。
		String formatldt = dtf.format(ldt);
		// 現在時刻の表示。
		System.out.println(formatldt);
	}
}
