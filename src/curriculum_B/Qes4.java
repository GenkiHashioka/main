package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// 最初に表示される文字列
		System.out.println("例題4");
		// 改行
		System.out.println();
		// 改行
		System.out.println();
		/*
		 * [概要] for文を使用した九九の表を表示する処理
		 * [詳細] for文を使用し、九九の表を作成する
		 */
		// 行方向のループ処理 変数iを初期化、iが9になるまでインクリメント
		for (int i = 1;i < 10; i++) {
			// 改行 下記繰り返しが終了した後に、実行される
			System.out.println();
			// 列方向のループ処理 変数jを初期化,jが9になるまでインクリメント
			for (int j = 1; j < 10; j++) {
				/*
				 * [概要] 整数を0埋めする処理
				 * [詳細] String.formatメソッドを使用し、整数を2桁で出力されるようにする。
				 */
				System.out.print(String.format("%02d",i) + " * " + String.format("%02d",j) + " = " + String.format("%02d",i * j) + " || ");
			}
		}
	}

}
