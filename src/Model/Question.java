package Model;

import java.util.ArrayList;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Question {

    private ArrayList<Reponse> reponses;
    private int timer;
    private Thematique thematique;
    private String question;

    /**
     * Constructeur de la classe
     * @param reponses
     * @param timer
     * @param thematique
     * @param question
     */
    public Question(ArrayList<Reponse> reponses, int timer, Thematique thematique, String question) {
        this.reponses = reponses;
        this.timer = timer;
        this.thematique = thematique;
        this.question = question;
    }

    /**
     * Getter des réponses
     * @return : la liste de réponses
     */
    public ArrayList<Reponse> getReponses() {
        return reponses;
    }

    /**
     * Setter des réponses
     * @param reponses
     */
    public void setReponses(ArrayList<Reponse> reponses) {
        this.reponses = reponses;
    }

    /**
     * Getter du timer
     * @return : la durée du timer
     */
    public int getTimer() {
        return timer;
    }

    /**
     * Setter du timer
     * @param timer
     */
    public void setTimer(int timer) {
        this.timer = timer;
    }

    /**
     * Getter de la thématique
     * @return : la thématique de la question
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
     * Getter du texte de la question
     * @return : le texte de la question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Setter du texte de la question
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Permet l'affichage des valeurs des atributs de la question
     * @return : les valeurs des attributs de la question
     */
    @Override
    public String toString() {
        return "\n Question{" +
                "reponses=" + reponses +
                ", timer=" + timer +
                ", thematique=" + thematique +
                ", question='" + question + '\'' +
                '}';
    }
}
