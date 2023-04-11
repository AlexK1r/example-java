public class MobilePhone extends Phone implements AnswerCall, Sms {
    @Override
    public void makeCall() {
        System.out.println("Звонок по мобильнику");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }

    @Override
    public void sendSms() {
        System.out.println("Отправка СМС");
    }

    @Override
    public void receiveSms() {
        System.out.println("Получен СМС");
    }

}