import org.w3c.dom.ls.LSOutput;

public class oopsconcept {
    public static void main(String[] args) {
        System.out.println("hello world");
       //objects
        person p1  = new person();  //creating object by default constructor
        p1.name = "suresh";
        p1.age = 12;
        System.out.println(p1.age);
        System.out.println(p1.name);
        person p2 = new person(31, "mahesh");
       // p2.age = 23;
        //p2.name = "ramesh singh";
        p2.eat();
        p2.walk();
        p1.step(3);


    }
}


 class person{
    int age = 12;  //property
    String name = "animesh Raj";
    public person(){
        System.out.println("creating an object"); //default constructor
    }
    public person (int newage, String newname ){
        this(); // use to call one constructor through other constructor
        this.name = name;
        this.age = age;

    }
    void walk(){
        System.out.println(name+ " is walking"); //compile time polymorphism

    }
void eat(){
    System.out.println(name+ " is eating");
}
void step(int a){
    System.out.println(name+ " walking" +a); //compile time poylmorphism
}
}