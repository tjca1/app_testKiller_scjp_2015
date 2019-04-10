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

import br.com.testkiller.beans.ConteudoTextArea;
import br.com.testkiller.graficos.GraficoBR;
import br.com.testkiller.internacionalizacao.Internacionalizacao;
import br.com.testkiller.util.QuantidadeRespostas;
import br.com.testkiller.util.VariaveisConstantes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class q_211 extends javax.swing.JPanel {

 private static boolean status_classe = false;
 private static String status_questao = "";
 private Internacionalizacao internacionalizacao = new Internacionalizacao();
 private ConteudoTextArea conteudo = new ConteudoTextArea();





    public q_211() {
        initComponents();
        injetaInternacionalizacao();
    }
    public static String getStatus_questao() {
        return status_questao;
    }

    public static void setStatus_questao(String status_questao) {
        q_211.status_questao = status_questao;
    }


   public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_211.status_classe = status_classe;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel_status = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jRadioButton_a = new javax.swing.JRadioButton();
        jRadioButton_b = new javax.swing.JRadioButton();
        jRadioButton_c = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_c = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_b = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_a = new javax.swing.JTextArea();
        jRadioButton_d = new javax.swing.JRadioButton();
        jRadioButton_e = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_e = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_d = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea_f = new javax.swing.JTextArea();
        jRadioButton_f = new javax.swing.JRadioButton();

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_status.setBackground(new java.awt.Color(0, 51, 255));
        jLabel_status.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel_status.setOpaque(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jRadioButton_a.setBounds(10, 20, 20, 25);
        jLayeredPane1.add(jRadioButton_a, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_bActionPerformed(evt);
            }
        });
        jRadioButton_b.setBounds(10, 70, 20, 25);
        jLayeredPane1.add(jRadioButton_b, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_cActionPerformed(evt);
            }
        });
        jRadioButton_c.setBounds(10, 117, 21, 25);
        jLayeredPane1.add(jRadioButton_c, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_c.setColumns(20);
        jTextArea_c.setEditable(false);
        jTextArea_c.setRows(1);
        jTextArea_c.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea_c);

        jScrollPane4.setBounds(40, 110, 395, 40);
        jLayeredPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_b.setColumns(20);
        jTextArea_b.setEditable(false);
        jTextArea_b.setRows(1);
        jTextArea_b.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea_b);

        jScrollPane2.setBounds(40, 60, 395, 40);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_a.setColumns(20);
        jTextArea_a.setEditable(false);
        jTextArea_a.setRows(1);
        jTextArea_a.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTextArea_a);

        jScrollPane3.setBounds(40, 10, 395, 40);
        jLayeredPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_dActionPerformed(evt);
            }
        });
        jRadioButton_d.setBounds(490, 20, 20, 25);
        jLayeredPane1.add(jRadioButton_d, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_eActionPerformed(evt);
            }
        });
        jRadioButton_e.setBounds(490, 70, 20, 25);
        jLayeredPane1.add(jRadioButton_e, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_e.setColumns(20);
        jTextArea_e.setEditable(false);
        jTextArea_e.setRows(1);
        jTextArea_e.setAutoscrolls(false);
        jScrollPane6.setViewportView(jTextArea_e);

        jScrollPane6.setBounds(520, 60, 395, 40);
        jLayeredPane1.add(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_d.setColumns(20);
        jTextArea_d.setEditable(false);
        jTextArea_d.setRows(1);
        jTextArea_d.setAutoscrolls(false);
        jScrollPane5.setViewportView(jTextArea_d);

        jScrollPane5.setBounds(520, 10, 395, 40);
        jLayeredPane1.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBounds(480, 10, 10, 140);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_f.setColumns(20);
        jTextArea_f.setEditable(false);
        jTextArea_f.setRows(1);
        jTextArea_f.setAutoscrolls(false);
        jTextArea_f.setOpaque(false);
        jScrollPane7.setViewportView(jTextArea_f);

        jScrollPane7.setBounds(520, 110, 395, 40);
        jLayeredPane1.add(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_f.setEnabled(false);
        jRadioButton_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fActionPerformed(evt);
            }
        });
        jRadioButton_f.setBounds(490, 117, 20, 25);
        jLayeredPane1.add(jRadioButton_f, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(11, 11, 11)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_eActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int QUANTIDADE_RESPOSTAS = 1;
        String para_nao_repetirAcertos ="";
        int verificaOpcaoQestoes = 0; 
       
        if(jRadioButton_a.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_b.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_d.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_e.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_c.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_f.isSelected() == true)
                verificaOpcaoQestoes++;

       
        if(verificaOpcaoQestoes == QUANTIDADE_RESPOSTAS)
        {
           if(jRadioButton_e.isSelected())
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
        else
        {            
            QuantidadeRespostas.VerificaResp(verificaOpcaoQestoes,QUANTIDADE_RESPOSTAS);
        }
       
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_dActionPerformed

    private void jRadioButton_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_fActionPerformed

    private void jRadioButton_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_bActionPerformed

    private void jRadioButton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_cActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JRadioButton jRadioButton_e;
    private javax.swing.JRadioButton jRadioButton_f;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_a;
    private javax.swing.JTextArea jTextArea_b;
    private javax.swing.JTextArea jTextArea_c;
    private javax.swing.JTextArea jTextArea_d;
    private javax.swing.JTextArea jTextArea_e;
    private javax.swing.JTextArea jTextArea_f;
    // End of variables declaration//GEN-END:variables

    
    public ConteudoTextArea injetaInternacionalizacao()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".textPTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_A_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_a.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_B_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_b.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_C_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_c.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_D_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_d.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_E_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_e.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_F_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_f.setText(conteudo.getS_conteudoTextArea1());
            
                        
                }

                catch(FileNotFoundException ex)
                {
                    Logger.getLogger(q_211.class.getName()).log(Level.SEVERE, null, ex);
                }                catch (IOException ex)
                {
                    Logger.getLogger(q_211.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally
                {
                    return conteudo;
                }
    }
              private String NomeClasse()
                {
                    String nome;
                    nome =  q_211.class.getName().replaceAll(".java","");
                    nome =  q_211.class.getName().replaceAll("br.com.testkiller.view.","");
                    return nome;
                }
    
     public ConteudoTextArea injetaInternacionalizacaoUSA()
    {
                try
                {
                      
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".textENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_A_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_a.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_B_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_b.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_C_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_c.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_D_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_d.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_E_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_e.setText(conteudo.getS_conteudoTextArea1());
                      ////////////////***********////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_F_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea_f.setText(conteudo.getS_conteudoTextArea1());
                    
                }
                catch(FileNotFoundException ex)
                {
                    Logger.getLogger(q_04.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (IOException ex)
                {
                    Logger.getLogger(q_04.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally
                {
                    return conteudo;
                }
    }
      private void desabilitaComponentes()
     {
       jButton1.setEnabled(false);
       jRadioButton_a.setEnabled(false);
       jRadioButton_b.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jRadioButton_e.setEnabled(false);
       jRadioButton_c.setEnabled(false);
       jRadioButton_f.setEnabled(false);
       jLabel_status.setVisible(true);


    }
    
}
