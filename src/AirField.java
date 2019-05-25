import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	protected List<Jet> jets;

	public AirField() {
		super();
		jets = sortJets();
	}

	public ArrayList<Jet> sortJets() {
		ArrayList<Jet> namef = new ArrayList<>();
		String fileName = "JetNames";
		try {
			FileReader fr;
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
//			int i = 0;
//			while ((line = br.readLine()) != null) {
//				++i;
//				if (br.readLine().contains("Fighter")) {
//				namef.add(line);
//				}
			while ((line = br.readLine()) != null) {
				Jet f = null;
				String[] jetRecord = line.split(", ");
				String type = jetRecord[0];
				String model = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);
				if (type.equals("Fighter")) {
					f = new FighterJet(type, model, speed, range, price);
				}
				if (type.equals("Cargo")) {
					f = new CargoPlane(type, model, speed, range, price);
				}
				if (type.equals("Turboprop")) {
					f = new TurboProp(type, model, speed, range, price);
				}

				System.out.println(f);
				namef.add(f);
			}
			System.out.println(namef);
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e1) {
			System.out.println("FileNotFoundException");

		}
		return namef;

	}

	public void listAllJets() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}

	}

	public void listAllCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}

	}

	public void fastestJet() {
		double fastest = 0;
		Jet o = null;
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastest) {
				o = jet;
				fastest = jet.getSpeed();

			}

		}
		System.out.println("The fastest jet is : ");
		System.out.println(o);
		o.getSpeedInMach();
	}

	public void listAllFighter() {
		for (Jet jet : jets) {
			if (jet instanceof Fight) {
				((Fight) jet).Dogfight();
			}
		}
	}

	public void longestRange() {
		int longest = 0;
		Jet l = null;
		for (Jet jet : jets) {
			if (jet.getRange() > longest) {
				l = jet;
				longest = jet.getRange();
			}
		}
	}

	public void fly() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void addJet(Scanner input) {
		Jet newJet = null;
		System.out.println("PLease enter the type of plane (Fighter) (Cargo) (TurboProp)");
		System.out.println("Please enter the type as the same as above ^");
		String type = input.next();
		System.out.println("Enter a model name for the jet: ");
		String model = input.next();
		System.out.println("Enter the speed of the jet in mph: ");
		double speed = input.nextDouble();
		System.out.println("Enter the range of the jet: ");
		int range = input.nextInt();
		System.out.println("Enter the price of the jet: ");
		long price = input.nextLong();

		if (type.equals("Fighter")) {
			newJet = new FighterJet(type, model, speed, range, price);
		} else if (type.equals("Cargo")) {
			newJet = new CargoPlane(type, model, speed, range, price);

		} else if (type.equals("TurboProp")) {
			newJet = new TurboProp(type, model, speed, range, price);

		} else {
			System.out.println("AH you must have meant a propeller plane (TurboProp)");
			newJet = new TurboProp(type, model, speed, range, price);
		}
		jets.add(newJet);
		System.out.println("This is the information of the jet you have added.");
		System.out.println(newJet);
	}
	public void removeJet(Scanner input) {
		
		System.out.println("Please select the plane you want to remove.");
		for(int i = 0; i < jets.size(); i++) {	
			System.out.println(i + " " + jets.get(i));
		}
		int choice = input.nextInt();
		jets.remove(choice);
	}
}
