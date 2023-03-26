package OOP.DZ2;

import java.util.Random;

public class Cat extends BaseCreature {

    /**
     * @param name      - кличка
     * @param union     - пол
     * @param age       - возраст
     */
    public Cat(String name, Union union, int age) {
        this.name = name;
        this.union = union;
        this.age = age;
        this.safety = 70;   //начальная сытость
        this.mood = 80;     //начальное настроение
        this.status = Status.sleep;
    }

    /**
     * обмен веществ
     * реакция на голод
     */
    @Override
    public void metabolizm() {
        this.mood = Math.min(this.mood, 100);
        if (this.mood > 50) {
            if (new Random().nextBoolean()) {
                this.status = Status.awake;
            } else {
                this.status = Status.sleep;
            }
        }
        this.safety -= 20;
        if (this.safety < 20) {
            this.status = Status.hungry;
            speak("Мяу! Мяяяуууу!");
        }
        if (this.safety <= 0) {
            this.safety = 0;
            speak("м..я....");
        }
    }

    /**
     * реакция на ласку
     */
    public void reaction() {
        if (this.status == Status.angry) {
            this.mood -= 20;
            System.out.println("Кошка разозлилась и вас оцарапала!");
        }
        if (this.safety > 40) {
            this.status = Status.awake;
            speak("Мур-Мур-Мур");
            this.mood += 40;
        } else {
            this.status = Status.angry;
            speak("ШШШШШШШ!!!!");
            this.mood *= 0.7;
        }
        this.metabolizm();
        viewParamCat();
    }

    /**
     * Голос
     */
    @Override
    public void speak() {
        this.speak("Мяу!");
    }

    public void speak(String voice) {
        System.out.println(voice);
    }

    @Override
    public void eat(Integer meal) {
        this.safety += meal;
        if (this.safety > 100) {
            this.safety = 100;
            this.status = Status.awake;
            this.mood = 100;
        } else {
            this.safety *= 1 + (meal / this.safety);
            this.mood += 70 * (meal / this.safety);
            this.mood = Math.min(this.mood, 100);
        }
        speak("Мурррр!!!!");
        viewParamCat();
    }

    /**
     * рекция на зов
     */
    @Override
    public void reply() {
        if (this.status == Status.angry) {
            return;                             //злая кошка не отзывается
        } 
        if (this.status == Status.sleep) {
            this.status = Status.walks;
        }
        speak();
        this.metabolizm();
        viewParamCat();
    }

    public void viewParamCat() {
        System.out.printf("%s --> сытость[%d] настроение[%d] состояние[%s]\n", this.name, this.safety, this.mood, this.status);
    }
}