/**
 * Classe représentant un batteur, implémentant l'interface Musicien.
 */
public class Batteur implements Musicien {
    private Instrument instrument;

    /**
     * Constructeur pour créer un batteur avec un instrument.
     *
     * @param instrument l'instrument que le batteur va jouer
     */
    public Batteur(Instrument instrument) {
        this.instrument = instrument;
    }

    /**
     * Joue de l'instrument du batteur.
     */
    @Override
    public void jouerInstrument() {
        instrument.jouer();
    }
}
