package MultiFactory;
//静态工厂，不需要new实例，直接调用即可
public class SendFactory {
public static Sender produceMail(){
    return new MailSender();
}
public static Sender produceSms(){
    return  new SmsSender();
}
}
