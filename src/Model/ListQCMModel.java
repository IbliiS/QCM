package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fabien on 15/10/2014.
 */
public class ListQCMModel {
    private ArrayList<Qcm> list;

    public ListQCMModel(){
        list = new ArrayList<Qcm>();
    }

    public void addQcm(Qcm qcm){
        list.add(qcm);
        System.out.println(toString());
    }

    /**
     * Getter de la liste
     * @return : return la liste des qcm existants
     */
    public ArrayList<Qcm> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ListQCMModel{" +
                "list=" + list +
                '}';
    }
}
