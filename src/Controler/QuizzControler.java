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

    public ListQCMVue getListVue() {
        return listVue;
    }

    public void addQcm(Qcm qcm){
        model.addQcm(qcm);
        listVue.addQcm(qcm);
        listVue.refresh();
    }

   public void addQuestion(Qcm qcm, Question question){
        for (Qcm q : model.getList()){
            //System.out.println(q.getId() == qcm.getId());
            if (q.getId() == qcm.getId()){
                q.addQuestion(question);
                listVue.addQuestion(q.getId(), q.nbQuestion());
                listVue.refresh();
                //System.out.println(q.getQcm().size());
            }
        }
       //System.out.println("Ajout :::::::::::::::"+model.toString());
   }
}