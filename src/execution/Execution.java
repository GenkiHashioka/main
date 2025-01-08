package execution;
// Processクラスを使用するためのインポート処理。
import process.Process;
public class Execution {

	public static void main(String[] args) {
		/*
		 * [概要]別パッケージ内のクラスの使用
		 * [詳細]別のパッケージ内で作成したクラスを使用して、コンソールに文字列を表示させる。
		 */
		// processクラスのインスタンスの生成。コンストラクタの実行。
		Process process = new Process();
		// Processクラス内のフィールド変数の値をコンソールに表示。
		System.out.println(process.greeting);
		// Processクラス内のフィールド変数の値をコンソールに表示。
		System.out.println(process.thoughts);
		// Processクラス内のフィールド変数の値をコンソールに表示。
		System.out.println(process.explanation);
		// Processクラス内のフィールド変数の値をコンソールに表示。
		System.out.println(process.time);
	}

}
