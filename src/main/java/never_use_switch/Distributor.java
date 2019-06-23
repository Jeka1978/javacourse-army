package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Component
public class Distributor {


    @Autowired
    private Map<String, Sender> map;




    public void sendMessage(Message message) {
        String type = message.getDistributionType();
        Sender sender = map.get(type);

        if (sender == null) {
            throw new UnsupportedOperationException(type + " not supported yet");
        }
        sender.sendMessage(message);


    }
}














