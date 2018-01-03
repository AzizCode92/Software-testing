package examples;

public class Lift {

	private int topFloor;
	private int currentFloor = 0; // default
	private int capacity = 10; // default
	private int numRiders = 0; // default

	public Lift(int highestFloor) {
		topFloor = highestFloor;
	}

	public Lift(int highestFloor, int maxRiders) {
		this(highestFloor);
		capacity = maxRiders;
	}

	public int getTopFloor() {
		return topFloor;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNumRiders() {
		return numRiders;
	}

	public boolean isFull() {
		return numRiders == capacity;
	}

	/**
	 * Changed compared to first lab session !
	 * 
	 * @param numEntering
	 * @throws IllegalArgumentException
	 */
	public void addRiders(int numEntering) throws IllegalArgumentException {
		if (numRiders + numEntering <= capacity) {
			numRiders = numRiders + numEntering;
		} else {
			throw new IllegalArgumentException(
					"You cannot add more riders than the ones the lift can carry (" + capacity + ")!");
		}
	}

	/**
	 * New compared to first lab session !
	 * 
	 * @param numEntering
	 * @throws IllegalArgumentException
	 */
	public void removeRiders(int numExiting) throws IllegalArgumentException {
		if (numRiders - numExiting >= 0) {
			numRiders = numRiders - numExiting;
		} else {
			throw new IllegalArgumentException(
					"You cannot remove more riders than the one currently inside the lift (" + numRiders + ")!");
		}

	}

	public void goUp() {
		if (currentFloor < topFloor)
			currentFloor++;
	}

	public void goDown() {
		if (currentFloor > 0)
			currentFloor--;
	}

	public void call(int floor) {
		if (floor >= 0 && floor <= topFloor) {
			while (floor != currentFloor) {
				if (floor > currentFloor)
					goUp();
				else
					goDown();
			}
		}
	}
}
