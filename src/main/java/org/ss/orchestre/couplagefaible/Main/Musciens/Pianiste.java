/**
 * Classe représentant un pianiste, implémentant l'interface Musicien.
 */
public class Pianiste implements Musicien {
	private Instrument instrument;

	/**
	 * Constructeur pour créer un pianiste avec un instrument.
	 *
	 * @param instrument l'instrument que le pianiste va jouer
	 */
	public Pianiste(Instrument instrument) {
		this.instrument = instrument;
	}

	/**
	 * Joue de l'instrument du pianiste.
	 */
	@Override
	public void jouerInstrument() {
		instrument.jouer();
	}
}
