package OOP.DZ1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Так же нужны методы для удаления связей Node, например при редактировании.
 */
class GeoTree implements Reserch, Loaded<HashSet<Node>>, Saved<HashSet<Node>> {
    private final HashSet<Node> tree = new HashSet<>();

    /**
     * Отношения родитель <--> потомок
     *
     * @param parent   - родитель
     * @param children - потомок
     */
    public void addParent(Person parent, Person children) {
        if (checkPerson(parent, children)) { 
            return;
        }
        tree.add(new Node(parent, Relation.parent, children));      // родитель для потомка
        tree.add(new Node(children, Relation.children, parent));    // потомок для родителя
    }

    /**
     * Отношения муж <-> жена
     */
    public void addPartner(Person partner1, Person partner2) {
        if (checkPerson(partner1, partner2)) return;
        tree.add(new Node(partner1, Relation.partner, partner2));
        tree.add(new Node(partner2, Relation.partner, partner1));
    }

    /**
     * Проверка персон на null
     *
     * @param person1 - исходные персоны
     * @param person2 - исходные персоны
     * @return - true(если есть null)
     */
    private boolean checkPerson(Person person1, Person person2) {
        return (person1 == null || person2 == null);
    }

    @Override
    public HashSet<Node> load() {
        // здесь код для загрузки данных
        return null;
    }

    @Override
    public void Save(HashSet<Node> nodes) {
        // здесь код для записи данных
    }

    @Override
    public ArrayList<String> getParents(Person person) {
        return spend(person, Relation.children);
    }

    @Override
    public ArrayList<String> getChildren(Person person) {
        return spend(person, Relation.parent);
    }

    @Override
    public ArrayList<String> getBrotherSister(Person person) {
        ArrayList<Node> parents = new ArrayList<>();
        for (Node parent : this.tree) {     //собираем список родителей
            if (parent.getRe() == Relation.parent && parent.getP2().equals(person)) {
                parents.add(parent);        // в parents получили список родителей
                if (parents.size() > 1) break;
            }
        }
        HashSet<Person> brother_sister = new HashSet<>();
        for (Node parent : parents) {       // находим всех братьев и сестер
            for (Node t : this.tree) {
                if (parent.getP1().equals(t.getP1()) &&
                        t.getRe() == Relation.parent && //если отношение -> родитель
                        !t.getP2().equals(person)) {    //кроме самого person
                    brother_sister.add(t.getP2());
                }
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (Person p : brother_sister) {
            result.add(p.getFullName());
        }
        return result;
    }

    @Override
    public ArrayList<String> getPartners(Person person) {
        return spend(person, Relation.partner);
    }
    @Override
    public ArrayList<String> spend(Person person, Relation rel) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(person.getFullName()) && t.getRe() == rel) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node i : this.tree) {
            result.append(i.toString()+"\n");
        }
        return result.toString();
    }
}