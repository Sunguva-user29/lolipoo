import java.util.*;

class A {
    int roll;
    String name, address;
    Scanner sc = new Scanner(System.in);

    void get() {
        System.out.println("Enter rollno,Name,Address: ");
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
       
    }
}

class B extends A {
    void display() {
        System.out.println("ROLL: " + roll);
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS : " + address);
    }
}

public class SingleLevelInheritence {
    public static void main(String[] args) {
        B obj=new B();
        obj.get();
        obj.display();

    }

}
