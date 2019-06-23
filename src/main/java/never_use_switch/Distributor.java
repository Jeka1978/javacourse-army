package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.WHATSAPP;

/**
 * @author Evgeny Borisov
 */
@Component
public class Distributor {

    public void sendMessage(Message message) {
        String type = message.getDistributionType();
        switch (type) {
            case SMS:
                System.out.println(message.getContent() + " was sent by sms");
                break;
            case WHATSAPP:
                //50 lines of code
                System.out.println(message.getContent() + " was sent by whatsaap");
                break;

            default:
                throw new UnsupportedOperationException(type + " not supported yet");

        }
    }
}














