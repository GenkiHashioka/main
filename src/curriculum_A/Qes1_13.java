package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/*
		 * [概要]ローカル変数の宣言
		 * [詳細]課題1に沿ってローカル変数を下記に宣言する。
		 */
		
		// バイト型変数の宣言
		byte byt;
		// 単整数型変数の宣言
		short s;
		// 整数型変数の宣言
		int i;
		// 長整数型変数の宣言
		long l;
		// 単精度浮動小数型変数の宣言
		float f;
		// 倍精度浮動小数型変数の宣言
		double w;
		// 文字型変数の宣言
		char chr;
		// 文字列型変数の宣言
		String str;
		// ブーリアン型変数の宣言
		boolean b;
		
		
		/*
		 * [概要]それぞれのローカル変数を初期化する処理
		 * [詳細]宣言した変数の値を初期化する。
		 */
		
		// byte型の変数の値を初期化する処理。
		byt = 0;
		// 短整数型の変数の値を初期化する処理。
		s = 0;
		// 整数型の変数の値を初期化する処理。
		i = 0;
		// 長整数型の変数の値を初期化する処理。
		l = 0L; 
		// 単精度浮動小数型の変数の値を初期化する処理。
		// f = 0;
		// 単精度浮動小数型の変数の初期値の修正。
		f = 0.0f;
		// 倍精度浮動小数型の変数の値を初期化する処理。
		// w = 0;
		// 倍精度浮動小数型の初期値の修正。
		w = 0.0d;
		// 文字型の変数の値を初期化する処理。
		// chr = 'あ';
		// 文字型の初期値の修正。
		chr = '\u0000';
		// 文字列型の変数の値を初期化する処理。
		// str = "こんにちは";
		// 文字列型の初期値の修正。
		str = null;
		// ブーリアン型の変数の値を初期化する処理。
		b = false;
		
		String str2 = "hello";
		
		
		/*
		 * [概要]変数に値を代入する処理。
		 * [詳細]課題3に沿って指定された値をそれぞれの変数に代入する。
		 */
		
		// バイト型変数への値の代入。
		byt = 10;
		// 短整数型変数への値の代入。
		s = 100;
		// 整数型変数への値の代入。
		i = 1000;
		// 長整数型変数への値の代入。
		l = 10000;
		// 単精度浮動小数型変数への値の代入。
		f = 9.5f;
		// 倍精度浮動小数型変数への値の代入。
		w = 10.5;
		// 文字型変数への値の代入。
		chr = 'a';
		// 文字列型変数への値の代入。
		str = "ハロー";
		// ブーリアン型変数への値の代入
		b = true;
		
		
		/*
		 * [概要]コンソール出力処理。
		 * [詳細]上記で作成した変数を使用し指定の通りコンソールに表示されるようにする。
		 */
		
		// コンソールに11110を出力する処理。
		System.out.println(byt + s + i + l);
		// コンソールに20を出力する処理。
		System.out.println(byt + byt);
		// コンソールにaハローtrueを出力する処理。
		System.out.println(chr + str + b);
		// 数字をすべて足しコンソールに11130を出力する処理。
		System.out.println(byt + s + i + l + f + w);
		//小数点以外の数字をすべて掛け、コンソールに10000000000を出力する処理。
		System.out.println(byt * s * i * l);
		// コンソールに0.105を出力する処理。
		System.out.println(w / s);
		// コンソールに-90を出力する処理。
		System.out.println(byt - s);
		
		
		/*
		 * [概要]プログラムの修正処理。
		 * [詳細]下記プログラムを実行したときハローJAVA43と出力されるように修正を行う。
		 */
		
		String num = "20";
		
		int num1 = 23;
		// numの値が文字列になっているため数値に変換する。
		int num2 = Integer.parseInt(num);
		
		//System.out.println("ハローJAVA" + (num + num1));
		
		// 変換後のコンソール出力処理。
		System.out.println("ハローJAVA" + (num1 + num2));
		
		
		/*
		 * [概要]人の情報を変数化する処理。
		 * [詳細]人の名前、年齢等を変数化する。
		 */
	
		// 名前を変数化する処理。
		String name = "山田 太郎";
		// 年齢を変数化する処理。
		int age = 18;
		// 身長を変数化する処理。
		float height = 168.5f;
		// 体重を変数化する処理。
		float weight = 62.2f;
		// 好物を変数化する処理。
		String ff = "寿司";
		
		/*
		 * [概要]情報をコンソールに出力する処理。
		 * [詳細]上記の変数を使用し、コンソールに自己紹介文を出力する。
		 */
		
		// 挨拶を出力する処理。
		System.out.println("初めまして" + name + "です");
		// 年齢紹介を出力する処理。
		System.out.println("年齢は" + age + "歳です" );
		// 身長の紹介を出力する処理。
		System.out.println("身長は" + height + "cmです");
		// 体重の紹介を出力する処理。
		System.out.println("体重は" + weight + "kgです");
		// 好物の紹介を出力する処理。
		System.out.println("好きな食べ物は" + ff + "です");
		
		/*
		 * [概要]BMIの情報を変数化する処理
		 * [詳細]BMIの計算式を変数化する。
		 */
		
		// bmi変数の宣言とbmi変数へ計算式を代入。
		float bmi = (weight / (height / s * height / s));
		
		/*
		 * [概要]BMIの情報をコンソールに出力する処理。
		 * [詳細]変数化したBMIの情報をコンソールに出力する。
		 */
		
		// BMIの情報紹介文をコンソールに出力する
		System.out.println("BMIは" + bmi + "です");
		
		/*
		 *  [概要]変数の再代入処理
		 *  [詳細]上記で宣言した変数に値を再代入する。
		 */
		
		// 変数nameに指定された値を再代入する。
		name = "鈴木 一郎";
		// 変数ageに指定された値を再代入する。
		age = 24;
		// 変数heightに指定された値を再代入する。
		height = 168.5f;
		// 変数weightに指定された値を再代入する。
		weight = 64.2f;
		// 変数ffに指定された値を再代入する。
		ff = "オムライス";
		// 変数bmiの再代入。
		bmi = (weight / (height / s * height / s));
		
		/*
		 * [概要]値をコンソールに出力する処理。
		 * [詳細]変更した値をコンソールに出力する。
		 */
		
		// 名前の出力。
		System.out.println("初めまして" + name + "です");
		// 年齢の出力。
		System.out.println("年齢は" + age + "歳です");
		// 身長の出力。
		System.out.println("身長は" + height + "cmです");
		// 体重の出力
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物の出力
		System.out.println("好きな食べ物は" + ff + "です");
		// BMIの出力 floorメソッドを使用して小数点第二位で数値を切り捨て。
		System.out.println("BMIは" + Math.floor(bmi * 10) / 10  + "です");
		
		/*
		 * [概要]上記で使用した値に数値を自己代入する処理。
		 * [詳細]年齢 身長 体重が指定された値になるように変数に自己代入する。
		 */
		
		// 年齢に24を足した値を変数に代入
		age += 24;
		// 身長に168.5を足した値を変数に代入
		height += 168.5f;
		// 体重に64.2を足した値を変数に代入
		weight += 64.2f;
		// 代入した値を使用してbmiを計算
		bmi = (weight / (height / s * height / s));
		
		
		/*
		 * [概要]コンソールに値を出力する処理。
		 * [詳細]コンソールに変更した値で自己紹介文を出力する。
		 */
		
		// 名前を出力する。
		System.out.println("初めまして" + name + "です");
		// 年齢を出力する。
		System.out.println("年齢は" + age + "歳です");
		// 身長を出力する。
		System.out.println("身長" + height + "cmです");
		// 体重を出力する。
		System.out.println("体重は" + weight + "kgです");
		// 好物を出力する。
		System.out.println("好きな食べ物は" + ff + "です");
		// bmiを出力する。ceilメソッドを使用し、小数点第2位で切り上げる。
		System.out.println("BMIは" + Math.ceil(bmi * 100) / 100 + "です");
		
		/*
		 * [概要] 値の再代入処理
		 * [詳細] 自己代入した値を元設定した値に戻す処理を行う
		 */
		
		// 年齢の修正
		age = 24;
		// 身長の修正
		height = 168.5f;
		// 体重の修正
		weight = 64.2f;
		
		/*
		 * [概要]年齢が25歳以上ならtrueが出力されるように処理
		 * [詳細]比較演算子を使用し、上記で使用した年齢が25歳以上ならコンソールにtrueが出力されるようにする
		 */
		
		// 比較演算子を使用し、コンソールに25歳以上ならtrueが出力されるように処理
		System.out.println(age >= 25);
		
		/*
		 * [概要]年齢　身長　体重を 文字列型に変換する処理
		 * [詳細]年齢　身長　体重を強制型変換を用いて文字列型に変換する
		 */
		
		// 変数ageを文字列に変換する処理
		String age1 =String.valueOf(age);
		// 変数heightを文字列に変換する処理
		String height1 = String.valueOf(height);
		// 変数weightを文字列に変換する処理
		String weight1 = String.valueOf(weight);
		
		/*
		 * [概要]コンソールに出力する処理
		 * [詳細]変換した文字列を繋げてコンソールに出力する
		 */
		
		//年齢　身長　体重を繋げてコンソールに出力
		System.out.println(age1 + height1 + weight1);
		
		/*
		 * [概要]文字列型から整数型に変換する処理
		 * [詳細]変換した年齢、身長を整数型に変換する
		 */
		
		// age1を整数型に変換
		int age2 = Integer.parseInt(age1);
		// height1を整数型に変換
		float height2 = Float.parseFloat(height1);
		
		/*
		 * [概要]コンソール出力処理
		 * [詳細]変換した変数をコンソールに出力する。
		 */
		
		// 年齢の出力
		System.out.println(age2);
		// 身長の出力
		System.out.println(height2);
		
		/*
		 * [概要]年齢が25もしくは身長が160以上であればtrueを出力する処理
		 * [詳細]論理演算子を使用して年齢が25もしくは身長が160以上であればtrueを出力するようにする
		 */
		
		// 論理和と比較演算子を使用しコンソールにtrue/falseを結果に表示する処理
		System.out.println(age2 == 25 || height2 >= 160);
	}

}
