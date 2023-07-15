class ParentClass {
    public void myMethod() {
        System.out.println("This is the parent class method.");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void myMethod() {
        System.out.println("This is the child class method.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.myMethod();
        child.myMethod();
    }
}
