package OOP.DZ1;

class Node {
    private Person p1;//персона
    private Relation re; //родственное отношение
    private Person p2;//родственник

    public Node(Person person, Relation re, Person relative) {
        if (person == null || relative == null) return;
        this.p1 = person;
        this.re = re;
        this.p2 = relative;
    }

    //геттеры
    public Person getP1() {return p1;}
    public Person getP2() {return p2;}
    public Relation getRe() {return re;}

    @Override
    public String toString() {
        return String.format("%s,%s,%s", p1.getFullName(), re, p2.getFullName());
    }

    /**
     * переопределение HashCode для унакальности от p1.name,p2.name и re
     * так мы можем проверять ноды на уникальность по этим трем полям
     */
    @Override
    public int hashCode(){
       StringBuilder hash = new StringBuilder();
       hash.append(this.p1.getFullName().hashCode());
       hash.append(this.p2.getFullName().hashCode());
       hash.append(this.re.hashCode());
       return hash.hashCode();
    }
}