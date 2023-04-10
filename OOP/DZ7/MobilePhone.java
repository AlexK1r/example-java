public class MobilePhone extends Phone implements AnswerCall {
    @Override
    public void makeCall() {
        System.out.println("Звонок по мобильнику");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }


}