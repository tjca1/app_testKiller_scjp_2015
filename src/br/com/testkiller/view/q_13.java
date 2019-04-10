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
public class q_13 extends javax.swing.JPanel {

 private static boolean status_classe = false;
 private static String status_questao = "";
 private Internacionalizacao internacionalizacao = new Internacionalizacao();
 private ConteudoTextArea conteudo = new ConteudoTextArea();




    public q_13() {
        initComponents();
        injetaInternacionalizacao();
    }
    public static String getStatus_questao() {
        return status_questao;
    }

    public static void setStatus_questao(String status_questao) {
        q_13.status_questao = status_questao;
    }


   public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_13.status_classe = status_classe;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_a = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_b = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_c = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_d = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton_a.setText("A.");

        jRadioButton_b.setText("B.");

        jRadioButton_c.setText("C.");

        jRadioButton_d.setText("D.");
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

        jTextArea_a.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea_a.setColumns(20);
        jTextArea_a.setEditable(false);
        jTextArea_a.setRows(5);
        jTextArea_a.setText("import com.sun.scjp.Geodetics;\npublic class TerraCarta { \npublic double halfway() { \nreturn Geodetics.DIAMETER/2.0; \n} }");
        jScrollPane3.setViewportView(jTextArea_a);

        jTextArea_b.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea_b.setColumns(20);
        jTextArea_b.setEditable(false);
        jTextArea_b.setRows(5);
        jTextArea_b.setText("import static com.sun.scjp.Geodetics;\npublic class TerraCarta {\npublic double halfway() { \nreturn DIAMETER/2.0; \n} }");
        jScrollPane4.setViewportView(jTextArea_b);

        jTextArea_c.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea_c.setColumns(20);
        jTextArea_c.setEditable(false);
        jTextArea_c.setRows(5);
        jTextArea_c.setText("import static com.sun.scjp.Geodetics.*;\npublic class TerraCarta {\npublic double halfway() { \nreturn DIAMETER/2.0; \n} \n}");
        jScrollPane5.setViewportView(jTextArea_c);

        jTextArea_d.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea_d.setColumns(20);
        jTextArea_d.setEditable(false);
        jTextArea_d.setRows(5);
        jTextArea_d.setText("import com.sun.scjp.Geodetics;\npublic class TerraCarta { \npublic double halfway() { \nreturn Geodetics.DIAMETER/2.0; \n} \n}");
        jScrollPane6.setViewportView(jTextArea_d);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_a)
                            .addComponent(jRadioButton_c))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_d, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_b)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_a, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_c)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_d)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(387, 387, 387))
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

        if(a == true)
                verificaOpcaoQestoes++;
        if(b == true)
                verificaOpcaoQestoes++;
        if(c == true)
                verificaOpcaoQestoes++;
        if(d == true)
                verificaOpcaoQestoes++;

        
        if(verificaOpcaoQestoes == 2)
        {String para_nao_repetirAcertos ="";
           if(a == true && c == true)
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
        else if (verificaOpcaoQestoes == 0)
        {
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAOS());
            jLabel_status.setText("");
        }
        else if (verificaOpcaoQestoes == 1)
        {
            JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
            jLabel_status.setText("");
        }
         

        else if(verificaOpcaoQestoes > 2)
        {
            JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_DUAS_OPCAO());
            jLabel_status.setText("");
        }
           

            
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_a;
    private javax.swing.JTextArea jTextArea_b;
    private javax.swing.JTextArea jTextArea_c;
    private javax.swing.JTextArea jTextArea_d;
    // End of variables declaration//GEN-END:variables

    public ConteudoTextArea injetaInternacionalizacao()
    {
                try
                {
                      internacionalizacao.determinaPropriedadeTextArea1("q_13.textPTA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());

                      
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
     public ConteudoTextArea injetaInternacionalizacaoUSA()
    {
                try
                {
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_13.textENA1");
                      conteudo.setS_conteudoTextArea1(internacionalizacao.getConteudoTextArea1());
                      jTextArea1.setText(conteudo.getS_conteudoTextArea1());
   
                    
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
       jRadioButton_c.setEnabled(false);
       jRadioButton_d.setEnabled(false);
       jLabel_status.setVisible(true);
    }
      
    
    
}
