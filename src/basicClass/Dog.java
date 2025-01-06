package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	// 現在のクラス
	/*
	 * [概要]フィールド変数の宣言
	 * [詳細]フィールドに動物の名前を受け取る変数を定義する。
	 */
	// フィールド変数の宣言。String型を指定し変数名をnameとする。
	String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	/*
	 * [概要]フィールド変数の宣言
	 * [詳細]フィールドに動物の数を受け取るための変数を定義する。
	 */
	// フィールド変数の宣言。int型を指定し、変数名をnumとする。
	int num;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	/*
	 * [概要]コンストラクタの作成。
	 * [詳細]コンストラクタを作成し、フィールド変数nameに文字列を代入する。
	 */
	// コンストラクタの作成。
	Dog() {
		// フィールド変数nameに文字列を代入する。
		this.name = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	/*
	 * [概要]コンストラクタの作成
	 * [詳細]コンストラクタを作成し、引数に数値を受け取った場合、その数値をフィールド変数に代入する処理を記述する。
	 */
	// コンストラクタの作成。引数にint型を指定する。
	Dog(int num) {
		// 受け取った引数をフィールド変数numに代入する。
		this.num = num;
	}
}
