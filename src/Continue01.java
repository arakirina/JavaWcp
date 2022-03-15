
public class Continue01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if(count==2) {
				continue;
//				countが２の時だけ飛ばす
			}
			System.out.println("Continu"
					+ "e01="+count);
		}
	}
}
