package ass2;
interface Detailinfo{
    void display();
    void count();
}
class person9 implements Detailinfo{
    String name;
    static int maxcount=20;
    person9(String name){
        this.name=name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void count() {
        System.out.println(name.length());
    }
}
public class NameCount {
    public static void main(String[] args) {
        person9 p=new person9("skjdfhweiu");
        p.display();
        p.count();

    }
}
