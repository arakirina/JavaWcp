
public class Chapter09 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
//		fuelCost = 燃費コスト
		double  fuelAmount = 55.0;
//		fuelAmount = 燃料量
		
		Car car = new Car(fuelCost, fuelAmount);
		
		car.move(20);
		System.out.println("残量は" + car.getFuelAmount() + "です");
	}
}
