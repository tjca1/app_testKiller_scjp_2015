/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * q_01.java
 *
 * Created on 13/04/2011, 09:27:44
 */

package br.com.testkiller.view;

import br.com.testkiller.graficos.GraficoBR;
import br.com.testkiller.internacionalizacao.Internacionalizacao;
import br.com.testkiller.util.VariaveisConstantes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class q_02 extends javax.swing.JPanel {

    /** Creates new form q_01 */
    private static boolean status_classe = false;
    private static String status_questao = "";
    private static String s_conteudoTextArea1;
    private static String s_conteudoTextArea2;
    private Internacionalizacao internacionalizacao;




    /*T1*****/
    public static String getS_conteudoTextArea1() {
        return s_conteudoTextArea1;
    }

    public static void setS_conteudoTextArea1(String s_conteudoTextArea1) {
        q_02.s_conteudoTextArea1 = s_conteudoTextArea1;
    }
    /*T2*****/
    public static String getS_conteudoTextArea2() {
        return s_conteudoTextArea2;
    }

    public static void setS_conteudoTextArea2(String s_conteudoTextArea2) {
        q_02.s_conteudoTextArea2 = s_conteudoTextArea2;
    }



    private void injetaInternacionalizacao() throws FileNotFoundException, IOException
    {
        internacionalizacao = new Internacionalizacao();
        /*T1**/
        internacionalizacao.determinaPropriedadeTextArea1("q_2.textPTA1");
        setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
        /*T2**/
        internacionalizacao.determinaPropriedadeTextArea1("q_2.textPTA2");
        setS_conteudoTextArea2(internacionalizacao.getConteudoTextArea1());

    }

   
    /*METODOS PARA PEGAR E SETAR O PRIMEIRA AREA DE TEXTO1 */
    public static JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public static void setjTextArea1(String  textojTextArea1) {
        jTextArea1.setText(textojTextArea1);
    }
    /************************************************************/
    /*METODOS PARA PEGAR E SETAR O PRIMEIRA AREA DE TEXTO2 */
    public static JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public static void setjTextArea2(String  textojTextArea1) {
        jTextArea2.setText(textojTextArea1);
    }



    public static String getStatus_questao() {
        return status_questao;
    }

    public static void setStatus_questao(String status_questao) {
        q_02.status_questao = status_questao;
    }

    
    public q_02()
    {

        initComponents();
    }

    public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_02.status_classe = status_classe;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        /*para carregar a internacionalização */
        try {
            injetaInternacionalizacao();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(q_01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(q_01.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton_a = new javax.swing.JRadioButton();
        jRadioButton_b = new javax.swing.JRadioButton();
        jRadioButton_c = new javax.swing.JRadioButton();
        jRadioButton_d = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel_status = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText(getS_conteudoTextArea1());
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(5);
        jTextArea2.setText( getS_conteudoTextArea2());
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton_a.setText("A. foreach(x) System.out.println(z);");

        jRadioButton_b.setText("B. for(int z : x) System.out.println(z);");

        jRadioButton_c.setText("C. while( x.hasNext()) System.out.println( x.next());");

        jRadioButton_d.setText("D. for( int i=0; i< x.length; i++ ) System.out.println(x[i]);");
        jRadioButton_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_dActionPerformed(evt);
            }
        });

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_status.setBackground(new java.awt.Color(0, 51, 255));
        jLabel_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_status.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_d, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton_a, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //JOptionPane.showMessageDialog(null,jRadioButton_a.isSelected());
        int verificaOpcaoQestoes = 0;
        String para_nao_repetirAcertos ="";
        boolean a = jRadioButton_a.isSelected();
        boolean b = jRadioButton_b.isSelected();
        boolean c = jRadioButton_c.isSelected();
        boolean d = jRadioButton_d.isSelected();

        if(a == true)
                verificaOpcaoQestoes++;
        if(b == true)
                verificaOpcaoQestoes++;
        if(c == true)
                verificaOpcaoQestoes++;
        if(d == true)
                verificaOpcaoQestoes++;
        
        if(verificaOpcaoQestoes == 2)
        {
           if(b == true && d == true )
            {

                jLabel_status.setBackground(VariaveisConstantes.corGrenn);
                GraficoBR.setValueGrafico("Acertou",para_nao_repetirAcertos);
            }
            else
            {
               jLabel_status.setBackground(VariaveisConstantes.corRed);
               GraficoBR.setValueGrafico("Errou",para_nao_repetirAcertos);
            }desabilitaComponentes(); 
        }
        else if(verificaOpcaoQestoes == 0)
        {
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAOS());
            jLabel_status.setText("");
        }
         
        else if(verificaOpcaoQestoes == 1)
        {
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
            jLabel_status.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_DUAS_OPCAO());
            jLabel_status.setText("");
        }
           

            
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel_status;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    private void desabilitaComponentes()
    {
       jButton1.setEnabled(false);
       jRadioButton_a.setEnabled(false);
       jRadioButton_b.setEnabled(false);
       jRadioButton_c.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jLabel_status.setVisible(true);
    
    }
    
}
