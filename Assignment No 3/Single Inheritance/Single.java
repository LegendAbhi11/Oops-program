class Parent {
    void parent() {
        System.out.println("i am parent");
    }

}

class Single extends Parent {
    void child() {
        System.out.println("i am child");
    }

    public static void main(String[] args) {
        Single p = new Single();
        p.parent();
        p.child();
    }

}