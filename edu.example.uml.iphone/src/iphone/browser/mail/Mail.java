package iphone.browser.mail;

import java.util.ArrayList;
import java.util.List;

public interface Mail {
    public List<Email> mailFolder = new ArrayList<>();
    public List<String> listaEmail = new ArrayList<>();
    String corpoTexto = "";
}
