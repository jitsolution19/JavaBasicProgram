package javaPracticeProgram;

class Storm {
	protected double eyeRadius;
	protected double eyePositionX;
	protected double eyePositionY;

	public double getEyeRadius() {
		return eyeRadius;
	}

	public double getEyePositionX() {
		return eyePositionX;
	}

	public double getEyePositionY() {
		return eyePositionY;
	}
}

class RainStrom extends Storm {

	public RainStrom(double eyeRadius, double eyePositionX, double eyePositionY) {
		super.eyeRadius = eyeRadius;
		super.eyePositionX = eyePositionX;
		super.eyePositionY = eyePositionY;
	}

	public boolean isInEyeOfTheStorm(double positionX, double positionY) {
		double distance = Math
				.sqrt(Math.pow(positionX - getEyePositionX(), 2) + Math.pow(positionY - getEyePositionY(), 2));
		return distance < getEyeRadius();
	}

	public double amountOfRain() {
		return getEyeRadius() * 20;
	}
}

class SnowStorm extends Storm {

	private double amountOfSnow;

	public SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {
		super.eyeRadius = eyeRadius;
		super.eyePositionX = eyePositionX;
		super.eyePositionY = eyePositionY;
		this.amountOfSnow = amountOfSnow;
	}

	public double getAmountOfSnow() {
		return amountOfSnow;
	}

	public boolean isInEyeOfTheStorm(double positionX, double positionY) {
		double distance = Math
				.sqrt(Math.pow(positionX - getEyePositionX(), 2) + Math.pow(positionY - getEyePositionY(), 2));
		return distance < getEyeRadius();
	}
}

public class RainStromlogic {
	public static void main(String[] args) {

		RainStrom rs = new RainStrom(0, 0, 0);
		rs.amountOfRain();

		SnowStorm ss = new SnowStorm(0, 0, 0, 0);
		ss.getAmountOfSnow();
	}
}
