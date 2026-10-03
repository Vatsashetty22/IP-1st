class name constructor {

    String name;

    Student() 
    {
        name = "Vatsa";
    }

    void display() {
        System.out.println("My name is: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}