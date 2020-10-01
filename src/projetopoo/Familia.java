package projetopoo;
/**
 *
 * @author Ygor
 */
public abstract class Familia  {
    public String sobrenome;

    public Familia(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
}
