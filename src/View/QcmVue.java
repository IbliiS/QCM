package View;

import Model.Qcm;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Fabien on 15/10/2014.
 */
public class QcmVue {

    private JPanel panel;

    /**
     * Crée un Jpanel pour un qcm donné
     * @param qcm
     */
    public QcmVue(Qcm qcm){
        panel = new JPanel(new GridLayout(4,2));

        JLabel titre = new JLabel("Titre : "+qcm.getTitre());
        JLabel thematique = new JLabel("Thematique : "+qcm.getThematique());
        JLabel difficulte = new JLabel("Difficulte : "+String.valueOf(qcm.getDifficulte()));
        JLabel nbQuestion = new JLabel(String.valueOf(qcm.nbQuestion())+" questions");

        JButton lancer = new JButton("Lancer");
        JButton voir = new JButton("Voir");
        JButton modifier = new JButton("Modifier");

        panel.add(titre);
        panel.add(lancer);
        panel.add(thematique);
        panel.add(voir);
        panel.add(difficulte);
        panel.add(modifier);
        panel.add(nbQuestion);
    }

    /**
     * Getter du Jpanel
     * @return : le panel du qcm
     */
    public JPanel getPanel() {
        return panel;
    }
}
