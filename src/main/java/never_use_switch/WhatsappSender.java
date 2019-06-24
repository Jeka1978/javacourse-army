package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.*;

/**
 * @author Evgeny Borisov
 */
@Component(WHATSAPP)
public class WhatsappSender implements Sender {
    @Override
    public void sendMessage(Message message) {
        //40 lines of code
        System.out.println("whatsapp was sent: "+message.getContent());
    }

    @Override
    public String myType() {
        return WHATSAPP;
    }

}






