package Model;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Thematique {
    private String nom;

    /**
     * Constructeur de Thematique
     * @param nom
     */
    public Thematique(String nom) {

        this.nom = nom;
    }

    /**
     * Getter de nom
     * @return attribut nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return nom;
    }
}
