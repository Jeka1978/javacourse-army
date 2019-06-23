package never_use_switch;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
import static never_use_switch.DistribConst.*;

/**
 * @author Evgeny Borisov
 */
@Component
public class MessageMockPopulator {

    private Random random = new Random();
    private List<String> types = asList(SMS, WHATSAPP,TELEGRAM);
    @Autowired
    private Faker faker;

    @Autowired
    private Distributor distributor;

    @Scheduled(fixedDelay = 1000)
    public void generateStamMessage() {
        String type = types.get(random.nextInt(types.size()));
        Message message = Message.builder().distributionType(type).content(faker.chuckNorris().fact()).build();
        distributor.sendMessage(message);
    }
}







