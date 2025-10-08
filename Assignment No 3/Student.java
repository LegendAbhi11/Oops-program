class Studentdata {
int roll=83;
String name="Ram",College="SCOE";
    void studentdata(){
        System.out.println("\nRoll: "+roll+" Name: "+name+" Colllege:"+College+"\n");
    }
    
}

class Sem1 extends Studentdata{

    int m1=54,m2=45,m3=54,m4=56;
    void sem1(){
        System.out.println("M1:"+m1+" M2:"+m2+" M3:"+m3+" M4:"+m4+"\n");
    }


}
class Sem2 extends Sem1{
 int m1=34,m2=55,m3=52,m4=60;
    void sem2(){
        System.out.println("M1:"+m1+" M2:"+m2+" M3:"+m3+" M4:"+m4+"\n");
    }
}
 class Student{
    public static void main(String args[]){
   Sem2 s=new Sem2();
   s.studentdata();
   s.sem1();
   s.sem2();
    }

 }

