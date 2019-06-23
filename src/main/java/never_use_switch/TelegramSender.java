package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.TELEGRAM;
import static never_use_switch.DistribConst.WHATSAPP;

/**
 * @author Evgeny Borisov
 */
@Component
public class TelegramSender implements Sender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("telegram!!!!");
    }

    @Override
    public String myType() {
        return WHATSAPP;
    }
}
