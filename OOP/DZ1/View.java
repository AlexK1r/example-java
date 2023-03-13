package OOP.DZ1;

/**
 * класс для визуализации данных в консоли
 */
class View {
    Reserch gTree;

    public View(Reserch geoTree) {
        this.gTree = geoTree;
    }
    public void viewParent(Person person) {
        System.out.printf("%s:  родители:  ", person.getFullName());
        System.out.println(this.gTree.getParents(person));
    }

    public void viewBrotherSister(Person person) {
        System.out.printf("%s:  братья/сёстры:  ", person.getFullName());
        System.out.println(this.gTree.getBrotherSister(person));
    }

    public void viewPartners(Person person) {
        System.out.printf("%s:  в браке:  ", person.getFullName());
        System.out.println(this.gTree.getPartners(person));
    }    

    public void viewChildren(Person person) {
        System.out.printf("%s:  дети:  ", person.getFullName());
        System.out.println(this.gTree.getChildren(person));
    }    

    public void viewAllData(){
        System.out.println(this.gTree.toString());
    }
}