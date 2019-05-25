import java.util.Scanner;

public class JetsApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JetsApp ja = new JetsApp();
		AirField field = new AirField();
		ja.run(input, field);

	}

	public void run(Scanner input, AirField field) {
		boolean on = true;
		do {
			System.out.println("Welcome to cheap planes. What would you like to do?");
			System.out.println("1.List fleet");
			System.out.println("2.Fly all jets");
			System.out.println("3.View fastest jet");
			System.out.println("4.View jet with longest range");
			System.out.println("5.Load all Cargo Jets");
			System.out.println("6.Dogfight!");
			System.out.println("7.Add a jet to Fleet");
			System.out.println("8.Remove a jet from Fleet");
			System.out.println("9.Quit");
			int select = input.nextInt();

			switch (select) {
			case 1:
				field.listAllJets();
				break;
			case 2:
				field.fly();
				break;
			case 3:
				field.fastestJet();
				break;
			case 4:
				field.longestRange();
				break;
			case 5:
				field.listAllCargo();
				break;
			case 6:
				field.listAllFighter();
				break;
			case 7:
				field.addJet(input);
				break;
			case 8:
				field.removeJet(input);
				break;
			case 9:
				System.out.println("Thanks for using cheap planes. We hope to see you again. ");
				on = false;
				break;
			default:
			}
		} while (on);
	}
}
