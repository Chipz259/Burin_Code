public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    public Player(String name) {
        this.name = name;
    }
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public void setHP(int hp) {
        if (hp < 0) {
            hp = 0;
        } else if (hp > 20) {
            hp = 20;
        }
        this.hp = hp;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana) {
        if (mana < 0) {
            mana = 0;
        } else if (mana > 50) {
            mana = 50;
        }
        this.mana = mana;
    }
    public Houses getHouses() {
        return houses;
    }
    public void setHouses(Houses houses) {
        this.houses = houses;
    }
    public String toString(){
        return "[Player] : " + this.name + " HP: " + this.hp + " Mana: " + this.mana + " || " + this.houses;
    }
    public boolean equals(Player player) {
        if (this.name.equals(this.houses)) {
            return true;
        } else {
            return false;
        }
    }
    public void attack(Player target, Spell spell) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).attackSpell(this, target, spell);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }
    }
    public void protectFromPlayer(Player target) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).defense(this, target);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).defense(this, target);
        }
    }
}
