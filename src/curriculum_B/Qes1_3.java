package curriculum_B;

public class Qes1_3 {

	public static void main(String[] args) {
		/*
		 * [概要]コンソールにユーザー名が入力できるようにする処理。
		 * [詳細]Scannerクラスを使用してコンソールに文字を入力できるようにする。
		 */
		
		// 変数を作成し、初期化する処理
		java.util.Scanner username = new java.util.Scanner(System.in);
		// 変数strに文字列の入力を受け取る。
			String str = username.next();
		
		/*
		 * [概要]条件分岐処理。
		 * [詳細]コンソールに入力された内容によって出力される文字列が変わるようにする。
		 */
		
		// if文で条件の定義
		if(str.length() > 10) {
			// 文字数が10文字以上であれば下記をコンソールに出力
			System.out.println("「名前を10文字以内にしてください」");
		 // 条件の追加。
		} else if(str == "") {
			// 入力された文字数が0以下なら下記をコンソールに出力
			System.out.println("「名前を入力してください」");
			// 上記条件に当てはまらなければ下記の処理を実行させる。
		} else {
			System.out.println("ユーザー名" + str + "を登録しました");
		}
		
	}

}
