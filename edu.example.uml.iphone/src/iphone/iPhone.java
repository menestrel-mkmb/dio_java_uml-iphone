package iphone;

import iphone.browser.Browser;
import iphone.mediaPlayer.MediaPlayer;
import iphone.phone.Phone;
import org.w3c.dom.DOMImplementation;

import java.util.ArrayList;
import java.util.List;

public class iPhone  implements Browser, MediaPlayer, Phone {
    public int orientacaoTela = 0;
    public int[] posXY = new int[]{0,0};
    public int volume = 100;
    public int estadoWifi = 0;
    public int estadoBth = 0;
    public List<String> appsAbertos = new ArrayList<>();

    public int getOrientacaoTela() {
        return orientacaoTela;
    }

    protected void setOrientacaoTela(int orientacaoTela) {
        this.orientacaoTela = orientacaoTela;
    }

    public void aumentarVolume() {

    }

    public void diminuirVolume() {

    }

    protected void retornarToque(int x, int y) {
        this.posXY = new int[] {x, y};
    }

    protected void toqueDuplo() {

    }

    protected void irParaHome() {

    }

    protected void bloquear() {

    }

    protected void desbloquear() {

    }

    public void abrirApp(int idApp) {

    }

    protected void trocarTela() {
        AppsAbertosTela recentes = new AppsAbertosTela();
    }

    protected void fecharApp() {

    }

    public void enviarNotificacao(int appId, String[] msgNotf) {

    }

    protected void ligarWifi() {

    }

    protected void desligarWifi() {

    }

    protected void conectarSSID(String[] ssid, String[] pwd) {

    }

    protected void desconectarSSID() {

    }

    protected void ligarBth() {

    }

    protected void desligarBth() {

    }

    protected void conectarBth(String[] name, String[] mac) {

    }

    protected void desconectarBth() {

    }

    public class InicioTela {
        public InicioTela() {
        }
    }

    public class AppsAbertosTela {
        public AppsAbertosTela() {
        }
    }

    public static void main(String[] args) {
        iPhone device = new iPhone();
    }

}
