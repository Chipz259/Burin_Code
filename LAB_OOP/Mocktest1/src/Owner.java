public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner() {
        this("", null);
    }
    public Owner(String name) {
        this.name = name;
    }
    public Owner(Animal animal) {
        this("", animal);
    }
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
    public String getName() {
        return name;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void feedFood(Food f) {//
        this.animal.eat(f);
    }
    public String toString(){
        return "Owner : name = " + this.getName() + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
    public void protectOwnerFrom(Animal a) {
        if (this.animal instanceof Dog) {
            Dog d = (Dog) this.animal;
            d.kick(a);
        } else if (this.animal instanceof Pigeous) {
            Pigeous p = (Pigeous) this.animal;
            p.wingAttack(a);
        }
    }
}
