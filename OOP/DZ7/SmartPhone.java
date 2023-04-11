public class SmartPhone extends Phone implements AnswerCall, Sms, Messenger, Mail {
    @Override
    public void makeCall() {
        System.out.println("Звоним по смартфону");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }    
   
    @Override
    public void sendSms() {
        System.out.println("Отправлен СМС");
    }

    @Override
    public void receiveSms() {
        System.out.println("Получен СМС");
    }
    
    @Override
    public void messeger() {
        System.out.println("Запущен мессенджер");
    }

    @Override
    public void sendMail() {
        System.out.println("Отправлено письмо");
    }

    @Override
    public void receiveMail() {
        System.out.println("Получено письмо");
    }
}