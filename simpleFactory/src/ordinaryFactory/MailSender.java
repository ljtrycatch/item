package ordinaryFactory;

public class MailSender implements  Sender {
    //创建实现类
    @Override
    public void Send(){
        System.out.println("this is mailSender");
    }
}
