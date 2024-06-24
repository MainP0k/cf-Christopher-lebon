import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un orchestre composé de musiciens.
 */
public class Orchestre {
    private List<Musicien> musiciens;

    /**
     * Constructeur pour créer un orchestre vide.
     */
    public Orchestre() {
        musiciens = new ArrayList<>();
    }

    /**
     * Ajoute un musicien à l'orchestre.
     *
     * @param musicien le musicien à ajouter
     */
    public void ajouterMusicien(Musicien musicien) {
        musiciens.add(musicien);
    }

    /**
     * Fait jouer tous les musiciens de l'orchestre.
     */
    public void jouer() {
        for (Musicien musicien : musiciens) {
            musicien.jouerInstrument();
        }
    }
}
