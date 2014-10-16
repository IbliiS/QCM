package View;

import Controler.QuizzControler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Fabien on 14/10/2014.
 */
public class AdminAccueilVue extends JFrame implements ActionListener{

    private JButton lancer, creer;
    private QuizzControler controler;

    /**
     * Constructeur de classe
     */
    public AdminAccueilVue(QuizzControler controler){
        super();
        this.controler = controler;
        build();
    }

    /**
     * Défini les paramètres de la JFrame
     */
    private void build() {
        setTitle("Quizzine admin");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    /**
     * Défini les éléments du JPanel à afficher dans la JFrame
     * @return : le JPanel de la page d'accueil
     */
    private Container buildContentPane() {
        JPanel superPanel = new JPanel(new BorderLayout());
        JPanel panel = new JPanel(new FlowLayout());

        lancer = new JButton("Lancer un test");
        creer = new JButton("Créer un test");

        lancer.addActionListener(this);
        creer.addActionListener(this);

        panel.add(lancer);
        panel.add(creer);

        try {
            BufferedImage img = ImageIO.read(new File("ressources/qcm.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            superPanel.add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }

        superPanel.add(panel, BorderLayout.NORTH);
        return superPanel;
    }

    /**
     * Lance l'action correspondant au bouton cliqué.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lancer){
            ListQCMVue listeQuizz = new ListQCMVue(controler.getModel().getList());
            listeQuizz.setVisible(true);
            //this.dispose();
        } else {
            AdminCreerQuizzVue creerQuizz = new AdminCreerQuizzVue(controler);
            creerQuizz.setVisible(true);
            //this.dispose();
        }
    }
}
