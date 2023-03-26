package OOP.DZ2;

/**
 * базовые действия живых существ
 */
public interface CreatureAction {
    void speak();
    void eat(Integer meal);
    void reaction();
    void reply();
}