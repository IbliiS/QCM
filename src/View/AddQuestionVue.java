package View;

import Controler.QuizzControler;
import Model.Qcm;
import Model.Question;
import Model.Reponse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Fabien on 16/10/2014.
 */
public class AddQuestionVue extends JFrame{

    private Qcm qcm;
    private QuizzControler controler;
    private JButton ajouter, terminer;
    private JTextField question, reponse1, reponse2, reponse3, reponse4, timer;
    private JCheckBox check1, check2, check3, check4;

    public AddQuestionVue(QuizzControler controler, Qcm q){
        super();
        this.controler = controler;
        qcm = q;
        build();
    }

    private void build() {
        setTitle("Ajoutez des questions au qcm");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(buildContentPane());
        setVisible(true);
    }

    private Container buildContentPane() {
        JPanel superPanel = new JPanel(new BorderLayout());
        JLabel titre = new JLabel("QCM : "+qcm.getTitre());
        titre.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel centerPanel = new JPanel(new GridLayout(7,2));

        JLabel questionLabel = new JLabel("Question : ");
        questionLabel.setHorizontalAlignment(JLabel.CENTER);
        question = new JTextField();
        JLabel reponseLabel = new JLabel("Réponses (cocher la/les bonne(s) réponse(s)) :");
        reponseLabel.setHorizontalAlignment(JLabel.CENTER);

        check1 = new JCheckBox();
        check1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        check2 = new JCheckBox();
        check2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        check3 = new JCheckBox();
        check3.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        check4 = new JCheckBox();
        check4.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        reponse1 = new JTextField();
        reponse2 = new JTextField();
        reponse3 = new JTextField();
        reponse4 = new JTextField();

        JLabel timerLabel = new JLabel("Limite de temps pour cette question : ");
        timer = new JTextField();

        centerPanel.add(questionLabel);
        centerPanel.add(question);
        centerPanel.add(reponseLabel);
        centerPanel.add(new JLabel());
        centerPanel.add(check1);
        centerPanel.add(reponse1);
        centerPanel.add(check2);
        centerPanel.add(reponse2);
        centerPanel.add(check3);
        centerPanel.add(reponse3);
        centerPanel.add(check4);
        centerPanel.add(reponse4);
        centerPanel.add(timerLabel);
        centerPanel.add(timer);

        JPanel southPanel = new JPanel(new FlowLayout());
        ajouter = new JButton("Ajouter");
        terminer = new JButton("Terminer");

        ajouter.addActionListener(new ButtonListener());
        terminer.addActionListener(new ButtonListener());

        southPanel.add(ajouter);
        southPanel.add(terminer);

        superPanel.add(titre, BorderLayout.NORTH);
        superPanel.add(centerPanel, BorderLayout.CENTER);
        superPanel.add(southPanel, BorderLayout.SOUTH);
        return superPanel;
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == terminer){
                dispose();
            } else {
                if (estCorrect()){
                    Question q = new Question();
                    q.setQuestion(question.getText());
                    q.setTimer((Integer.parseInt(timer.getText())));
                    q.setThematique(qcm.getThematique());
                    ArrayList<Reponse> reponselist = new ArrayList<Reponse>();
                    reponselist.add(new Reponse(reponse1.getText(), check1.isSelected()));
                    reponselist.add(new Reponse(reponse2.getText(), check2.isSelected()));
                    reponselist.add(new Reponse(reponse3.getText(), check3.isSelected()));
                    reponselist.add(new Reponse(reponse4.getText(), check4.isSelected()));
                    q.setReponses(reponselist);
                    controler.addQuestion(qcm, q);
                }
            }
        }

    }

    private boolean estCorrect() {
        boolean b = true;
        if (question.getText().equals("")){
            question.setBackground(Color.RED);
            b = false;
        } else {
            question.setBackground(Color.WHITE);
        }
        if (reponse1.getText().equals("")){
            reponse1.setBackground(Color.RED);
            b = false;
        } else {
            reponse1.setBackground(Color.WHITE);
        }
        if (reponse2.getText().equals("")){
            reponse2.setBackground(Color.RED);
            b = false;
        } else {
            reponse2.setBackground(Color.WHITE);
        }
        if (reponse3.getText().equals("")){
            reponse3.setBackground(Color.RED);
            b = false;
        } else {
            reponse3.setBackground(Color.WHITE);
        }
        if (reponse4.getText().equals("")){
            reponse4.setBackground(Color.RED);
            b = false;
        } else {
            reponse4.setBackground(Color.WHITE);
        }
        if (timer.getText().equals("")){
            timer.setBackground(Color.RED);
            b = false;
        } else {
            try {
                Integer.parseInt(timer.getText());
                timer.setBackground(Color.WHITE);
            } catch (NumberFormatException nfe){
                timer.setBackground(Color.RED);
                b = false;
            }
        }
        if (!(check1.isSelected() || check2.isSelected() || check3.isSelected() || check4.isSelected())){
           new MessageBox("Vous devez sélectionner au moins une bonne réponse !");
        }
        return b;
    }
}
