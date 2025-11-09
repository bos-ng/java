class Person { }
class Student extends Person { }
class Researcher extends Person { }
class Professor extends Person { }

public class instanceofEx {
    static void print(Person p) {
        if (p instanceof Person)
            System.out.print("Person ");
        if (p instanceof Student)
            System.out.print("Person ");
        if (p instanceof Researcher)
            System.out.print("Person ");
        if (p instanceof Professor)
            System.out.print("Person ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> ");
        print(new Student());
        System.out.print("new Researcher() -> ");
        print(new Researcher());
        System.out.print("new Professor() -> ");
        print(new Professor());
    }
}
