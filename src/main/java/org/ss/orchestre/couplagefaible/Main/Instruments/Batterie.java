/**
 * Classe représentant une batterie, implémentant l'interface Instrument.
 */
public class Batterie implements Instrument {
    /**
     * Joue un rythme à la batterie.
     */
    @Override
    public void jouer() {
        System.out.println("La batterie joue un rythme.");
    }
}
