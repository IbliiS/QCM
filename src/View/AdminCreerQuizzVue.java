package View;

import Controler.AdminCreerQuizzControler;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Fabien on 14/10/2014.
 */
public class AdminCreerQuizzVue extends JFrame {
    private String tableauThematique[] = {"Non défini", "theme1", "theme2", "theme3" , "theme4"};
    private JComboBox<String> thematique;
    private JTextField titre;
    private AdminCreerQuizzControler controler;
    private JRadioButton b1, b2, b3, b4;

    /**
     * Constructeur de classe
     */
    public AdminCreerQuizzVue(AdminCreerQuizzControler ctrl){
        super();
        controler = ctrl;
        build();
    }

    /**
     * Défini les paramètres de la JFrame
     */
    private void build() {
        setTitle("Création de quizz");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    /**
     * Défini les éléments du JPanel à afficher dans la JFrame
     * @return : le JPanel de la page de création d'un QCM
     */
    private Container buildContentPane() {
        JPanel superPanel = new JPanel(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(3,2));
        Border border = LineBorder.createGrayLineBorder();

        JLabel labelTitre = new JLabel("Titre du QCM");
        labelTitre.setHorizontalAlignment(JLabel.CENTER);
        labelTitre.setBorder(border);
        titre = new JTextField();

        JLabel labelThematique = new JLabel("Thematique");
        labelThematique.setHorizontalAlignment(JLabel.CENTER);
        labelThematique.setBorder(border);
        thematique = new JComboBox<String>(tableauThematique);


        JLabel labelDifficulte = new JLabel("Difficulté");
        labelDifficulte.setHorizontalAlignment(JLabel.CENTER);
        labelDifficulte.setBorder(border);
        ButtonGroup group = new ButtonGroup();
        b1 = new JRadioButton("Facile");
        b2 = new JRadioButton("Moyen");
        b3 = new JRadioButton("Difficile");
        b4 = new JRadioButton("Impossible");
        b2.setSelected(true);

        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);

        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(b1);
        radioPanel.add(b2);
        radioPanel.add(b3);
        radioPanel.add(b4);

        panel.add(labelTitre);
        panel.add(titre);
        panel.add(labelThematique);
        panel.add(thematique);
        panel.add(labelDifficulte);
        panel.add(radioPanel);

        JButton suivant = new JButton("Suivant");
        suivant.addActionListener(new ButtonListener());

        superPanel.add(panel, BorderLayout.CENTER);
        superPanel.add(suivant, BorderLayout.SOUTH);
        return superPanel;
    }

    /**
     * Le listener du bouton "suivant"
     */
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (estCorrect()) {
                int difficulte = 1;
                if (b1.isSelected())
                    difficulte = 0;
                if (b2.isSelected())
                    difficulte = 1;
                if (b3.isSelected())
                    difficulte = 2;
                if (b4.isSelected())
                    difficulte = 3;
                controler.addQcm(titre.getText(), thematique.getSelectedItem().toString(), difficulte);

            }
        }
    }

    /**
     * Vérifie que les champs sont renseignés
     * @return : la validation du formulaire ou non
     */
    private boolean estCorrect() {
        boolean b = true;
        if (titre.getText().equals("")) {
            titre.setBackground(Color.RED);
            b = false;
        } else {
            titre.setBackground(Color.WHITE);
        }
        if (thematique.getSelectedIndex() == 0) {
            thematique.setBackground(Color.RED);
            b = false;
        } else {
            thematique.setBackground(Color.WHITE);
        }
        return b;
    }
}
