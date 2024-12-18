package sample;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hello,World");
		int [] il1 = {1,2,3};
		int[] il2 = il1;
		System.out.println(il2[1]);
		il1[1] = 4;
		System.out.println(il2[1]);

	}

}
