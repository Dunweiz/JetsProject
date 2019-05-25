
public class FighterJet extends Jet {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public static void fight() {
		System.out.println("*Pew* *PEW* *Boom* *pew*");
	}
}
