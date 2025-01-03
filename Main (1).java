package src;

interface Animals {
    void voice();
}
class Dog implements Animals {
    @Override
    public void voice() {System.out.println("Dog says: Woof!");}
    public void fetchBall() {System.out.println("Dog fetches the ball!");}
}
class Cat implements Animals {
    @Override
    public void voice() {System.out.println("Cat says: Meow!");}
    public void scratch() {System.out.println("Cat scratches the post!");}
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
        dog.fetchBall();

        Cat cat = new Cat();
        cat.voice();
        cat.scratch();
    }
}