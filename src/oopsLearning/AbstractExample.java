package oopsLearning;

import org.junit.Test;

abstract class Bike {

	public int getDistance(int EndReading, int startingReading) {
		int totalDistance = EndReading - startingReading;
		return totalDistance;
	}

	public double fuelInfo(double Price, double d) {
		return (Price / d);
	}

	abstract public void getAverage(int distance, double consumedFuel);

}

public class AbstractExample extends Bike {

	@Override
	public void getAverage(int distance, double consumedFuel) {

		double dis = (double) distance;
		double average = dis / consumedFuel;
		System.out.println("Average of BIKE is :: " + average);
	}

	@Test
	public void Enfield_Average() {
		AbstractExample obj = new AbstractExample();
		int distance = obj.getDistance(39423, 38940);
		double fuel = obj.fuelInfo(1200, 74.69);
		obj.getAverage(distance, fuel);

	}
}
