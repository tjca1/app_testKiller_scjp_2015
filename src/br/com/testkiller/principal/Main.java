package br.com.testkiller.principal;
import br.com.testkiller.view.TelaPrincipal;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class Main
{
    public static void main(String[] args)
    {
    try 
    {
        
        //tela.setVisible(true);
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
    {
   
        //JOptionPane.showMessageDialog(null,info.getName() );
        if ("CDE/Motif".equals(info.getName()) ||"Metal".equals(info.getName()) ) {
            UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
            TelaPrincipal tela  = new TelaPrincipal();
            tela.setVisible(true);
            break;
        }
    }
    } catch (UnsupportedLookAndFeelException e) {
      JOptionPane.showMessageDialog(null, "Problemas na Aparencia do Aplicativo - "+e);
    } catch (ClassNotFoundException e) {
     JOptionPane.showMessageDialog(null, "Problemas na Aparencia do Aplicativo - "+e);
    } catch (InstantiationException e) {
     JOptionPane.showMessageDialog(null, "Problemas na Aparencia do Aplicativo - "+e);
    } catch (IllegalAccessException e) {
      JOptionPane.showMessageDialog(null, "Problemas na Aparencia do Aplicativo - "+e);
    }
        

        
    }

}
