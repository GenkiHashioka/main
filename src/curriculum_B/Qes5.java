package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		/*
		 *  [概要] 乗算の早見表を作成する処理
		 *  [詳細] for文を使用して乗算の式と答えを順番にコンソールに出力する
		 */
		// 例題を表示
		System.out.println("例題5");
		// 改行
		System.out.println();
		
		// for文を使用した繰り返し処理と条件式の設定。変数jの初期値を1とし、jの値をインクリメント、jの値が9になるまで処理を繰り返す。
		for(int j = 1; j <= 9; j++) {
			// 下記繰り返し処理実行後に改行
			System.out.println();
			// for文の中にfor文を作成。先に繰り返される処理。変数iの初期値を1とし、iの値をインクリメント、iの値が20になるまで処理を繰り返す。
			for(int i = 1; i <= 20; i++) {
				/*
				 * [概要] 整数を0埋めする処理
				 * [詳細] formatメソッドを使用して整数が3桁で表示されるように整数の左側を0埋めする
				 */
				System.out.print(String.format("%03d", i) + " * " + String.format("%03d", j) + " _ " + String.format("%03d", i*j) + "||");
			}
		}

	}

}
