import Controler.QuizzControler;
import Model.ListQCMModel;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class main {

    /**
     * L'exécutable du projet
     * @param args
     */
    public static void main(String[] args){
        ListQCMModel model = new ListQCMModel();
        QuizzControler controler = new QuizzControler(model);
    }
}
