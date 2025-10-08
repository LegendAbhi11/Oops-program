class Parent{
void parent(){
    System.out.println("i am parent");
}
}
class Child extends Parent{
    void child(){
        System.out.println("i am child");
    }

}

class Child1 extends Child{
   void child1(){
    System.out.println("i am sub child");
   }
}

class Multilevel {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.parent();
        c.child();
        c.child1();
    }
    
}
