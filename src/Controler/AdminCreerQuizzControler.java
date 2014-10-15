package Controler;

import Model.ListQCMModel;
import Model.Qcm;
import Model.Question;
import Model.Thematique;
import View.ListQCMVue;
import View.QcmVue;

import java.util.ArrayList;

/**
 * Created by Fabien on 15/10/2014.
 */
public class AdminCreerQuizzControler {
    private ListQCMModel model;
    private ListQCMVue vue;

    public AdminCreerQuizzControler() {
        model = new ListQCMModel();
        vue = new ListQCMVue();
    }

    public void addQcm(String titre, String thematique, int difficulte){
        Qcm qcm = new Qcm(titre, new ArrayList<Question>(),new Thematique(thematique), difficulte);
        model.addQcm(qcm);
        vue.addQcm(new QcmVue(qcm));
    }
}
