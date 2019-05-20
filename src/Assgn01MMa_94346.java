/**
 * The git repository: https://github.com/MarcosMarangoniDouglas/Assgn01MMa_94346
 * @author Marcos Marangoni
 * Student ID: 30029436
 */
public class Assgn01MMa_94346 {
	public static void main(String[] args) {
		System.out.println("Creating a sports car test");
		SportCar_MMa_94346 sportCar = new SportCar_MMa_94346();
		sportCar.setName("Ferrari");
		sportCar.setEngine("V12");
		sportCar.setMaxSpeed(350);
		sportCar.setColor("RED");
		sportCar.startEngine();
		System.out.println("The increment in speed used is 20, and the break is 10");
		System.out.println("TEST: Increase car speed without turbo");
		sportCar.speedCar(20);
		System.out.println("TEST: Increase car speed with turbo");
		sportCar.setTurbo(true);
		sportCar.speedCar(20);
		System.out.println("TEST: Decrease car speed with normal breaks");
		sportCar.applyBreak(10);
		System.out.println("TEST: Decrease car speed with ABS");
		sportCar.setAbs(true);
		sportCar.applyBreak(10);
		CarInterface carInterface = sportCar;
		System.out.println("TEST: Testing the interface to speed the sport car");
		carInterface.speedCar(20);
		System.out.println("TEST: Testing the interface to break the sport car");
		carInterface.applyBreak(20);
		
		System.out.println();
		
		System.out.println("Creating a commercial car test");
		CommercialCar_MMa_94346 commercialCar = new CommercialCar_MMa_94346();
		commercialCar.setName("CRV");
		commercialCar.setColor("BLACK");
		commercialCar.setEngine("V4");
		commercialCar.setMaxSpeed(200);
		commercialCar.startEngine();
		System.out.println("TEST: Cruise speed at 100km/h");
		commercialCar.enableCruiseMode(100);
		System.out.println("TEST: Disable cruise mode after acceleration");
		commercialCar.speedCar(10);
		System.out.println("TEST: Testing the speed limit");
		commercialCar.enableSpeedLimit(120);
		commercialCar.speedCar(20);
		commercialCar.speedCar(20);
		
		carInterface = commercialCar;
		System.out.println("TEST: Testing the interface to speed the commercial car");
		carInterface.speedCar(20);
		System.out.println("TEST: Testing the interface to break the commercial car");
		carInterface.applyBreak(20);
		
		
		
		
		
	}
}
