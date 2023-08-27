package iphone.phone;

import iphone.phone.contact.ListaContato;
import iphone.phone.dial.Dial;
import iphone.phone.inVoice.InVoice;
import iphone.phone.sms.SMS;

public interface Phone extends ListaContato, Dial, InVoice, SMS {
    int tipoRede = 0;

    void trocarTipoRede();
}
