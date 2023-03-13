// Задача 1.
// Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом. 
// Идея: описать некоторое количество компонент, например:
// модель человека
// компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, 
// брат, свекровь, сестра и т. д.
// компонент для проведения исследований
// дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, 
// получение\построение отдельных моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека.

package OOP.DZ1;

public class Main {
    public static void main(String[] args) {
        Person oleg = new Person("Олег",Union.man,"879");
        Person igor = new Person("Игорь",Union.man,"912");
        Person olga = new Person("Ольга",Union.woman,"945");
        Person elena = new Person("Елена",Union.woman,"920");
        Person gosha = new Person("Гоша",Union.man,"961");
        Person anton = new Person("Антон",Union.man,"966");    

        GeoTree gt = new GeoTree();

        gt.addParent(oleg, igor);
        gt.addParent(oleg, olga);

        gt.addPartner(igor, elena);
        gt.addParent(igor, gosha);
        gt.addParent(elena, gosha);
        gt.addParent(igor, anton);
        gt.addParent(elena, anton);        

        new View(gt).viewParent(igor);
        new View(gt).viewBrotherSister(igor);
        new View(gt).viewPartners(igor);
        new View(gt).viewChildren(igor);
        new View(gt).viewBrotherSister(gosha);
        new View(gt).viewParent(gosha);
        //new View(gt).viewAllData();
    }
}
