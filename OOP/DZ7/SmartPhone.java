public class SmartPhone extends Phone implements AnswerCall {
    @Override
    public void makeCall() {
        System.out.println("Звоним по смартфону");
    }

    @Override
    public void answerCall() {
        System.out.println("Принимаем вызов");
    }    
   
    
}