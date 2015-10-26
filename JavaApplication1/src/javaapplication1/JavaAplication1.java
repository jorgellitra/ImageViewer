package javaapplication1;
public class JavaAplication1 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram <>();
        for (int i = 0; i < 18; i++) {
            histogram.increment("gmail.com");
            
        }
        for (int i = 0; i < 28; i++) {
            histogram.increment("hotmail.com");
            
        }
        for (int i = 0; i < 13; i++) {
            histogram.increment("ull.com");
            
        }
        HistogramDisplay histograma = new HistogramDisplay(histogram);
        histograma.execute();
    }
    
}