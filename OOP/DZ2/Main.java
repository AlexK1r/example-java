package OOP.DZ2;

import OOP.DZ2.Human;

public class Main {
    public static int i = 1;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Human man = new Human("Vova", Union.man, 25);
        
        BaseCreature cat = new Cat("Milka", Union.woman, 2);
        Item item1 = new Item("a cup");
        Item item2 = new Item("an apple");
        Item item3 = new Item("a banana");
        Wardrobe wardrobe = new Wardrobe("шкаф в кухне", 5);

        // demka

        man.openWardbobe(wardrobe);                 //открыли дверь в шкаф
        stepDelimiter();
        man.call_cat(cat);                          //позвать кошку
        stepDelimiter();
        man.feed_to_cat(cat, 10);                   //покормить кошку
        stepDelimiter();
        man.pet_a_cat(cat);                         //приласкать кошку
        stepDelimiter();
        man.setItemInWardrobe(wardrobe, item1, 1);  //положить чашку в шкаф
        stepDelimiter();
        man.setItemInWardrobe(wardrobe, item2, 4);  //положить корм в шкаф
        stepDelimiter();
        man.viewInWardrobe(wardrobe);               //посмотрели предметы в шкафу
        stepDelimiter();
        man.setItemInWardrobe(wardrobe, item2, 4);  //положить корм в шкаф
        stepDelimiter();
        item1 = man.getItemInWardrobe(wardrobe, 4); //вынуть чашку из шкафа
        System.out.println(item1.getName());
        stepDelimiter();
        item2 = man.getItemInWardrobe(wardrobe, 1); //вынуть корм из шкафа
        System.out.println(item2.getName());
        stepDelimiter();
        man.setItemInWardrobe(wardrobe, item3,1);
        stepDelimiter();
        man.closeWardbobe(wardrobe);                //закрыли дверь шкафа
        stepDelimiter();
        man.viewInWardrobe(wardrobe);               //посмотрели предметы в шкафу
        stepDelimiter();
        man.openWardbobe(wardrobe);                 //открыли дверь
        stepDelimiter();
        man.viewInWardrobe(wardrobe);               //посмотрели предметы в шкафу
    }

    static void stepDelimiter(){
        System.out.println(" ----- ");
    }
}