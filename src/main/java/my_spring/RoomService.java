package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class RoomService {
    @InjectByType
    private Cleaner cleaner;



    public void doWork(){
        cleaner.clean();
    }
}
