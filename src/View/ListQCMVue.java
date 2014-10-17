package View;

import Model.Qcm;
import sun.awt.OrientableFlowLayout;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Fabien on 15/10/2014.
 */
public class ListQCMVue extends JFrame{

    private JPanel panel;
    private JScrollPane scrollPane;
    private ArrayList<QcmVue> liste;

    public ListQCMVue(ArrayList<Qcm> list){
        super();
        liste = new ArrayList<QcmVue>();
        build();
        loadList(list);
    }

    private void build() {
        setTitle("Liste des QCM existants");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    public Container buildContentPane(){
        JPanel superPanel = new JPanel(new BorderLayout());
        panel = new JPanel(new OrientableFlowLayout(OrientableFlowLayout.VERTICAL));
        scrollPane = new JScrollPane(panel);
        superPanel.add(scrollPane, BorderLayout.CENTER);
        return superPanel;
    }
    public void loadList(ArrayList<Qcm> list){
        for (Qcm qcm : list){
            addQcm(qcm);
        }
    }

    public void addQcm(Qcm qcm) {
        panel.add(new QcmVue(qcm).getPanel());
        liste.add(new QcmVue(qcm));
    }

    public void refresh() {
        this.revalidate();
    }

    public void addQuestion(int id, int i) {
        for (QcmVue q : liste){
            if (q.getId() == id){
                q.setNbQuestion(i);
                System.out.println(i);
            }
        }
    }
}
