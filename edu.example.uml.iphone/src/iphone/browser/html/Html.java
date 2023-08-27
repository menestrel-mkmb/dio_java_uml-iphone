package iphone.browser.html;

import java.util.ArrayList;
import java.util.List;

public interface Html {
    public String[] siteURL = new String[0];
    public List<String> siteHTML = new ArrayList<>();
    List<String> favoritosSites = new ArrayList<>();

    public void irSite(String[] siteURL);
    void voltarPagina();
    void avancarPagina();
    void recarregarPagina();
    void cancelarPagina();
}
