package never_use_switch;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;

/**
 * @author Evgeny Borisov
 */
@Component(SMS)
@Profile("PROD")
//spring.profiles.active=PROD
public class SmsSender implements Sender {
    @Override
    public void sendMessage(Message message) {
        //50 lines of code
        System.out.println("sms was sent: " + message.getContent());
    }

    @Override
    public String myType() {
        return SMS;
    }

}