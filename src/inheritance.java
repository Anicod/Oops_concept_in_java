

public class inheritance {
    public static void main(String[] args) {

        int marks = 300;
        String name = "Animesh Raj";
        System.out.println(name + "and " + marks);
    }
}
class inheritance1 extends inheritance {
    int mage = 22;
    public static void main(String[] args) {
        inheritance1 p = new inheritance1();
        System.out.println(p.age);
        System.out.println(p.marks);
        System.out.println(p.name);
        p.student();

    }
}