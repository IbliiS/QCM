package View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by Fabien on 14/10/2014.
 */
public class AdminCreerQuizz extends JFrame {
    String tableauThematique[] = {"Non défini", "theme1", "theme2", "theme3" , "theme4"};

    /**
     * Constructeur de classe
     */
    public AdminCreerQuizz(){
        super();
        build();
    }

    /**
     * Défini les paramètres de la JFrame
     */
    private void build() {
        setTitle("Création de quizz");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    /**
     * Défini les éléments du JPanel à afficher dans la JFrame
     * @return : le JPanel de la page de création d'un QCM
     */
    private Container buildContentPane() {
        JPanel panel = new JPanel(new GridLayout(3,2));
        Border border = LineBorder.createGrayLineBorder();

        JLabel labelTitre = new JLabel("Titre du QCM");
        labelTitre.setHorizontalAlignment(JLabel.CENTER);
        labelTitre.setBorder(border);
        JTextField titre = new JTextField();

        JLabel labelThematique = new JLabel("Thematique");
        labelThematique.setHorizontalAlignment(JLabel.CENTER);
        labelThematique.setBorder(border);
        JComboBox<String> thematique = new JComboBox<String>(tableauThematique);


        JLabel labelDifficulte = new JLabel("Difficulté");
        labelDifficulte.setHorizontalAlignment(JLabel.CENTER);
        labelDifficulte.setBorder(border);
        ButtonGroup group = new ButtonGroup();
        JRadioButton b1 = new JRadioButton("Facile");
        JRadioButton b2 = new JRadioButton("Moyen");
        JRadioButton b3 = new JRadioButton("Difficile");
        JRadioButton b4 = new JRadioButton("ADA");
        b2.setSelected(true);

        b1.setActionCommand("b1");
        b2.setActionCommand("b2");
        b3.setActionCommand("b3");
        b4.setActionCommand("b4");

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
        return panel;
    }
}
