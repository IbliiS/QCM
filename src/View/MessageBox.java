package View;

import javax.swing.*;

/**
 * Created by Fabien on 16/10/2014.
 */
public class MessageBox{
    private JOptionPane jop;

    public MessageBox(String s){
        jop = new JOptionPane();
        jop.showMessageDialog(null, s, "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}
