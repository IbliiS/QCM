package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Qcm {

    private ArrayList<Question> qcm;
    private Thematique thematique;

    /**
     * Constructeur de classe
     * @param qcm
     * @param thematique
     */
    public Qcm(ArrayList<Question> qcm, Thematique thematique) {
        this.qcm = qcm;
        this.thematique = thematique;
    }

    /**
     * Getter de la liste de Questions
     * @return : la liste des Questions
     */
    public ArrayList<Question> getQcm() {
        return qcm;
    }

    /**
     * Setter de la liste des Questions
     * @param qcm
     */
    public void setQcm(ArrayList<Question> qcm) {
        this.qcm = qcm;
    }

    /**
     * Getter de la thématique
     * @return : la thématique du QCM
     */
    public Thematique getThematique() {
        return thematique;
    }

    /**
     * Setter de la thématique
     * @param thematique
     */
    public void setThematique(Thematique thematique) {
        this.thematique = thematique;
    }

    /**
     * Permet l'affichage des valeurs des atributs du QCM
     * @return : les valeurs des attributs du QCM
     */
    @Override
    public String toString() {
        return "Qcm{" +
                "qcm=" + qcm +
                ", thematique=" + thematique +
                '}';
    }
}
