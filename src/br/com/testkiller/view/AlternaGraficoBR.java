package br.com.testkiller.view;

import br.com.testkiller.graficos.GraficoBR;

/**
 *
 * @author Thiago Araujo
 */
public class AlternaGraficoBR extends javax.swing.JPanel {

    /**
     * Creates new form AlternaGraficoBR
     */
    public AlternaGraficoBR(GraficoBR grafico1) {
       jPanel1 = new javax.swing.JPanel();
        jPanel_estatistica = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_corAcertosAzul = new javax.swing.JLabel();
        jLabel_corAcertosVerde = new javax.swing.JLabel();
        jLabel_corAcertosVermelho = new javax.swing.JLabel();
        jLabel_nao_feitas = new javax.swing.JLabel();
        jLabel_acertos = new javax.swing.JLabel();
        jLabel_erros = new javax.swing.JLabel();

        jPanel_estatistica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel_corAcertosAzul.setBackground(new java.awt.Color(51, 51, 255));
        jLabel_corAcertosAzul.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_corAcertosAzul.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Não Feitas:.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jLabel_corAcertosAzul.setOpaque(true);
        jLabel_corAcertosAzul.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_corAcertosAzulFocusGained(evt);
            }
        });

        jLabel_corAcertosVerde.setBackground(new java.awt.Color(0, 153, 0));
        jLabel_corAcertosVerde.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_corAcertosVerde.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acertos:.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jLabel_corAcertosVerde.setOpaque(true);

        jLabel_corAcertosVermelho.setBackground(new java.awt.Color(255, 0, 51));
        jLabel_corAcertosVermelho.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_corAcertosVermelho.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Erros:.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jLabel_corAcertosVermelho.setOpaque(true);

        jLabel_nao_feitas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_nao_feitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nao_feitas.setText("224");

        jLabel_acertos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_acertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_acertos.setText("0");

        jLabel_erros.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_erros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_erros.setText("0");

        javax.swing.GroupLayout jPanel_estatisticaLayout = new javax.swing.GroupLayout(jPanel_estatistica);
        jPanel_estatistica.setLayout(jPanel_estatisticaLayout);
        jPanel_estatisticaLayout.setHorizontalGroup(
            jPanel_estatisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_corAcertosAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_corAcertosVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_corAcertosVermelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_estatisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_estatisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_nao_feitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel_acertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_erros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_estatisticaLayout.setVerticalGroup(
            jPanel_estatisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_estatisticaLayout.createSequentialGroup()
                .addComponent(jLabel_corAcertosAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel_nao_feitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_corAcertosVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel_acertos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_corAcertosVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel_erros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_estatistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grafico1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_estatistica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }

    private void jLabel_corAcertosAzulFocusGained(java.awt.event.FocusEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    // Variables declaration - do not modify
    private br.com.testkiller.graficos.GraficoBR grafico1;
    private static javax.swing.JLabel jLabel_acertos;
    private javax.swing.JLabel jLabel_corAcertosAzul;
    private javax.swing.JLabel jLabel_corAcertosVerde;
    private javax.swing.JLabel jLabel_corAcertosVermelho;
    private static javax.swing.JLabel jLabel_erros;
    private static javax.swing.JLabel jLabel_nao_feitas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_estatistica;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration
}
