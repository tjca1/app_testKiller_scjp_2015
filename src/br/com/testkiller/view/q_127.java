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
/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class q_127 extends javax.swing.JPanel {

 private static boolean status_classe = false;
 private static String status_questao = "";
 private Internacionalizacao internacionalizacao = new Internacionalizacao();
 private ConteudoTextArea conteudo = new ConteudoTextArea();





    public q_127() {
        initComponents();
        injetaInternacionalizacao();
    }
    public static String getStatus_questao() {
        return status_questao;
    }

    public static void setStatus_questao(String status_questao) {
        q_127.status_questao = status_questao;
    }


   public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_127.status_classe = status_classe;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton_a = new javax.swing.JRadioButton();
        jRadioButton_b = new javax.swing.JRadioButton();
        jRadioButton_c = new javax.swing.JRadioButton();
        jRadioButton_d = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel_status = new javax.swing.JLabel();
        jRadioButton_e = new javax.swing.JRadioButton();

        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(12767, 12767));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_cActionPerformed(evt);
            }
        });

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
        jLabel_status.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel_status.setOpaque(true);

        jRadioButton_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_eActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton_e, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                        .addComponent(jRadioButton_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jButton1)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int QUANTIDADE_RESPOSTAS = 2;
        String para_nao_repetirAcertos ="";
        int verificaOpcaoQestoes = 0; 
       
        if(jRadioButton_a.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_b.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_c.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_d.isSelected() == true)
                verificaOpcaoQestoes++;
        if(jRadioButton_e.isSelected() == true)
                verificaOpcaoQestoes++;
       
        if(verificaOpcaoQestoes == QUANTIDADE_RESPOSTAS)
        {
           if(jRadioButton_a.isSelected() && jRadioButton_d.isSelected())
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

    private void jRadioButton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_cActionPerformed

    private void jRadioButton_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_eActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JRadioButton jRadioButton_e;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
    public ConteudoTextArea injetaInternacionalizacao()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".textPTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_A_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_a.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_B_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_b.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_C_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_c.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_D_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_d.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_E_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_e.setText(conteudo.getS_conteudoTextArea1());
                     
                }

                catch(FileNotFoundException ex)
                {
                    Logger.getLogger(q_127.class.getName()).log(Level.SEVERE, null, ex);
                }                    catch (IOException ex)
                    {
                        Logger.getLogger(q_127.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    finally
                    {
                        return conteudo;
                    }
                }           
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                private String NomeClasse()
                {
                    String nome;
                    nome =  q_127.class.getName().replaceAll(".java","");
                    nome =  q_127.class.getName().replaceAll("br.com.testkiller.view.","");
                    return nome;
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                public ConteudoTextArea injetaInternacionalizacaoUSA()
                {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".textENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_A_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_a.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_B_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_b.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_C_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_c.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_D_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_d.setText(conteudo.getS_conteudoTextArea1());
                      /////////////////////////////////////////////////////////////
                      internacionalizacao.determinaPropriedadeTextArea1(NomeClasse()+".label_E_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_e.setText(conteudo.getS_conteudoTextArea1());
                    
                }

                catch(FileNotFoundException ex)
                {
                    Logger.getLogger(q_127.class.getName()).log(Level.SEVERE, null, ex);
                }                catch (IOException ex)
                {
                    Logger.getLogger(q_127.class.getName()).log(Level.SEVERE, null, ex);
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
       jRadioButton_c.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jRadioButton_e.setEnabled(false);
       jLabel_status.setVisible(true);


    }
    
}
