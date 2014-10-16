package Controler;

import Model.ListQCMModel;
import Model.Qcm;
import Model.Question;
import Model.Thematique;
import View.AdminAccueilVue;
import View.ListQCMVue;

import java.util.ArrayList;

/**
 * Created by Fabien on 15/10/2014.
 */
public class QuizzControler {
    private ListQCMModel model;
    private AdminAccueilVue vue;
    private ListQCMVue listVue;

    public QuizzControler(ListQCMModel l) {
        model = l;
        vue = new AdminAccueilVue(this);
        vue.setVisible(true);
        listVue = new ListQCMVue(model.getList());
    }

    public ListQCMModel getModel() {
        return model;
    }

    public void addQcm(String titre, String thematique, int difficulte){
        Qcm qcm = new Qcm(titre, new ArrayList<Question>(),new Thematique(thematique), difficulte);
        model.addQcm(qcm);
        listVue.addQcm(qcm);
        listVue.refresh();
    }

    public ListQCMVue getListVue() {
        return listVue;
    }
}