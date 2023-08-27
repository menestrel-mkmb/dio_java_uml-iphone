package iphone.phone.dial;

public interface Dial {
    String[] chamadasRecentes = new String[0];
    String[] chamadasPerdidas = new String[0];

    void ligarChamada(int numero);
    void desligarChamada(int numero);
    void trocarSomVivaVoz();
    void iniciarConferencia(int numero1, int numero2);
}
