import Prog1Tools.IOTools;

public class Umrechnung {

	public static void main(String[] args) {

		int m = 1, dezimal;
		long binaer = 0;
		
		dezimal = IOTools.readShort("Geben Sie eine Zahl im dezimalen System ein: ");
		
		while (dezimal > 0) {
			
			binaer = binaer + (dezimal % 2) * m;
			dezimal = Math.round(dezimal / 2);
			m = m * 10;
			
		}
		System.out.println(binaer);
	}

}
