 class Animal {
    public void walk() {
        
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk in 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk in 2 legs");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}