//main method

public class VDemo {

	public static void main(String args[]) {

		Vehicle vehicle[] = new Vehicle[3];// an array with vehicle class

		vehicle[0] = new TwoWheeler();// array which stores the instance of sub class twowheeler
		vehicle[1] = new ThreeWheeler();// array which stores the instance of sub class threewheeler
		vehicle[2] = new FourWheeler();// array which stores the instance of sub classfourwheeler

		// calls the start function only if there is a class threewheeler
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				vehicle[i].start();
			}
		}
	}
}
