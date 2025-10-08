class Parent{

    void parent(){
        System.out.println("THis is Parent() class");
    }
}
class Child extends Parent{

    void child(){
        System.out.println("this is Child() class");
    }
    public static void main(String[] args) {

        Child c=new Child();
        c.parent();
        c.child();

        
    }
}