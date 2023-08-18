public class j6 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.moves();

        Cheetah c = new Cheetah();
        c.moves();
    }
}

class Animal {
    void moves() {
        System.out.println("Moving");
    }
}

class Cheetah extends Animal {
    @Override void moves() {
        System.out.println("Running");
    }
}