package OOP.DZ2;

public class Dog extends BaseCreature{
        public Dog(String name, Union union, int age) {
        this.name = name;
        this.union = union;
        this.age = age;
        this.safety = 60;   //начальная сытость
        this.mood = 90;     //начальное настроение
        this.status = Status.awake;
    }    
    
    @Override
    public void speak() {
        System.out.println("Гав! Гав!");
    }

    @Override
    public void eat(Integer meal) {
        System.out.println("Собака поела " + meal + " еды!");
    }

    @Override
    public void reaction() {

    }

    @Override
    public void reply() {
        if (this.status == Status.angry) {
            return;                             //злая собака не отзывается
        } 
        if (this.status == Status.sleep) {
            this.status = Status.walks;
        }
        speak();
        this.metabolizm();
        viewParamDog();
    }

    @Override
    public void metabolizm(){}

    public void viewParamDog() {
        //System.out.printf("%s --> сытость[%d] настроение[%d] состояние[%s]\n", this.name, this.safety, this.mood, this.status);
    }
}