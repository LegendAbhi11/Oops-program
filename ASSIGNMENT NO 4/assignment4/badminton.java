abstract class maharashtra{
public abstract void fitness();
}
class player extends maharashtra{
public void fitness(){
    System.out.println("in fitness of plyer ");
}
}
public class badminton{
public static void main(String[] args) {
    player p1=new player();
    p1.fitness();
}
}