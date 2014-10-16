package View;

import Controler.QuizzControler;
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

    public ListQCMVue(ArrayList<Qcm> list){
        super();
        build();
        loadList(list);
    }

    private void build() {
        setTitle("Liste des QCM existants");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel superPanel = new JPanel(new BorderLayout());
        panel = new JPanel(new OrientableFlowLayout(OrientableFlowLayout.VERTICAL));
        JScrollPane scrollPane = new JScrollPane(panel);
        superPanel.add(scrollPane, BorderLayout.CENTER);
        setContentPane(superPanel);
    }

    public void loadList(ArrayList<Qcm> list){
        for (Qcm qcm : list){
            addQcm(qcm);
        }
    }

    public void addQcm(Qcm qcm) {
        panel.add(new QcmVue(qcm).getPanel());
        setVisible(true);
    }
}
