interface Father {
    void bringwater();
}

interface Mother {
    void bringwater();
}

public class Son implements Father, Mother {
    public void bringwater() {
        System.out.println("Brought water for Father and Mother");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.bringwater();
    }
}
