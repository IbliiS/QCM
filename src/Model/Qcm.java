package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Qcm {

    public static int ID = 0;
    private int id;
    private String titre;
    private ArrayList<Question> qcm;
    private Thematique thematique;
    private int difficulte;

    /**
     * Constructeur par défaut
     */
    public Qcm() {
        id = ID;
        titre = "";
        qcm = new ArrayList<Question>();
        thematique = new Thematique("");
        difficulte = 1;
        ID++;
    }

    /**
     * Constructeur de classe
     * @param titre
     * @param qcm
     * @param thematique
     * @param difficulte
     */
    public Qcm(String titre, ArrayList<Question> qcm, Thematique thematique, int difficulte) {
        id = ID;
        this.titre = titre;
        this.qcm = qcm;
        this.thematique = thematique;
        this.difficulte = difficulte;
        ID++;
    }

    public void addQuestion(Question question) {
        qcm.add(question);
    }

    /**
     * Donne le nombre de question du qcm
     * @return : la taile de la liste de questions.
     */
    public int nbQuestion(){
        return qcm.size();
    }

    /**
     * Getter du titre
     * @return : le titre du qcm
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter du titre
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
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
     * Getter de difficulte
     * @return : la difficulte deu quizz
     */
    public int getDifficulte() {
        return difficulte;
    }

    /**
     * Setter de difficulte
     * @param difficulte
     */
    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    /**
     * Getter de l'id
     * @return : l'id unique du qcm
     */
    public int getId() {
        return id;
    }

    /**
     * Permet l'affichage des valeurs des atributs du QCM
     * @return : les valeurs des attributs du QCM
     */
    @Override
    public String toString() {
        return "Qcm{" +
                "id="+id+
                ", titre='" + titre + '\'' +
                ", qcm=" + qcm +
                ", thematique=" + thematique +
                ", difficulte=" + difficulte +
                "}\n";
    }
}
