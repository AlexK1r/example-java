public class HomePhone extends Phone implements AnswerCall{
    @Override
    public void makeCall() {
        System.out.println("Звонок с обычного телефона");
    }

    @Override
    public void answerCall() {
        System.out.println("Входящий вызов. Снимаем трубку.");
    }
}