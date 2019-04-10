
import br.com.testkiller.util.JavaMailApp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 805690
 */
public class t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JavaMailApp mail = new JavaMailApp();
        try {
            mail.enviaEmail("ttjca1@gmail.com", "tjca1@yahoo.com.br", "testeAssunto", "msg!!!");
        } catch (MessagingException ex) {
            Logger.getLogger(t.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public void takeCup(Cup c) {
        c = (Cup)(PoisonCup)new Cup();
        if (c instanceof PoisonCup) {
            System.out.println("Inconceivable!");
        } else if (c instanceof Cup) {
            System.out.println("Dizzying intellect!");
        } else {
            System.exit(0);
        }
    }
}
