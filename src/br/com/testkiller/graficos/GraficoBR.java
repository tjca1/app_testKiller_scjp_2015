package br.com.testkiller.graficos;

import br.com.testkiller.util.VariaveisConstantes;
import br.com.testkiller.view.TelaPrincipal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Thiago Araujo
 */
public final class GraficoBR extends JPanel
{

        private static DefaultPieDataset data;
        private static DefaultPieDataset dataUS;
        private ChartPanel chartPanel;
        private Handle handle;
        private static JFreeChart chart;
        private PiePlot3D plot;
        private Rotator rotator;
        
        /*true inicia , false para Rotator! */
        public  void  setStartStopRotator(boolean ss)
        {
            if(ss == true)
            {
               rotator.start();
            }else if(ss == false)
            {
                rotator.stop();
            }
        }

        public void setPreferenciaTamanhoGrafico(int altura, int largura)
        {
            chartPanel.setPreferredSize(new Dimension(altura, largura));
        }

        private static Double certos = 00.0 , n_feita = 100.0, erradas = 0.0;
        private static Integer  certosU = 0 , n_feitaU = 224, erradasU = 0;
        public static void setValueGrafico(String status, String Status_questao)
        {               
            /* SINCRONISMO COM O GRAFICO EM INGLES */
            
            GraficoUS.setValueGrafico(status, Status_questao);
            
            
            if(status.equals("Acertou"))
            {
                certos += 0.44;
                n_feita-=0.44;
                //
                certosU += 1;
                n_feitaU-=1;
                
            }
            else if(status.equals("Errou"))
            {
                erradas += 0.44;
                n_feita-=0.44;
                //
                erradasU += 1;
                n_feitaU-=1;
            }
            
            
            data.setValue(VariaveisConstantes.R_ERRADAS_DISPLAY_GRAFICO_BR, erradas);
            data.setValue(VariaveisConstantes.R_NAOFEITAS_DISPLAY_GRAFICO_BR, n_feita);
            data.setValue(VariaveisConstantes.R_CORREATAS_DISPLAY_GRAFICO_BR, certos);

            
            
            
             TelaPrincipal.setjLabel_Azul(n_feitaU.toString());
             TelaPrincipal.setjLabel_Verde(certosU.toString());
             TelaPrincipal.setjLabel_corVermelho(erradasU.toString());

            
        }

        public GraficoBR()
        {
                handle = new Handle();
                data = new DefaultPieDataset();
                dataUS = new DefaultPieDataset();


                chart = ChartFactory.createPieChart3D(
                    "Estatística",  //
                    data,                   // data
                    true,                   // inclui legenda
                    true,                   // ferramentas tipo
                    new Locale("pt", "BR") // internacionalização
                 );

                chart.setBackgroundPaint(Color.BLACK);
                plot = (PiePlot3D) chart.getPlot();
                plot.setStartAngle(270);
                plot.setDirection(Rotation.CLOCKWISE);
                plot.setForegroundAlpha(0.50f);
                plot.setInteriorGap(0.33);
                // adicionando o panel
                chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
                add(chartPanel);

                rotator = new Rotator(plot);
                setStartStopRotator(true);

                /*ouvintes */
                setValueGrafico("Inicio","");
            }


        class Handle implements ActionListener
        {

            public void actionPerformed(ActionEvent e)
            {
//                if(e.getSource() == ZoomMais)
//                {
//                    int altura = 1024;
//                    int largura = 760;
//                    setPreferenciaTamanhoGrafico(altura++,largura++);
//                    JOptionPane.showMessageDialog(null, altura+" -- "+ largura);
//
//                }
            }

        }

     class Rotator extends Timer implements ActionListener {

        /** Plotagem */
        private PiePlot3D plot;

        /** Angulo */
        private int angle = 270;



        /**
         * Constructor.
         **/
        Rotator(PiePlot3D plot) {
            super(100, null);
            this.plot = plot;
            addActionListener(this);
        }

        
        public void actionPerformed(ActionEvent event)
        {
            this.plot.setStartAngle(this.angle);
            this.angle = this.angle + 1;
            if (this.angle == 360) {
                this.angle = 0;
            }
        }

    }

}
