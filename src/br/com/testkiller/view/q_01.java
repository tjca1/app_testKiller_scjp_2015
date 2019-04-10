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


import br.com.testkiller.beans.StatusComportamentoQuestoes;
import br.com.testkiller.graficos.GraficoBR;
import br.com.testkiller.internacionalizacao.Internacionalizacao;
import br.com.testkiller.util.VariaveisConstantes;
import java.awt.Color;
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

public class q_01  extends javax.swing.JPanel implements InterfaceModeloPanels {

 private static String s_conteudoTextArea1;
 private static String s_conteudoTextArea2;
 private Internacionalizacao internacionalizacao;
 public static StatusComportamentoQuestoes statusComportamentoQuestoes  = new StatusComportamentoQuestoes();
    


   /***********************TEXTAREA_1*******************************/
    public static String getS_conteudoTextArea1()
    {
        return s_conteudoTextArea1;
    }

    public  void setS_conteudoTextArea1(String s_conteudoTextArea1)
    {
        q_01.s_conteudoTextArea1 = s_conteudoTextArea1;
    }
    /***********************TEXTAREA_2*******************************/
    public static String getS_conteudoTextArea2()
    {
        return s_conteudoTextArea2;
    }

    public  void setS_conteudoTextArea2(String s_conteudoTextArea2)
    {
        q_01.s_conteudoTextArea2 = s_conteudoTextArea2;
    }
    /*******************************************************************/

    private void injetaInternacionalizacao() throws FileNotFoundException, IOException
    {
        internacionalizacao = new Internacionalizacao();
        internacionalizacao.determinaPropriedadeTextArea1("q_1.textPTA1");
        setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
        internacionalizacao.determinaPropriedadeTextArea1("q_1.textPTA2");
        setS_conteudoTextArea2(internacionalizacao.getConteudoTextArea1());
    }

    /*METODOS PARA PEGAR E SETAR O PRIMEIRA AREA DE TEXTO */
    /****************TEXTAREA_1****************************/
    public static JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public static void setjTextArea1(String  textojTextArea1) {
        jTextArea1.setText(textojTextArea1);
    }
    /************************************************************/
     /****************TEXTAREA_2*********************************/
    public static JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public static void setjTextArea2(String  textojTextArea2) {
        jTextArea2.setText(textojTextArea2);
    }
    /************************************************************/
    
    /*SET E GETS STATUS DA QUESTÃO *****************************/

    public q_01()
    {
        initComponents();
        jLabel_status.setVisible(false);
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
        jRadioButton_e = new javax.swing.JRadioButton();
        jRadioButton_f = new javax.swing.JRadioButton();
        jRadioButton_g = new javax.swing.JRadioButton();
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
        jTextArea2.setText(getS_conteudoTextArea2());
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton_a.setText("A. final");

        jRadioButton_b.setText("B. static");

        jRadioButton_c.setText("C. native");

        jRadioButton_d.setText("D. public");
        jRadioButton_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_dActionPerformed(evt);
            }
        });

        jRadioButton_e.setText("E. private");
        jRadioButton_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_eActionPerformed(evt);
            }
        });

        jRadioButton_f.setText("F. abstract");
        jRadioButton_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fActionPerformed(evt);
            }
        });

        jRadioButton_g.setText("G. protected");
        jRadioButton_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_gActionPerformed(evt);
            }
        });

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_status.setBackground(new java.awt.Color(0, 0, 255));
        jLabel_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_status.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
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
                .addComponent(jRadioButton_e)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_f)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_g)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_dActionPerformed

    private void jRadioButton_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_eActionPerformed

    private void jRadioButton_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_fActionPerformed

    private void jRadioButton_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_gActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(!jLabel_status.getText().equals(""))
        {
            statusComportamentoQuestoes.setStatus_label_questao_classe(true);
        }
        int verificaOpcaoQestoes = 0;
        boolean a = jRadioButton_a.isSelected();
        boolean b = jRadioButton_b.isSelected();
        boolean c = jRadioButton_c.isSelected();
        boolean d = jRadioButton_d.isSelected();
        boolean e = jRadioButton_e.isSelected();
        boolean f = jRadioButton_f.isSelected();
        boolean g = jRadioButton_g.isSelected();

        if(a == true)
                verificaOpcaoQestoes++;
        if(b == true)
                verificaOpcaoQestoes++;
        if(c == true)
                verificaOpcaoQestoes++;
        if(d == true)
                verificaOpcaoQestoes++;
        if(e == true)
                verificaOpcaoQestoes++;
        if(f == true)
                verificaOpcaoQestoes++;
        if(g == true)
                verificaOpcaoQestoes++;

        
        if(verificaOpcaoQestoes == 3)
        {
           String para_nao_repetirAcertos ="";
           if(a == true && b == true && d == true)
            {
                jLabel_status.setBackground(VariaveisConstantes.corGrenn);
                statusComportamentoQuestoes.setStatus_questao(jLabel_status.getText());
                GraficoBR.setValueGrafico("Acertou",para_nao_repetirAcertos);
                
            }
            else
            {
               jLabel_status.setBackground(VariaveisConstantes.corRed);
               statusComportamentoQuestoes.setStatus_questao(jLabel_status.getText());
               GraficoBR.setValueGrafico("Errou",para_nao_repetirAcertos);
            }
           desabilitaComponentes();
        }
        else if(verificaOpcaoQestoes == 0)
        {
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getS_TRES_OPCAO());
            jLabel_status.setText("");
        }
         
        else if(verificaOpcaoQestoes == 1)
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getSEL_MAIS_DUAS_OPCAO());
            jLabel_status.setText("");
        }
        else if(verificaOpcaoQestoes == 2)
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
            jLabel_status.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_TRES_OPCAO());
            jLabel_status.setText("");
        }

        statusComportamentoQuestoes.setStatus_questao(jLabel_status.getText());

            
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel_status;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JRadioButton jRadioButton_e;
    private javax.swing.JRadioButton jRadioButton_f;
    private javax.swing.JRadioButton jRadioButton_g;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    public String getStatus_questao()
    {
        return statusComportamentoQuestoes.getStatus_questao();
    }
    
    private void desabilitaComponentes()
    {
       jButton1.setEnabled(false);
       jRadioButton_a.setEnabled(false);
       jRadioButton_b.setEnabled(false);
       jRadioButton_c.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jRadioButton_e.setEnabled(false);
       jRadioButton_f.setEnabled(false);
       jRadioButton_g.setEnabled(false);
       jLabel_status.setVisible(true);
    }
    
    
    
    
}
