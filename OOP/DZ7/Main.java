public class Main {
    public static void main(String[] args) {
        Phone huawei = new SmartPhone();
        MobilePhone alcatel = new MobilePhone();
        HomePhone vadic = new HomePhone();
        huawei.makeCall();
        alcatel.answerCall();
        alcatel.makeCall();
        vadic.answerCall();
    }
}