package curriculum_New_question;
import java.util.ArrayList;
import java.util.List;
// Randomクラスを使用するためのインポート処理。
import java.util.Random;
public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	/*
	 * [概要]メソッドの作成
	 * [詳細]引数に文字列型と整数型をいれてコンソールに出力させる処理を記述する。
	 */
	// 現在のクラス内だけで使用できるメソッドを作成。引数に文字列型と整数型を指定する。
	private static void msg(String greeting, int version) {
		// コンソールに出力させる処理。
		System.out.println(greeting + version);
		// 改行
		System.out.println();
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	/*
	 * [概要] メソッドの作成。
	 * [詳細] 引数同士を乗算し、コンソールに計算結果を表示する。
	 */
	// 現在のクラスだけで使用できるメソッドを作成,引数をx,yとする。
	private static void result(int x, int y) {
		// 引数x,yを乗算する。結果をコンソールに表示。
		System.out.println(x * y);
		// 改行
		System.out.println();
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	/*
	 * [概要]メソッドの作成。
	 * [詳細]メソッドの引数に整数の配列を指定して受け取った値を順番にコンソールに出力する。
	 */
	// 現在のクラスでしか使用できないメソッドを作成。引数は整数型とする。
	private static void display(int[] nums) {
		/*
		 * [概要]for文を使用した繰り返し処理。
		 * [詳細]for文を使用し、配列の中身の数だけ繰り返す処理を記述する。
		 */
		// for文。変数iを宣言しiをインクリメント。iが配列の要素数に達するまで下記の処理を繰り返す。
		for(int i = 0; i < nums.length; i++) {
			// 配列の要素を取り出し、コンソールに出力する。
			System.out.println(nums[i]);
		}
		// 改行
		System.out.println();
	}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	/*
	 * [概要]メソッドのオーバーロード。
	 * [詳細]メソッド名の同じメソッドを定義し、引数の型をdoubleとする。
	 */
	// Q2で使用したメソッド名、引数名を使用し、型をint→doubleにしてメソッドを作成。
	private static void result(double x, double y) {
		// 受け取った引数の型がdouble型の場合、xとyを和算するように記述。コンソールに出力。
		System.out.println(x + y);
		// 改行
		System.out.println();
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	/*
	 * [概要]メソッドの作成
	 * [詳細]引数に整数を渡すと引数の回数分ランダムな数字を格納して、格納した値を返すメソッドを作成。
	 */
	// このクラスで使用できるメソッドを作成。引数をpeopleとし、戻り値にListを指定する。
	private static List<Integer> lottery(int people) {
		// ランダムクラスのインスタンスを生成。
		Random random = new Random();
		// int型の値を格納するListの初期化。変数名をnumsとする。
		List<Integer> nums = new ArrayList<Integer>();
		// for文による繰り返し。 カウント用の変数をiとしメソッドの引数の数だけ下記の処理を繰り返す。
		for(int i = 0; i < people; i++) {
			// ランダムに値を受け取る変数nを作成。 初期値を1とし、0~99までのランダムな数字を和算、結果1~100までのランダムな整数となる。
			int n = 1 + random.nextInt(99);
			// コンソールにランダムに受け取った値を出力。
			System.out.println(n);
			// List numsにnの値を追加する。
			nums.add(n);
		}
		// 戻り値にnumsを設定。
		return nums;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	/*
	 * [概要]メソッドの作成
	 * [詳細]メソッドにQ5の返り値を受取、平均値をコンソールに出力するためのメソッドを作成。
	 */
	// このクラスで使用可能なメソッドを作成し、引数にList型を指定。返り値をdouble型に指定する。
	private static double q5_avg(List<Integer> nums) {
		// Listの合計値を格納するための変数sumを初期化。
		double sum = 0;
		/*
		 * [概要]for文の作成
		 * [詳細]Listの要素数だけ変数sumに値を和算していく繰り返し処理を記述する。
		 */
		// カウント用の変数iを0で初期化し、引数に受け取ったリストの数だけ繰り返しを宣言。
		for(int i = 0; i < nums.size(); i++) {
			// 配列の値を順番に破算していく処理。合計値を変数sumに格納。
			sum += nums.get(i);
		}
		// double型の変数avgを宣言し、合計値をListの要素数で除算。平均値を算出する。
		double avg = (sum / nums.size());
		// 平均値をコンソールに出力する処理。
		System.out.println(avg);
		// 返り値の宣言。
		return avg;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	/*
	 * [概要]メソッドの作成。
	 * [詳細]引数にQ6で算出した平均値を受取、受け取った値が50以上ならばtrueを返すメソッドを作成する。
	 */
	// このクラスで使用できるメソッドの作成、返り値をboolean型に指定し、メソッド名をjudge、引数をdouble型に指定する。
	private static boolean judge(double avg) {
		// boolean型の変数jの作成。値を 50 <= avgとし、値が50以上であればtrueそうでなければfalseとなるようにする。
		boolean j = 50 <= avg;
		// コンソールに結果を表示する処理。
		System.out.println(j);
		// 返り値の宣言。
		return j;
	}
	
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1メソッドの呼び出し。
		msg("Hello JavaSE", 11) ;
		// Q2のメソッドの呼び出し。
		result(200, 400);
		// Q3のメソッドの呼び出し
		int[] num = {1, 3, 4, 5, 6};
		display(num);
		// Q4のメソッドの呼び出し。
		result(1.4, 5.2);
		// Q5のメソッドの呼び出し。
		List<Integer> nums  = lottery(3);
		// Q6のメソッドの呼び出し。
		double avg = q5_avg(nums);
		// Q7のメソッドの呼び出し
		boolean j = judge(avg);
	}
}