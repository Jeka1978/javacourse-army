package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public interface Sender {
    void sendMessage(Message message);
    String myType();

}
