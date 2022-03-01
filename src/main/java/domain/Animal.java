package domain;
//abstract class example
abstract class Animal {
    // absctract method to build.
    public abstract void sound();
}
 class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }
    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.sound();
    }
}