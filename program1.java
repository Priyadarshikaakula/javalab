class Super {
    void show() {
        System.out.println("I'm from Super class");
    }
}

class Sub extends Super {
    void display() {
        System.out.println("I'm from Sub class");
    }
}

class Intermediate extends Sub {
    @Override
    void show() {
        System.out.println("I'm from Intermediate class");
    }
}

public class Main {
    public static void main(String args[]) {
        Intermediate obj1 = new Intermediate();

        obj1.show();
        obj1.display();
        obj1.show();
    }
}