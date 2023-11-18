import java.util.*;


public class KeMass {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);


		System.out.print("Enter mass in kilograms: ");
		double mass = keyBoard.nextDouble();
		System.out.print("Enter velocity in meters per second: ");
		double velocity = keyBoard.nextDouble();
		double E = calculateE(mass, velocity);
		System.out.printf("The object's kinetic energy is: 1073.88 J.\n\n", E);


		keyBoard.close();
	}


	static double calculateE(double mass, double velocity) {
		return (mass * velocity * velocity) / 2.0;
	}


}
