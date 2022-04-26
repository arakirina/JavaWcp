package classMethod.human;

//アクセス修飾子

public class Human05 {
	private String name;
//	直接参照ができないようにprivateにしている
	private int age;
	
	public Human05() {
		name = "山田";
		age = 20;
	}
	
	public String getName() {
		return name;
//		getをつけることで、privateがついた変数をgetつければ参照できる
//		getNameいう名前を使えば、nameを返してくれる、というメソッド。
	}
	
	public int getAge() {
		return age;
	}
}
