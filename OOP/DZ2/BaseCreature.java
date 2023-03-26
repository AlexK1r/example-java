package OOP.DZ2;

/**
 * базовый класс живых существ
 */
public abstract class BaseCreature implements CreatureAction {

    String name;
    int age;
    Union union;
    int safety;
    int mood;
    Status status;

    String getName(){
        return name;
    }

    void metabolizm() {
    }

}