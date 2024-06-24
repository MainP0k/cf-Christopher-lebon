/**
 * Classe principale pour exécuter l'application de l'orchestre.
 */
public class App {
    /**
     * Méthode principale pour exécuter l'application.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument violon = new Violon();
        Instrument batterie = new Batterie();

        Musicien pianiste = new Pianiste(piano);
        Musicien violoniste = new Violoniste(violon);
        Musicien batteur = new Batteur(batterie);

        Orchestre orchestre = new Orchestre();
        orchestre.ajouterMusicien(pianiste);
        orchestre.ajouterMusicien(violoniste);
        orchestre.ajouterMusicien(batteur);

        orchestre.jouer();
    }
}
