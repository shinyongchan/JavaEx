//ch4_ex3
class Car {
	private String color = null ;
	private static int carcount, redcount = 0;
	
	public Car (String color) {
		this.color = color ;
		carcount = carcount+1;
		if ("red" == this.color || "RED" == this.color)
			redcount = redcount +1;
	}
	public static int getNumOfCar() {
		return carcount ;
	}
	public static int getNumOfRedCar() {
		return redcount ;
	}
}


public class ExCh4 {

	
	public static void main(String[] args) {
		
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
