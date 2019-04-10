
package br.com.testkiller.graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;


 /*
 * @author Thiago Araujo
 */
public class PieChart3DDemo2 extends ApplicationFrame {

    
    public PieChart3DDemo2(String title) {

        super(title);

        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Questões: Acertos", new Double(43.2));
        data.setValue("Questões: Erradas", new Double(10.0));
        data.setValue("Questões: Perdidas", new Double(17.5));
        //data.setValue("", new Double(32.5));
        //data.setValue("", new Double(12.5));

        // create the chart...
        JFreeChart chart = ChartFactory.createPieChart3D(
            "Grafico Desenvolvido por Thiago Araujo",  //
            data,                   // data
            true,                   // include legend
            true,
            false
        );

        chart.setBackgroundPaint(Color.GREEN);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setDirection(Rotation.ANTICLOCKWISE);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.33);
        // add the chart to a panel...
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1500, 1270));
        setContentPane(chartPanel);

        Rotator rotator = new Rotator(plot);
        rotator.start();

    }

   
//    public static void main(String[] args) {
//
//        PieChart3DDemo2 demo = new PieChart3DDemo2("Grafico Desenvolvido por Thiago Araujo");
//        demo.pack();
//        RefineryUtilities.centerFrameOnScreen(demo);
//        demo.setVisible(true);
//
//    }

}


class Rotator extends Timer implements ActionListener {

    /** Plotagem */
    private PiePlot3D plot;

    /** Angulo */
    private int angle = 270;

    /**
     * Constructor.
     *
     * 
     */
    Rotator(PiePlot3D plot) {
        super(100, null);
        this.plot = plot;
        addActionListener(this);
    }

    /**
     * Evento do Butão
     */
    public void actionPerformed(ActionEvent event)
    {
        this.plot.setStartAngle(this.angle);
        this.angle = this.angle + 1;
        if (this.angle == 360) {
            this.angle = 0;
        }
    }

}