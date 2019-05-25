import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class AirField {
	protected List jets;

	public AirField(List jets) {
		super();
		this.jets = jets;
	}

	public static void main(String[] args) {
		sortJetsFighter();
	}

	public static TreeSet<String> sortJetsFighter() {
		TreeSet<String> namef = new TreeSet<>();
		String fileName = "JetNames";
		try {
			FileReader fr;
			fr = new FileReader(fileName);
			String[] jetRecord = null;
			BufferedReader br = new BufferedReader(fr);
			String line;
			int i = 0;
//			while ((line = br.readLine()) != null) {
//				++i;
//				if (br.readLine().contains("Fighter")) {
//				namef.add(line);
//				}
			while ((line = br.readLine()) != null) {
				jetRecord = line.split(", ");
				String type = jetRecord[0];
				String model = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);
				Jet f = new Jet(type, model, speed, range, price);
				System.out.println(f.toString());
			}
			System.out.println(jetRecord);
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e1) {
			System.out.println("FileNotFoundException");

		}
		return namef;

	}

//	public listAllJets(list jetRecord) {

}
