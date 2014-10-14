package Model;

/**
 * Created by Baptiste on 14/10/2014.
 */
public class Reponse {

    private String reponse;
    private boolean bonne;

    /**
     * Creation d'une reponse
     * @param s: reponse.
     * @param b: bonne reponse ou non.
     */
    public Reponse(String s, boolean b){
        reponse = s;
        bonne = b;

    }

    /**
     * Getter de bonne
     * @return attribut bonne
     */
    public boolean estBonne(){
        return bonne;
    }


    /**
     * Getter de reponse
     * @return attribut reponse
     */
    public String getReponse() {
        return reponse;
    }


    /**
     * Setter de reponse
     * @param reponse
     */
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }


    /**
     * Setter de bonne
     * @param bonne
     */
    public void setBonne(boolean bonne) {
        this.bonne = bonne;
    }

    @Override
    public String toString() {
        return "\n Reponse{" +
                "reponse='" + reponse + '\'' +
                ", bonne=" + bonne +
                '}';
    }
}
