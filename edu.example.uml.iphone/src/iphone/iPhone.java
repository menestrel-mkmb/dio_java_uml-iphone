package iphone;

import iphone.browser.Browser;
import iphone.mediaPlayer.MediaPlayer;
import iphone.mediaPlayer.music.Music;
import iphone.mediaPlayer.video.Video;
import iphone.phone.Phone;
import iphone.phone.contact.Contato;

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

    @Override
    public void irSite(String[] siteURL) {

    }

    @Override
    public void voltarPagina() {

    }

    @Override
    public void avancarPagina() {

    }

    @Override
    public void recarregarPagina() {

    }

    @Override
    public void cancelarPagina() {

    }

    @Override
    public void abrirMapa(Double[] locGPS) {

    }

    @Override
    public int ligarLugar(Double[] locGPS) {
        return 0;
    }

    @Override
    public void abrirClima(Double[] locGPS) {

    }

    @Override
    public void tooglePlayerPause() {

    }

    @Override
    public void changeVideo(Video vid) {

    }

    @Override
    public void fowardMusic() {

    }

    @Override
    public void backwardMusic() {

    }

    @Override
    public void changeMusic(Music mus) {

    }

    @Override
    public void changePlaylist(List<Music> list) {

    }

    @Override
    public void buscarContato(Contato c) {

    }

    @Override
    public void ligarContato(Contato c) {

    }

    @Override
    public void ligarCaixaPostal() {

    }

    @Override
    public void abrirSMS(String sms) {

    }

    @Override
    public void enviarSMS(String sms) {

    }

    @Override
    public void ligarChamada(int numero) {

    }

    @Override
    public void desligarChamada(int numero) {

    }

    @Override
    public void trocarSomVivaVoz() {

    }

    @Override
    public void iniciarConferencia(int numero1, int numero2) {

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
