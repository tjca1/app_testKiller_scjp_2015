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
public final class q_04 extends javax.swing.JPanel {

    /** Creates new form q_01 */
private static boolean status_classe = false;
private static String status_questao = "";
private ConteudoTextArea conteudo = new ConteudoTextArea();
private Internacionalizacao internacionalizacao = new Internacionalizacao();


    public ConteudoTextArea injetaInternacionalizacao()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1("q_4.textPTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      setjTextArea1(conteudo.getS_conteudoTextArea1());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.textPTA2");
                      conteudo.setS_conteudoTextArea2(internacionalizacao.getConteudoTextArea1());
                       setjTextArea2(conteudo.getS_conteudoTextArea2());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_A_PTA1");
                      conteudo.setS_conteudoLabelA(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_a(conteudo.getS_conteudoLabelA());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_B_PTA1");
                      conteudo.setS_conteudoLabelB(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_b(conteudo.getS_conteudoLabelB());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_C_PTA1");
                      conteudo.setS_conteudoLabelC(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_c(conteudo.getS_conteudoLabelC());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_D_PTA1");
                      conteudo.setS_conteudoLabelD(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_d(conteudo.getS_conteudoLabelD());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_E_PTA1");
                      conteudo.setS_conteudoLabelE(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_e(conteudo.getS_conteudoLabelE());
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
    public void injetaInternacionalizacaoUSA()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1("q_4.textENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      setjTextArea1(conteudo.getS_conteudoTextArea1());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.textENA2");
                      conteudo.setS_conteudoTextArea2(internacionalizacao.getConteudoTextArea1());
                       setjTextArea2(conteudo.getS_conteudoTextArea2());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_A_ENA1");
                      conteudo.setS_conteudoLabelA(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_a(conteudo.getS_conteudoLabelA());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_B_ENA1");
                      conteudo.setS_conteudoLabelB(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_b(conteudo.getS_conteudoLabelB());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_C_ENA1");
                      conteudo.setS_conteudoLabelC(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_c(conteudo.getS_conteudoLabelC());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_D_ENA1");
                      conteudo.setS_conteudoLabelD(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_d(conteudo.getS_conteudoLabelD());

                      internacionalizacao.determinaPropriedadeTextArea1("q_4.label_E_ENA1");
                      conteudo.setS_conteudoLabelE(internacionalizacao.getConteudoTextArea1());
                      setjRadioButton_e(conteudo.getS_conteudoLabelE());

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
                   
                }
            
    }

    
    /************************setando os objstos Swings************************************/
    public void setjTextArea1(String  textojTextArea1) {
        jTextArea1.setText(textojTextArea1);
    }

    public static void setjTextArea2(String  textojTextArea2) {
        jTextArea2.setText(textojTextArea2);
    }

    public void setjRadioButton_a(String  textoJRadioButton_a)
    {
        this.jRadioButton_a.setText(textoJRadioButton_a);
    }
    public void setjRadioButton_b(String  textoJRadioButton_b)
    {
        this.jRadioButton_b.setText(textoJRadioButton_b);
    }
    public void setjRadioButton_c(String  textoJRadioButton_c)
    {
        this.jRadioButton_c.setText(textoJRadioButton_c);
    }
    public void setjRadioButton_d(String  textoJRadioButton_e)
    {
        this.jRadioButton_d.setText(textoJRadioButton_e);
    }
    public void setjRadioButton_e(String  textoJRadioButton_e)
    {
        this.jRadioButton_e.setText(textoJRadioButton_e);
    }
    /************************terminando de setar ***********************************/


    public static void setStatus_questao(String status_questao)
    {
        q_04.status_questao = status_questao;
    }

    
    public q_04()
    {
        initComponents();
        injetaInternacionalizacao();
        //injetaInternacionalizacaoUSA();
        
    }

    public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_04.status_classe = status_classe;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jRadioButton_e = new javax.swing.JRadioButton();

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText(conteudo.getS_conteudoTextArea1());
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(5);
        jTextArea2.setText(conteudo.getS_conteudoTextArea2());
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton_a.setText(conteudo.getS_conteudoLabelA());

        jRadioButton_b.setText(conteudo.getS_conteudoLabelB());

        jRadioButton_c.setText(conteudo.getS_conteudoLabelC());

        jRadioButton_d.setText(conteudo.getS_conteudoLabelD());
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

        jRadioButton_e.setText(conteudo.getS_conteudoLabelE());
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //JOptionPane.showMessageDialog(null,jRadioButton_a.isSelected());
        int verificaOpcaoQestoes = 0;
        boolean a = jRadioButton_a.isSelected();
        boolean b = jRadioButton_b.isSelected();
        boolean c = jRadioButton_c.isSelected();
        boolean d = jRadioButton_d.isSelected();
        boolean e = jRadioButton_e.isSelected();

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
         String para_nao_repetirAcertos ="";
        if(verificaOpcaoQestoes == 3)
        {
           if(b == true && c == true && e == true)
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
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_DUAS_OPCAO());
            jLabel_status.setText("");
        }
         
        else if(verificaOpcaoQestoes == 2)
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
            jLabel_status.setText("");
        }
        else if(verificaOpcaoQestoes >= 4)
        {
            JOptionPane.showMessageDialog(null, "Só 3 Opção estão Correta!");
            jLabel_status.setText("");
        }
         

            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_eActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_status;
    private static javax.swing.JRadioButton jRadioButton_a;
    private static javax.swing.JRadioButton jRadioButton_b;
    private static javax.swing.JRadioButton jRadioButton_c;
    private static javax.swing.JRadioButton jRadioButton_d;
    private static javax.swing.JRadioButton jRadioButton_e;
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
       jRadioButton_e.setEnabled(false);
       jLabel_status.setVisible(true);
    }
    
}
