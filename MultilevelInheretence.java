import java.util.*;

class A {
    int roll;
    String name, address;
    Scanner sc = new Scanner(System.in);

    
}

class B extends A {
    void get() {
        System.out.println("Enter rollno,Name,Address: ");
        roll = sc.nextInt();
        name = sc.next();
        address = sc.next();
       
    }
}
class C extends B{
    void display() {
        System.out.println("ROLL: " + roll);
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS : " + address);
    }
}
public class MultilevelInheretence {
    public static void main(String[] args)

    {
        C obj=new C();
        obj.get();
        obj.display();
    }
}  
