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


    public Question(ArrayList<Reponse> reponses, int timer, Thematique thematique, String question) {
        this.reponses = reponses;
        this.timer = timer;
        this.thematique = thematique;
        this.question = question;
    }

    public ArrayList<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(ArrayList<Reponse> reponses) {
        this.reponses = reponses;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public Thematique getThematique() {
        return thematique;
    }

    public void setThematique(Thematique thematique) {
        this.thematique = thematique;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

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
