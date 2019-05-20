
public class SportCar_MMa_94346 extends Car_MMa_94346 implements CarInterface {
	private boolean turbo, abs;
	
	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}
	
	@Override
	public void startEngine() {
		super.startEngine();
	}
	
	@Override
	public void speedCar(int increment) {
		if(turbo) {
			increment += 10;
		}
		super.speedCar(increment);
	}

	@Override
	public void applyBreak(int decrement) {
		if(abs) {
			decrement -= 10;
		}
		super.applyBreak(decrement);
	}
}
