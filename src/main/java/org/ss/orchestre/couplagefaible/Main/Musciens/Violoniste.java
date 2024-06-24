/**
 * Classe représentant un violoniste, implémentant l'interface Musicien.
 */
public class Violoniste implements Musicien {
	private Instrument instrument;

	/**
	 * Constructeur pour créer un violoniste avec un instrument.
	 *
	 * @param instrument l'instrument que le violoniste va jouer
	 */
	public Violoniste(Instrument instrument) {
		this.instrument = instrument;
	}

	/**
	 * Joue de l'instrument du violoniste.
	 */
	@Override
	public void jouerInstrument() {
		instrument.jouer();
	}
}
