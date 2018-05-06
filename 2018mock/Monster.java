public class Monster {

    protected int power;
    protected int health;

    private boolean defeated;

    private int toStringCount = 0;

    public Monster(int health, int power) {
        if(health <= 0)
            throw new IllegalArgumentException("The monster's beginning health must be larger than 0!");
        if(power <= 0)
            throw new IllegalArgumentException("The monster's attack power must be larger than 0!");

        this.health = health;
        this.power = power;
        defeated = false;
    }

    public int dealDamage() {
        return power;
    }

    public boolean isDefeated() {
        return defeated;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("The monster is defeated!");
            defeated = true;
        }
    }

    public String toString() {
        toStringCount++;
        return "Health: " + health + "\n"
            + "Power: " + power;
    }

}
