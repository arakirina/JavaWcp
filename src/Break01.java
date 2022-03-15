
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
//			countが２になったとき終了させる
			System.out.println("Break01="+count);
		}
	}
}
