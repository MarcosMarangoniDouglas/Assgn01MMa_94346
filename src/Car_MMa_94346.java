
public class Car_MMa_94346 {
	private String color, engine, name;
	private int speed, maxSpeed;
	private boolean engineStarted;
	
	public Car_MMa_94346() {
		this.name = "";
		this.color = "";
		this.engine = "";
		this.speed = 0;
		this.maxSpeed = 0;
		this.engineStarted = false;
	}
	
	public Car_MMa_94346(String name, String color, String engine, int speed, int acceleration, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.engine = engine;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed <= maxSpeed && speed >= 0) {
			this.speed = speed;	
			System.out.println("Actual speed: " + this.speed + " km/h");
		}
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public void startEngine() {
		this.engineStarted = true;
		System.out.println("Engine started");
	}
	/**
	 * Increses the car speed based on the increment.
	 * @param increment
	 */
	public void speedCar(int increment) {
		if(!this.engineStarted) {
			System.out.println("Start the car before speeding it up!");
			return;
		}
		this.setSpeed(this.speed + increment);
	}
	
	public void applyBreak(int decrement) {
		if(!this.engineStarted) {
			System.out.println("Start the car before trying to break the car!");
			return;
		}
		if(this.speed <= 0) {
			System.out.println("Car is already stoped");
			return;
		}
		if(this.speed - decrement <= 0) this.setSpeed(0);
		else this.setSpeed(this.speed - decrement);
	}
	
	
}
