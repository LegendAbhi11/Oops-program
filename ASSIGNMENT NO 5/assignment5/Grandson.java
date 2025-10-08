interface Father {
    void bringwater();
}

interface Mother {
    void bringwater();
}

class Son implements Father, Mother {
    public void bringwater() {
        System.out.println("Brought water for Father and Mother");
    }
}

// Grandson extends Son (class inheritance)
public class Grandson extends Son {
    public void study() {
        System.out.println("Grandson is studying hard.");
    }

    public static void main(String[] args) {
        Grandson g = new Grandson();
        g.bringwater(); 
        g.study();
    }
}
