package iphone.browser.widgets;

public interface Widget {
    public Double[] locGPS = new Double[]{0.0, 0.0};
    public class MapaTela {

    }
    public class WidgetTela {

    }
    void abrirMapa(Double[] locGPS);
    int ligarLugar(Double[]locGPS);

    void abrirClima(Double[] locGPS);
}
