
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
//		length=長さ
		
		string1 = "";
		System.out.println(string1);
//		空文字を出力
		
		string1 = null;
		System.out.println(string1 + "の文字数：" + string1.length() );
//		nullの変数を参照するとNullpointerExceptionのエラー
	}
}
