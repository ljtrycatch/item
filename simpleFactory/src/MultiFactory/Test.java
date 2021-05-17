package MultiFactory;

public class Test {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
        Sender sender1 = SendFactory.produceSms();
        sender1.send();
        Sender sender2 = SendFactory.produceMail();
        sender2.send();
    }
}
