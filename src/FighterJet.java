
public class FighterJet extends Jet implements Fight {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	@Override
	public void Dogfight() {
		System.out.println(this.getModel() + " \n are all prepared for battle.");
	}

}
