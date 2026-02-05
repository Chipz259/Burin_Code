public abstract class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, 150, age);
    }
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
}
