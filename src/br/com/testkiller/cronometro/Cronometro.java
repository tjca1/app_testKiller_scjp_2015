/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.cronometro;
import br.com.testkiller.util.VariaveisConstantes;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Cronometro extends JFrame {

    private static final long serialVersionUID = 1L;

    private static boolean contador = false;
    private static boolean zerado = false;
    private JButton iniciar;
    private static JLabel lConta;
    private JPanel mainPanel;
    private JButton pausar;
    private JButton zerar;

    public static void main(String[] args) {
        new Cronometro().montaTela();
        Contador cont = new Contador(lConta);
        cont.start();
    }

    private void montaTela(){
        this.setTitle(VariaveisConstantes.TITULO_TIMER_CRONOMETRO);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(240, 120);
        this.setResizable(false);

        mainPanel = new javax.swing.JPanel();
        lConta = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        pausar = new javax.swing.JButton();
        zerar = new javax.swing.JButton();

        mainPanel.setName("mainPanel"); // NOI18N

        lConta.setText("00:00:00"); // NOI18N
        lConta.setName("lConta"); // NOI18N

        iniciar.setText(">"); // NOI18N
        iniciar.setName("iniciar"); // NOI18N
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        pausar.setText("||"); // NOI18N
        pausar.setName("pausar"); // NOI18N
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });

        zerar.setText("[]"); // NOI18N
        zerar.setName("00:00"); // NOI18N
        zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConta, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(pausar)
                        .addGap(32, 32, 32)
                        .addComponent(zerar)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar)
                    .addComponent(zerar)
                    .addComponent(pausar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.add(mainPanel);
        this.setVisible(true);
    }

    private void iniciarActionPerformed(ActionEvent evt) {
        contador = true;
        iniciar.setEnabled(false);
        pausar.setEnabled(true);
        zerar.setEnabled(false);
    }

    private void pausarActionPerformed(ActionEvent evt) {
        contador = false;
        iniciar.setEnabled(true);
        pausar.setEnabled(false);
        zerar.setEnabled(true);
    }

    private void zerarActionPerformed(ActionEvent evt) {
        contador = false;
        lConta.setText("00:00:00");
        zerado = true;
        lConta.revalidate();
        iniciar.setEnabled(true);
        pausar.setEnabled(false);
    }


    public static boolean isContador(){
        return contador;
    }

    public static boolean isZerado(){
        return zerado;
    }

    public static void setZerado(boolean zero){
        zerado = zero;
    }


}
