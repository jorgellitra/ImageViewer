package javaapplication1;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String title) {
        super("HISTOGRAM");
        setContentPane(createPanel());
        pack();
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null,
                                                        "Dominios",
                                                        "Nº Emails",
                                                        dataset,
                                                        PlotOrientation.VERTICAL,false,false,false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset (){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "", "gmail.com");
        dataset.addValue(7, "", "ulpgc.es");
        dataset.addValue(5, "", "hotmail.com");
        return dataset;
    }

    public void execute(){
        setVisible(true);
    }
}
