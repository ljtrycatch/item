package ordinaryFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce( "sms" );
        sender.Send();
        Sender sender1 =factory.produce( "mail" );
        sender1.Send();
    }
}
