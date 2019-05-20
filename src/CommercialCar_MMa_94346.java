
public class CommercialCar_MMa_94346 extends Car_MMa_94346  {
	private boolean cruiseEnabled, speedLimitEnabled;
	private int speedLimit = 0; 
	
	public void enableCruiseMode(int cruiseSpeed) {
		if(cruiseSpeed < 40) {
			System.out.println("The minimum cruise speed is 40km/h");
			return;
		}
		this.cruiseEnabled = true;
		setSpeed(cruiseSpeed);
	}
	
	private void disableCruiseMode() {
		cruiseEnabled = false;
		System.out.println("Disabled cruise mode");
	}
	
	public void enableSpeedLimit(int speedLimit) {
		if(speedLimit < 40 || speedLimit > getMaxSpeed()) {
			System.out.println("The limit speed should be bigger than 40km/h and smaller than the maximum car speed");
			return;
		}
		if(getSpeed() > speedLimit) setSpeed(speedLimit);
		this.speedLimit = speedLimit;
		this.speedLimitEnabled = true;
	}
	
	public void disableSpeedLimit() {
		this.speedLimitEnabled = false;
	}
	
	@Override
	public void speedCar(int increment) {
		if(cruiseEnabled) disableCruiseMode();
		if(speedLimitEnabled) {
			if(getSpeed() + increment >= this.speedLimit) {
				increment = this.speedLimit - getSpeed();
			} else if (getSpeed() == this.speedLimit) {
				System.out.println("Car is at the speed limit");
			}
		}
		super.speedCar(increment);
	}
	
	@Override
	public void applyBreak(int decrement) {
		if(cruiseEnabled) disableCruiseMode();
		super.applyBreak(decrement);
	}
}
