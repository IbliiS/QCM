import Model.Qcm;
import Model.Question;
import Model.Reponse;
import Model.Thematique;
import View.AdminAccueilVue;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class main {

    /**
     * L'exécutable du projet
     * @param args
     */
    public static void main(String[] args){
        Thematique theme = new Thematique("info");

        ArrayList<Question> liste = new ArrayList<Question>();
        ArrayList<Reponse> rep = new ArrayList<Reponse>();
        Reponse r1 = new Reponse("Caca", false);
        Reponse r2 = new Reponse("aaa", true);
        rep.add(r1);
        rep.add(r2);
        Question q1 = new Question(rep,4,theme,"comment ?");

        Reponse r3 = new Reponse("MrHanckey", false);
        Reponse r4 = new Reponse("bb", true);
        rep.clear();
        rep.add(r3);
        rep.add(r4);
        Question q2 = new Question(rep, 6, theme, "couleur ?");
        liste.add(q1);
        liste.add(q2);

        Qcm m = new Qcm(liste, theme);
        System.out.print(m.toString());

        AdminAccueilVue adminAccueilVue = new AdminAccueilVue();
        adminAccueilVue.setVisible(true);
    }
}
