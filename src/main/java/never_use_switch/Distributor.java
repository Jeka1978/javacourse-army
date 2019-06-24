package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Component
public class Distributor {

    private Map<String, Sender> map;

    @Autowired
    public Distributor(List<Sender> senders) {
        map = senders.stream()
                .collect(toMap(Sender::myType, identity()));
    }

    public void sendMessage(Message message) {
        String type = message.getDistributionType();
        Sender sender = map.get(type);

        if (sender == null) {
            throw new UnsupportedOperationException(type + " not supported yet");
        }
        sender.sendMessage(message);


    }
}














