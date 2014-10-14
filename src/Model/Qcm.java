package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Qcm {

    private ArrayList<Question> qcm;
    private Thematique thematique;

    public Qcm(ArrayList<Question> qcm, Thematique thematique) {
        this.qcm = qcm;
        this.thematique = thematique;
    }

    public ArrayList<Question> getQcm() {
        return qcm;
    }

    public void setQcm(ArrayList<Question> qcm) {
        this.qcm = qcm;
    }

    public Thematique getThematique() {
        return thematique;
    }

    public void setThematique(Thematique thematique) {
        this.thematique = thematique;
    }

    @Override
    public String toString() {
        return "Qcm{" +
                "qcm=" + qcm +
                ", thematique=" + thematique +
                '}';
    }
}
