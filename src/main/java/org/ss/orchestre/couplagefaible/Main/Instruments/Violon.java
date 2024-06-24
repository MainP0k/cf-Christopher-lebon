/**
 * Classe représentant un violon, implémentant l'interface Instrument.
 */
public class Violon implements Instrument {
	/**
	 * Joue une mélodie au violon.
	 */
	@Override
	public void jouer() {
		System.out.println("Le violon joue une mélodie.");
	}
}
