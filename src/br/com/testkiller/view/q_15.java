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
public class q_15 extends javax.swing.JPanel {

 private static boolean status_classe = false;
 private static String status_questao = "";
  private Internacionalizacao internacionalizacao = new Internacionalizacao();
 private ConteudoTextArea conteudo = new ConteudoTextArea();





    public q_15() {
        initComponents();
        injetaInternacionalizacao();
    }
    public static String getStatus_questao() {
        return status_questao;
    }

    public static void setStatus_questao(String status_questao) {
        q_15.status_questao = status_questao;
    }


   public static boolean isStatus_classe()
    {
        return status_classe;
    }

    public static void setStatus_classe(boolean status_classe)
    {
        q_15.status_classe = status_classe;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel_status = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea_c = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea_b = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea_a = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea_d = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton_a = new javax.swing.JRadioButton();
        jRadioButton_b = new javax.swing.JRadioButton();
        jRadioButton_c = new javax.swing.JRadioButton();
        jRadioButton_d = new javax.swing.JRadioButton();

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

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextArea_c.setColumns(20);
        jTextArea_c.setEditable(false);
        jTextArea_c.setRows(5);
        jTextArea_c.setText("import static com.sun.scjp.Geodetics.*;\npublic class TerraCarta {\npublic double halfway() { \nreturn DIAMETER/2.0; \n} \n}");
        jScrollPane9.setViewportView(jTextArea_c);

        jScrollPane9.setBounds(50, 230, 395, 100);
        jLayeredPane2.add(jScrollPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_b.setColumns(20);
        jTextArea_b.setEditable(false);
        jTextArea_b.setRows(5);
        jTextArea_b.setText("new Foo {\npublic int bar() { \nreturn 1; \n} \n}");
        jScrollPane10.setViewportView(jTextArea_b);

        jScrollPane10.setBounds(50, 120, 395, 96);
        jLayeredPane2.add(jScrollPane10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_a.setColumns(20);
        jTextArea_a.setEditable(false);
        jTextArea_a.setRows(5);
        jTextArea_a.setText("Foo {\npublic int bar() { \nreturn 1; \n} \n}");
        jScrollPane11.setViewportView(jTextArea_a);

        jScrollPane11.setBounds(50, 10, 395, 100);
        jLayeredPane2.add(jScrollPane11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea_d.setColumns(20);
        jTextArea_d.setEditable(false);
        jTextArea_d.setRows(5);
        jTextArea_d.setText("import com.sun.scjp.Geodetics;\npublic class TerraCarta { \npublic double halfway() { \nreturn Geodetics.DIAMETER/2.0; \n} \n}");
        jScrollPane13.setViewportView(jTextArea_d);

        jScrollPane13.setBounds(520, 10, 395, 113);
        jLayeredPane2.add(jScrollPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBounds(480, 10, 10, 320);
        jLayeredPane2.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_a.setText("A.");
        jRadioButton_a.setBounds(10, 10, 37, 23);
        jLayeredPane2.add(jRadioButton_a, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_b.setText("B.");
        jRadioButton_b.setBounds(10, 120, 35, 23);
        jLayeredPane2.add(jRadioButton_b, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_c.setText("C.");
        jRadioButton_c.setBounds(10, 230, 37, 23);
        jLayeredPane2.add(jRadioButton_c, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton_d.setText("D.");
        jRadioButton_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_dActionPerformed(evt);
            }
        });
        jRadioButton_d.setBounds(480, 10, 37, 23);
        jLayeredPane2.add(jRadioButton_d, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(821, 821, 821))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
        {
           String para_nao_repetirAcertos ="";
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
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JRadioButton jRadioButton_a;
    private javax.swing.JRadioButton jRadioButton_b;
    private javax.swing.JRadioButton jRadioButton_c;
    private javax.swing.JRadioButton jRadioButton_d;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
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
                      internacionalizacao.determinaPropriedadeTextArea1("q_15.textPTA1");
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
                      
                      internacionalizacao.determinaPropriedadeTextArea1("q_15.textENA1");
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
