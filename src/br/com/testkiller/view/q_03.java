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
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class q_03 extends javax.swing.JPanel
{

        /** Creates new form q_01 */
    private static boolean status_classe = false;
    private static String status_questao = "";
    private static String s_conteudoTextArea2;
    private ConteudoTextArea conteudo = new ConteudoTextArea();
    private Internacionalizacao internacionalizacao = new Internacionalizacao();


    public ConteudoTextArea injetaInternacionalizacao()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.textPTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.label_F_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_f.setText(conteudo.getS_conteudoTextArea1());
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.label_G_PTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_g.setText(conteudo.getS_conteudoTextArea1());  
                      
                      
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
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.textENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.label_F_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_f.setText(conteudo.getS_conteudoTextArea1());
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_3.label_G_ENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jRadioButton_g.setText(conteudo.getS_conteudoTextArea1());  

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
        this.jRadioButton_f.setText(textoJRadioButton_e);
    }


    public q_03()
    {
        injetaInternacionalizacao();
        initComponents();
    }

    public static String getStatus_questao() {
        return status_questao;
    }
    public static void setStatus_questao(String status_questao) {
        q_03.status_questao = status_questao;
    }
    public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_03.status_classe = status_classe;
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
        jRadioButton_f = new javax.swing.JRadioButton();
        jRadioButton_e1 = new javax.swing.JRadioButton();
        jRadioButton_g = new javax.swing.JRadioButton();

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(10);
        jTextArea1.setText("11. public class Test {\n12. public static void main(String [] args) {\n13. int x =5;\n14. boolean b1 = true;\n15. boolean b2 = false;\n16.\n17.if((x==4) && !b2)\n18. System.out.print(”l “);\n19. System.out.print(”2 “);\n20. if ((b2 = true) && b1)\n11. public class Test {\n12. public static void main(String [] args) {\n13. int x =5;\n14. boolean b1 = true;\n15. boolean b2 = false;\n16.\n17.if((x==4) && !b2)\n18. System.out.print(”l “);\n19. System.out.print(”2 “);\n20. if ((b2 = true) && b1)\n");
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton_a.setText("A. 2");

        jRadioButton_b.setText("B. 3");

        jRadioButton_c.setText("C. 1 3");

        jRadioButton_d.setText("D. 2 3");
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

        jRadioButton_f.setText("F. A Compilação Falha ?");
        jRadioButton_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fActionPerformed(evt);
            }
        });

        jRadioButton_e1.setText("E. 1 2 3");
        jRadioButton_e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_e1ActionPerformed(evt);
            }
        });

        jRadioButton_g.setText("G. Erro em tempo de execução.");
        jRadioButton_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_gActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_g, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_f, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_e1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_d, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_c, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_b, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jRadioButton_a, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_a, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_e1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_f)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_g)
                .addContainerGap(106, Short.MAX_VALUE))
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
        boolean e = jRadioButton_e1.isSelected();
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
         String para_nao_repetirAcertos ="";
        if(verificaOpcaoQestoes == 1)
        {
           if(d == true )
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
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAO());
            jLabel_status.setText("");
        }
         
        
        else if(verificaOpcaoQestoes >= 2)
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_UMA_OPCAO());
            jLabel_status.setText("");
        }
           

            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_fActionPerformed

    private void jRadioButton_e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_e1ActionPerformed

    private void jRadioButton_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_gActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JRadioButton jRadioButton_e1;
    private javax.swing.JRadioButton jRadioButton_f;
    private javax.swing.JRadioButton jRadioButton_g;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
     private void desabilitaComponentes()
    {
       jButton1.setEnabled(false);
       jRadioButton_a.setEnabled(false);
       jRadioButton_b.setEnabled(false);
       jRadioButton_c.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jRadioButton_e1.setEnabled(false);
       jRadioButton_f.setEnabled(false);
       jRadioButton_g.setEnabled(false);
       jLabel_status.setVisible(true);
    
    }
}
