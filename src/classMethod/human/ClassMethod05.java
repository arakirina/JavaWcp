package classMethod.human;

public class ClassMethod05 {
	public static void main (String[] args) {
		Human05 yamada = new Human05();

//		System.out.println("名前は"+yamada.name+"で、年齢は"+yamada.age+"です。");←nameとageはprivateのため、直接参照できない。
		System.out.println("名前は" + yamada.getName() + "で、年齢は" + yamada.getAge() + "です");
	}
}
