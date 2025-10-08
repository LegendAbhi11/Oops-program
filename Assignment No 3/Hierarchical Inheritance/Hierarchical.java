class Studentdata {
    int roll = 83;
    String name = "Ram", College = "SCOE";

    void studentdata() {
        System.out.println("\nRoll: " + roll + " Name: " + name + " Colllege:" + College);
    }

}

class Sem1 extends Studentdata {

    int m1 = 54, m2 = 45, m3 = 54, m4 = 56;
    int totalm = m1 + m2 + m3 + m4;

    void sem1() {
        System.out.println("M1:" + m1 + " M2:" + m2 + " M3:" + m3 + " M4:" + m4);
    }

    void tatal() {
        System.out.println("Total Marks: " + totalm );
    }
    void avg() {
        System.out.println("Average: " + totalm / 4+ "\n");
    }

}

class Sem2 extends Studentdata {
    int m1 = 34, m2 = 55, m3 = 52, m4 = 60;
    int totalm = m1 + m2 + m3 + m4;

    void sem2() {
        System.out.println("M1:" + m1 + " M2:" + m2 + " M3:" + m3 + " M4:" + m4);
    }

    void tatal() {
        System.out.println("Total Marks: " + totalm );
    }

    void avg() {
        System.out.println("Average: " + totalm / 4+ "\n");
    }
}

class Hierarchical {
    public static void main(String args[]) {
        Sem1 s1 = new Sem1();
        s1.studentdata();
        s1.sem1();
        s1.tatal();
        s1.avg();

        Sem2 s2 = new Sem2();
        s2.studentdata();
        s2.sem2();
        s2.tatal();
        s2.avg();
    }

}
