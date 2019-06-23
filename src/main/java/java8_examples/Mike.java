package java8_examples;

/**
 * @author Evgeny Borisov
 */
public class Mike implements Officer,Rasar {

    @Override
    public void talk() {
        Officer.super.talk();
        Rasar.super.talk();
    }

    public static void main(String[] args) {
        new Mike().talk();
    }
}


