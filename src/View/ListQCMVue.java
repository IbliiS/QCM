package View;

import Model.Qcm;
import sun.awt.OrientableFlowLayout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Fabien on 15/10/2014.
 */
public class ListQCMVue extends JFrame{

    JPanel panel;

    public ListQCMVue(){
        super();
        build();
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

    public void addQcm(QcmVue qcm) {
        panel.add(qcm.getPanel());
        setVisible(true);
    }
}
